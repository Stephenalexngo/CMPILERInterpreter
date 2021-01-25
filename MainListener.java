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
	 * Enter a parse tree produced by {@link MainParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(MainParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(MainParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#arr_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArr_declaration(MainParser.Arr_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#arr_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArr_declaration(MainParser.Arr_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#float_arr_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFloat_arr_declaration(MainParser.Float_arr_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#float_arr_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFloat_arr_declaration(MainParser.Float_arr_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#int_arr_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInt_arr_declaration(MainParser.Int_arr_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#int_arr_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInt_arr_declaration(MainParser.Int_arr_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#string_arr_declaration}.
	 * @param ctx the parse tree
	 */
	void enterString_arr_declaration(MainParser.String_arr_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#string_arr_declaration}.
	 * @param ctx the parse tree
	 */
	void exitString_arr_declaration(MainParser.String_arr_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#boolean_arr_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_arr_declaration(MainParser.Boolean_arr_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#boolean_arr_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_arr_declaration(MainParser.Boolean_arr_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#float_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFloat_declaration(MainParser.Float_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#float_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFloat_declaration(MainParser.Float_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#int_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInt_declaration(MainParser.Int_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#int_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInt_declaration(MainParser.Int_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void enterString_declaration(MainParser.String_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#string_declaration}.
	 * @param ctx the parse tree
	 */
	void exitString_declaration(MainParser.String_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#boolean_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_declaration(MainParser.Boolean_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#boolean_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_declaration(MainParser.Boolean_declarationContext ctx);
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