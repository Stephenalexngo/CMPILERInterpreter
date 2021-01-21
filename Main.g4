grammar Main;	
// Starting Node	
start: (LINECOMMENT)* (function_declaration)* main_function EOF;
// start: any_declaration EOF;

// main function 
main_function : MAIN OPEN_PAREN CLOSE_PAREN OPEN_BRACKET statements+ CLOSE_BRACKET;

variable_type: (INT_DEC | BOOLEAN_DEC | FLOAT_DEC | STRING_DEC) ;
number : INT_NUMBER | FLOAT_NUMBER ;

// Operators
first_operators : (MULTI | DIV | MOD) ;
second_operators : (PLUS | MINUS) ;
logic_relational_operators: (LESS | LESSQEUAL | GREATER | GREATEREQUAL | ANDAND | OROR | EQUAL) ;

// Parsers
statements
    : big_statements
    | small_statements
    | LINECOMMENT
    ;

big_statements
    : (conditional_statement | loop_statement | constant_declaration | scoping_statement) LINECOMMENT? 
    ;

small_statements
    : (print_statement | scan_statement | return_statement | any_declaration | function_calling) SEMICOLON LINECOMMENT?
    ;

// Declarations
any_declaration 
    : variable_declaration_vartype
    | variable_declaration_no_vartype
    | array_declaration_vartype
    | array_declaration_no_vartype
    ; 

assigned_expression
    : (STRING_TYPE | number | LABEL | expression | comparison_statement | function_calling) 
    ;

multiple_declaration
    : LABEL (ASSIGN assigned_expression)?
    ;

variable_declaration_vartype
    : variable_type multiple_declaration (COMMA multiple_declaration)*
    ;

variable_declaration_no_vartype
    : LABEL ASSIGN assigned_expression 
    ;

array_variable 
    : LABEL OPEN_BRACE expression CLOSE_BRACE
    ;

array_assign_body
    : CREATE variable_type OPEN_BRACE expression CLOSE_BRACE
    ;

array_assign
    :  ASSIGN array_assign_body
    |  ASSIGN (array_variable | assigned_expression)
    ;

array_declaration_vartype
    : variable_type OPEN_BRACE CLOSE_BRACE LABEL array_assign?
    ;

array_declaration_no_vartype
    : array_variable array_assign
    ;
 
// print statement
print_statement
    : PRINT OPEN_PAREN extended_value_print (PLUS extended_value_print)* CLOSE_PAREN
    ;

extended_value_print
    : STRING_TYPE
    | LABEL
    | expression
    | function_calling
    ;

// scan statement
scan_statement
    : SCAN OPEN_PAREN STRING_TYPE COMMA LABEL CLOSE_PAREN
    ;

// constant declaration
constant_declaration 
    : CONSTANT any_declaration
    ;

// return statement
return_statement
    : RETURN return_value
    ;

return_value
    : (STRING_TYPE | number | LABEL | expression | function_calling)
    ;

// arithmetic statement
expression
    : second_operator_expression
    ;

second_operator_expression
    : second_operator_expression second_operators first_operator_expression 
    | first_operator_expression
    ;

first_operator_expression
    : first_operator_expression first_operators value_expression
    | value_expression
    ;

value_expression
    : number
    | OPEN_PAREN expression CLOSE_PAREN
    | function_calling
    | LABEL
    ;

// comparison statement
comparison_statement
    : NOT? OPEN_PAREN? value_comparison (logic_relational_operators (value_comparison | comparison_statement))* CLOSE_PAREN? (logic_relational_operators (value_comparison | comparison_statement))?
    ;

value_comparison
    : LABEL
    | number
    | expression
    | STRING_TYPE
    | function_calling
    ;

// conditional statement
conditional_statement
    : if_statement else_if_statement* else_statement? 
    ;

conditional_comparison_structure
    : OPEN_PAREN comparison_statement CLOSE_PAREN THEN conditional_body
    ;

conditional_body
    : OPEN_BRACKET statements+ CLOSE_BRACKET
    ;

if_statement
    : IF conditional_comparison_structure
    ;

else_if_statement
    : ELSE_IF conditional_comparison_structure
    ;

else_statement
    : ELSE THEN conditional_body
    ;

// loop statement
loop_statement
    : while_statement
    | for_statement
    ;

loop_conditional
    : UP_TO
    | DOWN_TO
    ;

loop_structure
    : loop_conditional expression OPEN_BRACKET statements* CLOSE_BRACKET
    ;

loop_variable_declaration
    : variable_type? LABEL (ASSIGN loop_expression)?
    | expression
    ;

loop_expression
    : (number | LABEL | expression)
    ;

while_statement
    : WHILE expression loop_structure
    ;

for_statement
    : FOR loop_variable_declaration loop_structure
    ;

// function calling
function_calling
    : LABEL OPEN_PAREN function_parameters? CLOSE_PAREN
    ;

function_parameters
    : function_paremeters_value (COMMA function_paremeters_value)*
    ; 

function_paremeters_value
    : (LABEL | expression | STRING_TYPE | number | function_calling)
    ;

// function declaration
function_declaration
    : void_function
    | non_void_function
    ;

function_structure
    : LABEL OPEN_PAREN function_declaration_parameters? CLOSE_PAREN OPEN_BRACKET statements+ CLOSE_BRACKET 
    ;

function_declaration_parameters
    : variable_type (OPEN_BRACE CLOSE_BRACE)? LABEL function_declaration_parameters_body?
    ;

function_declaration_parameters_body
    : COMMA function_declaration_parameters
    ;

void_function
    : FUNC VOID function_structure
    ;

non_void_function
    : FUNC variable_type (OPEN_BRACE CLOSE_BRACE)? function_structure
    ;

// proper scoping
scoping_statement
    : OPEN_BRACKET statements+ CLOSE_BRACKET
    ;

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
STRING_DEC : 'STRING' ;

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
FLOAT_NUMBER: MINUS? DIGIT+ (DOT DIGIT+)?'f';
LABEL : LETTER LETTERORDIGIT* ;

LETTER:[a-zA-Z_];
DIGIT: [0-9];

fragment LETTERORDIGIT: DIGIT | LETTER;

LINECOMMENT
    : '//' ~[\r\n]*
    ;

WHITE_SPACE: [ \t\r\n]+ -> skip;