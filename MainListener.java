// Generated from Main.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainParser}.
 */
public interface MainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MainParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MainParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MainParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(MainParser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(MainParser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MainParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MainParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MainParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MainParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(MainParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(MainParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#label_words}.
	 * @param ctx the parse tree
	 */
	void enterLabel_words(MainParser.Label_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#label_words}.
	 * @param ctx the parse tree
	 */
	void exitLabel_words(MainParser.Label_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#label_words_withoutsymbol}.
	 * @param ctx the parse tree
	 */
	void enterLabel_words_withoutsymbol(MainParser.Label_words_withoutsymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#label_words_withoutsymbol}.
	 * @param ctx the parse tree
	 */
	void exitLabel_words_withoutsymbol(MainParser.Label_words_withoutsymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#first_operators}.
	 * @param ctx the parse tree
	 */
	void enterFirst_operators(MainParser.First_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#first_operators}.
	 * @param ctx the parse tree
	 */
	void exitFirst_operators(MainParser.First_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#second_operators}.
	 * @param ctx the parse tree
	 */
	void enterSecond_operators(MainParser.Second_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#second_operators}.
	 * @param ctx the parse tree
	 */
	void exitSecond_operators(MainParser.Second_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(MainParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(MainParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#logical_operators}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operators(MainParser.Logical_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#logical_operators}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operators(MainParser.Logical_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#relational_operators}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operators(MainParser.Relational_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#relational_operators}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operators(MainParser.Relational_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#other_operators}.
	 * @param ctx the parse tree
	 */
	void enterOther_operators(MainParser.Other_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#other_operators}.
	 * @param ctx the parse tree
	 */
	void exitOther_operators(MainParser.Other_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#lexer_predefined_words}.
	 * @param ctx the parse tree
	 */
	void enterLexer_predefined_words(MainParser.Lexer_predefined_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#lexer_predefined_words}.
	 * @param ctx the parse tree
	 */
	void exitLexer_predefined_words(MainParser.Lexer_predefined_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#constant_words}.
	 * @param ctx the parse tree
	 */
	void enterConstant_words(MainParser.Constant_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#constant_words}.
	 * @param ctx the parse tree
	 */
	void exitConstant_words(MainParser.Constant_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#conditional_words}.
	 * @param ctx the parse tree
	 */
	void enterConditional_words(MainParser.Conditional_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#conditional_words}.
	 * @param ctx the parse tree
	 */
	void exitConditional_words(MainParser.Conditional_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#loop_words}.
	 * @param ctx the parse tree
	 */
	void enterLoop_words(MainParser.Loop_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#loop_words}.
	 * @param ctx the parse tree
	 */
	void exitLoop_words(MainParser.Loop_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#simple_punctuations}.
	 * @param ctx the parse tree
	 */
	void enterSimple_punctuations(MainParser.Simple_punctuationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#simple_punctuations}.
	 * @param ctx the parse tree
	 */
	void exitSimple_punctuations(MainParser.Simple_punctuationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#symbol_words}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_words(MainParser.Symbol_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#symbol_words}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_words(MainParser.Symbol_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MainParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MainParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#any_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAny_declaration(MainParser.Any_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#any_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAny_declaration(MainParser.Any_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#assigned_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssigned_expression(MainParser.Assigned_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#assigned_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssigned_expression(MainParser.Assigned_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#multiple_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_declaration(MainParser.Multiple_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#multiple_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_declaration(MainParser.Multiple_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#variable_declaration_vartype}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_vartype(MainParser.Variable_declaration_vartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#variable_declaration_vartype}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_vartype(MainParser.Variable_declaration_vartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#variable_declaration_no_vartype}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_no_vartype(MainParser.Variable_declaration_no_vartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#variable_declaration_no_vartype}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_no_vartype(MainParser.Variable_declaration_no_vartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#array_size}.
	 * @param ctx the parse tree
	 */
	void enterArray_size(MainParser.Array_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#array_size}.
	 * @param ctx the parse tree
	 */
	void exitArray_size(MainParser.Array_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#array_variable}.
	 * @param ctx the parse tree
	 */
	void enterArray_variable(MainParser.Array_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#array_variable}.
	 * @param ctx the parse tree
	 */
	void exitArray_variable(MainParser.Array_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#array_assign_body}.
	 * @param ctx the parse tree
	 */
	void enterArray_assign_body(MainParser.Array_assign_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#array_assign_body}.
	 * @param ctx the parse tree
	 */
	void exitArray_assign_body(MainParser.Array_assign_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#array_assign}.
	 * @param ctx the parse tree
	 */
	void enterArray_assign(MainParser.Array_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#array_assign}.
	 * @param ctx the parse tree
	 */
	void exitArray_assign(MainParser.Array_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#array_declaration_vartype}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration_vartype(MainParser.Array_declaration_vartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#array_declaration_vartype}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration_vartype(MainParser.Array_declaration_vartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#array_declaration_no_vartype}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration_no_vartype(MainParser.Array_declaration_no_vartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#array_declaration_no_vartype}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration_no_vartype(MainParser.Array_declaration_no_vartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(MainParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(MainParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#other_label_for_print_error}.
	 * @param ctx the parse tree
	 */
	void enterOther_label_for_print_error(MainParser.Other_label_for_print_errorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#other_label_for_print_error}.
	 * @param ctx the parse tree
	 */
	void exitOther_label_for_print_error(MainParser.Other_label_for_print_errorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#value_print}.
	 * @param ctx the parse tree
	 */
	void enterValue_print(MainParser.Value_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#value_print}.
	 * @param ctx the parse tree
	 */
	void exitValue_print(MainParser.Value_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#extended_value_print}.
	 * @param ctx the parse tree
	 */
	void enterExtended_value_print(MainParser.Extended_value_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#extended_value_print}.
	 * @param ctx the parse tree
	 */
	void exitExtended_value_print(MainParser.Extended_value_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void enterScan_statement(MainParser.Scan_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void exitScan_statement(MainParser.Scan_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#scan_body}.
	 * @param ctx the parse tree
	 */
	void enterScan_body(MainParser.Scan_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#scan_body}.
	 * @param ctx the parse tree
	 */
	void exitScan_body(MainParser.Scan_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#display_message_parameter}.
	 * @param ctx the parse tree
	 */
	void enterDisplay_message_parameter(MainParser.Display_message_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#display_message_parameter}.
	 * @param ctx the parse tree
	 */
	void exitDisplay_message_parameter(MainParser.Display_message_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#scan_label}.
	 * @param ctx the parse tree
	 */
	void enterScan_label(MainParser.Scan_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#scan_label}.
	 * @param ctx the parse tree
	 */
	void exitScan_label(MainParser.Scan_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#value_parameter}.
	 * @param ctx the parse tree
	 */
	void enterValue_parameter(MainParser.Value_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#value_parameter}.
	 * @param ctx the parse tree
	 */
	void exitValue_parameter(MainParser.Value_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(MainParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(MainParser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(MainParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(MainParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#return_value}.
	 * @param ctx the parse tree
	 */
	void enterReturn_value(MainParser.Return_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#return_value}.
	 * @param ctx the parse tree
	 */
	void exitReturn_value(MainParser.Return_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MainParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MainParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#array_label}.
	 * @param ctx the parse tree
	 */
	void enterArray_label(MainParser.Array_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#array_label}.
	 * @param ctx the parse tree
	 */
	void exitArray_label(MainParser.Array_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#value_expression}.
	 * @param ctx the parse tree
	 */
	void enterValue_expression(MainParser.Value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#value_expression}.
	 * @param ctx the parse tree
	 */
	void exitValue_expression(MainParser.Value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#alt_expression}.
	 * @param ctx the parse tree
	 */
	void enterAlt_expression(MainParser.Alt_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#alt_expression}.
	 * @param ctx the parse tree
	 */
	void exitAlt_expression(MainParser.Alt_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#alt_operator_expression}.
	 * @param ctx the parse tree
	 */
	void enterAlt_operator_expression(MainParser.Alt_operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#alt_operator_expression}.
	 * @param ctx the parse tree
	 */
	void exitAlt_operator_expression(MainParser.Alt_operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#alt_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void enterAlt_parenthesis_expression(MainParser.Alt_parenthesis_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#alt_parenthesis_expression}.
	 * @param ctx the parse tree
	 */
	void exitAlt_parenthesis_expression(MainParser.Alt_parenthesis_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#alt_first_expression_operator}.
	 * @param ctx the parse tree
	 */
	void enterAlt_first_expression_operator(MainParser.Alt_first_expression_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#alt_first_expression_operator}.
	 * @param ctx the parse tree
	 */
	void exitAlt_first_expression_operator(MainParser.Alt_first_expression_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#alt_second_expression_operator}.
	 * @param ctx the parse tree
	 */
	void enterAlt_second_expression_operator(MainParser.Alt_second_expression_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#alt_second_expression_operator}.
	 * @param ctx the parse tree
	 */
	void exitAlt_second_expression_operator(MainParser.Alt_second_expression_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#alt_value_expression}.
	 * @param ctx the parse tree
	 */
	void enterAlt_value_expression(MainParser.Alt_value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#alt_value_expression}.
	 * @param ctx the parse tree
	 */
	void exitAlt_value_expression(MainParser.Alt_value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#comparison_statement}.
	 * @param ctx the parse tree
	 */
	void enterComparison_statement(MainParser.Comparison_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#comparison_statement}.
	 * @param ctx the parse tree
	 */
	void exitComparison_statement(MainParser.Comparison_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(MainParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(MainParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#value_comparison}.
	 * @param ctx the parse tree
	 */
	void enterValue_comparison(MainParser.Value_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#value_comparison}.
	 * @param ctx the parse tree
	 */
	void exitValue_comparison(MainParser.Value_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(MainParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(MainParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#conditional_comparison_structure}.
	 * @param ctx the parse tree
	 */
	void enterConditional_comparison_structure(MainParser.Conditional_comparison_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#conditional_comparison_structure}.
	 * @param ctx the parse tree
	 */
	void exitConditional_comparison_structure(MainParser.Conditional_comparison_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#with_then}.
	 * @param ctx the parse tree
	 */
	void enterWith_then(MainParser.With_thenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#with_then}.
	 * @param ctx the parse tree
	 */
	void exitWith_then(MainParser.With_thenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#with_comparison}.
	 * @param ctx the parse tree
	 */
	void enterWith_comparison(MainParser.With_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#with_comparison}.
	 * @param ctx the parse tree
	 */
	void exitWith_comparison(MainParser.With_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#conditional_body}.
	 * @param ctx the parse tree
	 */
	void enterConditional_body(MainParser.Conditional_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#conditional_body}.
	 * @param ctx the parse tree
	 */
	void exitConditional_body(MainParser.Conditional_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MainParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MainParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_statement(MainParser.Else_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_statement(MainParser.Else_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(MainParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(MainParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(MainParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(MainParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#loop_conditional}.
	 * @param ctx the parse tree
	 */
	void enterLoop_conditional(MainParser.Loop_conditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#loop_conditional}.
	 * @param ctx the parse tree
	 */
	void exitLoop_conditional(MainParser.Loop_conditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#loop_structure}.
	 * @param ctx the parse tree
	 */
	void enterLoop_structure(MainParser.Loop_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#loop_structure}.
	 * @param ctx the parse tree
	 */
	void exitLoop_structure(MainParser.Loop_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#loop_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLoop_variable_declaration(MainParser.Loop_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#loop_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLoop_variable_declaration(MainParser.Loop_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expression(MainParser.Loop_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expression(MainParser.Loop_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(MainParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(MainParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(MainParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(MainParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#function_calling}.
	 * @param ctx the parse tree
	 */
	void enterFunction_calling(MainParser.Function_callingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#function_calling}.
	 * @param ctx the parse tree
	 */
	void exitFunction_calling(MainParser.Function_callingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(MainParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(MainParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#function_paremeters_value}.
	 * @param ctx the parse tree
	 */
	void enterFunction_paremeters_value(MainParser.Function_paremeters_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#function_paremeters_value}.
	 * @param ctx the parse tree
	 */
	void exitFunction_paremeters_value(MainParser.Function_paremeters_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(MainParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(MainParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#function_label}.
	 * @param ctx the parse tree
	 */
	void enterFunction_label(MainParser.Function_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#function_label}.
	 * @param ctx the parse tree
	 */
	void exitFunction_label(MainParser.Function_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#function_structure}.
	 * @param ctx the parse tree
	 */
	void enterFunction_structure(MainParser.Function_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#function_structure}.
	 * @param ctx the parse tree
	 */
	void exitFunction_structure(MainParser.Function_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#function_declaration_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_parameters(MainParser.Function_declaration_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#function_declaration_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_parameters(MainParser.Function_declaration_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#function_declaration_parameters_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_parameters_body(MainParser.Function_declaration_parameters_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#function_declaration_parameters_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_parameters_body(MainParser.Function_declaration_parameters_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#void_function}.
	 * @param ctx the parse tree
	 */
	void enterVoid_function(MainParser.Void_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#void_function}.
	 * @param ctx the parse tree
	 */
	void exitVoid_function(MainParser.Void_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#non_void_function}.
	 * @param ctx the parse tree
	 */
	void enterNon_void_function(MainParser.Non_void_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#non_void_function}.
	 * @param ctx the parse tree
	 */
	void exitNon_void_function(MainParser.Non_void_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#error_function}.
	 * @param ctx the parse tree
	 */
	void enterError_function(MainParser.Error_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#error_function}.
	 * @param ctx the parse tree
	 */
	void exitError_function(MainParser.Error_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#error_function_head}.
	 * @param ctx the parse tree
	 */
	void enterError_function_head(MainParser.Error_function_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#error_function_head}.
	 * @param ctx the parse tree
	 */
	void exitError_function_head(MainParser.Error_function_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#scoping_statement}.
	 * @param ctx the parse tree
	 */
	void enterScoping_statement(MainParser.Scoping_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#scoping_statement}.
	 * @param ctx the parse tree
	 */
	void exitScoping_statement(MainParser.Scoping_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(MainParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(MainParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#main_head}.
	 * @param ctx the parse tree
	 */
	void enterMain_head(MainParser.Main_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#main_head}.
	 * @param ctx the parse tree
	 */
	void exitMain_head(MainParser.Main_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#main_body}.
	 * @param ctx the parse tree
	 */
	void enterMain_body(MainParser.Main_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#main_body}.
	 * @param ctx the parse tree
	 */
	void exitMain_body(MainParser.Main_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#main_body_first}.
	 * @param ctx the parse tree
	 */
	void enterMain_body_first(MainParser.Main_body_firstContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#main_body_first}.
	 * @param ctx the parse tree
	 */
	void exitMain_body_first(MainParser.Main_body_firstContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#main_body_second}.
	 * @param ctx the parse tree
	 */
	void enterMain_body_second(MainParser.Main_body_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#main_body_second}.
	 * @param ctx the parse tree
	 */
	void exitMain_body_second(MainParser.Main_body_secondContext ctx);
}