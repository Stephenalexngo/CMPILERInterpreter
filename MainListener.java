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
	 * Enter a parse tree produced by {@link MainParser#logic_relational_operators}.
	 * @param ctx the parse tree
	 */
	void enterLogic_relational_operators(MainParser.Logic_relational_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#logic_relational_operators}.
	 * @param ctx the parse tree
	 */
	void exitLogic_relational_operators(MainParser.Logic_relational_operatorsContext ctx);
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
	 * Enter a parse tree produced by {@link MainParser#big_statements}.
	 * @param ctx the parse tree
	 */
	void enterBig_statements(MainParser.Big_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#big_statements}.
	 * @param ctx the parse tree
	 */
	void exitBig_statements(MainParser.Big_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#small_statements}.
	 * @param ctx the parse tree
	 */
	void enterSmall_statements(MainParser.Small_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#small_statements}.
	 * @param ctx the parse tree
	 */
	void exitSmall_statements(MainParser.Small_statementsContext ctx);
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
	 * Enter a parse tree produced by {@link MainParser#second_operator_expression}.
	 * @param ctx the parse tree
	 */
	void enterSecond_operator_expression(MainParser.Second_operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#second_operator_expression}.
	 * @param ctx the parse tree
	 */
	void exitSecond_operator_expression(MainParser.Second_operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#first_operator_expression}.
	 * @param ctx the parse tree
	 */
	void enterFirst_operator_expression(MainParser.First_operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#first_operator_expression}.
	 * @param ctx the parse tree
	 */
	void exitFirst_operator_expression(MainParser.First_operator_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link MainParser#scoping_statement}.
	 * @param ctx the parse tree
	 */
	void enterScoping_statement(MainParser.Scoping_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#scoping_statement}.
	 * @param ctx the parse tree
	 */
	void exitScoping_statement(MainParser.Scoping_statementContext ctx);
}