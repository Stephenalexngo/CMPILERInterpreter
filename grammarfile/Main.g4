grammar Main;	
// Starting Node	
start: (function_declaration)* main_function EOF;
// start: any_declaration EOF;

variable_type: INT_DEC | BOOLEAN_DEC | FLOAT_DEC | STRING_DEC;
number : INT_NUMBER | FLOAT_NUMBER ;

// Operators
logic_relational_operators: LESS | LESSQEUAL | GREATER | GREATEREQUAL | ANDAND | OROR | EQUAL;

// Parsers
statements: big_statements | small_statements;
big_statements: conditional_statement | loop_statement | scoping_statement;
small_statements: (print_statement | scan_statement | return_statement | any_declaration | function_calling | assignment_statement) SEMICOLON;

// Declarations
any_declaration: CONSTANT? (var_declaration | arr_declaration); 
var_declaration: float_declaration| int_declaration | string_declaration | boolean_declaration;
arr_declaration: float_arr_declaration | int_arr_declaration | string_arr_declaration | boolean_arr_declaration;
float_arr_declaration: FLOAT_DEC OPEN_BRACE CLOSE_BRACE LABEL (ASSIGN (CREATE FLOAT_DEC | LABEL) OPEN_BRACE expression CLOSE_BRACE)?;
int_arr_declaration: INT_DEC OPEN_BRACE CLOSE_BRACE LABEL (ASSIGN (CREATE INT_DEC | LABEL) OPEN_BRACE expression CLOSE_BRACE)?;
string_arr_declaration: STRING_DEC OPEN_BRACE CLOSE_BRACE LABEL (ASSIGN (CREATE STRING_DEC) OPEN_BRACE expression CLOSE_BRACE)?;
boolean_arr_declaration: BOOLEAN_DEC OPEN_BRACE CLOSE_BRACE LABEL (ASSIGN (CREATE BOOLEAN_DEC | LABEL) OPEN_BRACE expression CLOSE_BRACE)?;
float_declaration: FLOAT_DEC LABEL (ASSIGN (FLOAT_NUMBER | expression))?;
int_declaration: INT_DEC LABEL (ASSIGN (INT_NUMBER | expression))?;
string_declaration: STRING_DEC LABEL (ASSIGN STRING_TYPE)?;
boolean_declaration: BOOLEAN_DEC LABEL (ASSIGN (comparison_statement | LABEL))?;

// assignment statement
assignment_statement: LABEL (OPEN_BRACE expression CLOSE_BRACE)? ASSIGN (number | expression | STRING_TYPE | comparison_statement | LABEL (OPEN_BRACE expression CLOSE_BRACE)?);

// print statement
print_statement: PRINT OPEN_PAREN extended_value_print (PLUS extended_value_print)* CLOSE_PAREN;
extended_value_print: STRING_TYPE | LABEL | expression | function_calling;

// scan statement
scan_statement: SCAN OPEN_PAREN STRING_TYPE COMMA LABEL CLOSE_PAREN;

// return statement
return_statement: RETURN (STRING_TYPE | number | LABEL | expression | function_calling);

// arithmetic statement
expression: second_operator_expression;
second_operator_expression: second_operator_expression PLUS first_operator_expression | second_operator_expression MINUS first_operator_expression | first_operator_expression;
first_operator_expression: first_operator_expression DIV value_expression | first_operator_expression MULTI value_expression | first_operator_expression MOD value_expression | value_expression;
value_expression: number | OPEN_PAREN expression CLOSE_PAREN | function_calling | LABEL;

// comparison statement
comparison_statement: NOT? OPEN_PAREN? value_comparison (logic_relational_operators (value_comparison | comparison_statement))* CLOSE_PAREN? (logic_relational_operators (value_comparison | comparison_statement))?;
value_comparison: LABEL | number | STRING_TYPE | function_calling;

// conditional statement
conditional_statement: IF conditional_comparison_structure (ELSE_IF conditional_comparison_structure)* (ELSE THEN conditional_body)?;
conditional_comparison_structure: OPEN_PAREN comparison_statement CLOSE_PAREN THEN conditional_body;
conditional_body: left_bracket statements+ right_bracket;

// loop statement
loop_statement: (while_statement | for_statement);
while_statement: WHILE expression loop_structure;
for_statement: FOR loop_variable_declaration loop_structure;
loop_variable_declaration: (variable_type? LABEL (ASSIGN (number | LABEL | expression))? | expression);
loop_structure: (UP_TO | DOWN_TO) expression left_bracket statements* right_bracket;

// function calling
function_calling: LABEL OPEN_PAREN (function_paremeters_value (COMMA function_paremeters_value)*)? CLOSE_PAREN;
function_paremeters_value: LABEL | number | STRING_TYPE | expression | function_calling;

// function declaration
function_declaration: FUNC (variable_type (OPEN_BRACE CLOSE_BRACE)? | VOID) function_structure;
function_structure: LABEL OPEN_PAREN (function_declaration_parameters (COMMA function_declaration_parameters)*)? CLOSE_PAREN left_bracket statements+ right_bracket ;
function_declaration_parameters: variable_type (OPEN_BRACE CLOSE_BRACE)? LABEL;

// main function 
main_function : MAIN OPEN_PAREN CLOSE_PAREN left_bracket statements+ right_bracket;

// proper scoping
scoping_statement: OPEN_BRACKET statements+ CLOSE_BRACKET;

// predictive errors
left_bracket: OPEN_BRACKET | {notifyErrorListeners("Missing Left Bracket");};
right_bracket: CLOSE_BRACKET | {notifyErrorListeners("Missing Right Bracket");};

// Lexers
CREATE : 'create' ;
CONSTANT : 'constant' ;
RETURN : 'return' ;
PRINT : 'print' ;
SCAN : 'scan' ;
VOID : 'void' ;
FUNC : 'func' ;
MAIN : 'main' ;

IF : 'if' ;
ELSE : 'else' ;
ELSE_IF : 'else if' ;
THEN : 'then' ;

FOR : 'for' ;
UP_TO : 'up to' ;
DOWN_TO : 'down to' ;
WHILE : 'while' ;

INT_DEC : 'int' ; 
BOOLEAN_DEC : 'bool' ;
FLOAT_DEC : 'float';
STRING_DEC : 'String' ;

OPEN_PAREN : '(' ;
CLOSE_PAREN : ')';
OPEN_BRACKET : '{' ;
CLOSE_BRACKET : '}' ;
OPEN_BRACE : '[' ;
CLOSE_BRACE : ']' ;

LESS : '<';
LESSQEUAL : '<=';
GREATER : '>';
GREATEREQUAL : '>=';

PLUS : '+';
MINUS : '-';
MULTI : '*';
DIV : '/';
MOD : '%';

ANDAND : '&&';
OROR : '||';
NOT : '!';

ASSIGN : '=' ;
EQUAL : '==' ;
QUESTION : '?';
COLON : ':';
DOT : '.';
SEMICOLON : ';' ;
COMMA : ',' ;
UNDERSCORE : '_' ;
SINGLE_QUOTE : '\'' ;

STRING_TYPE: '"' ~('"')* '"' ;
INT_NUMBER: MINUS? DIGIT+; 
FLOAT_NUMBER: MINUS? DIGIT+ (DOT DIGIT+)?'f'?;
LABEL : LETTER LETTERORDIGIT* ;

LETTER:[a-zA-Z_];
DIGIT: [0-9];

fragment LETTERORDIGIT: DIGIT | LETTER;

BLOCKCOMMENT: '/*' .*? '*/' -> skip;
LINECOMMENT: '//' ~[\r\n]* -> skip;
WHITE_SPACE: [ \t\r\n]+ -> skip;