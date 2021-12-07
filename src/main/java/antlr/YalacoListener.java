// Generated from D:/Users/Matu/Documents/NetBeansProjects/ANTLR-Compiler/src/main/antlr\Yalaco.g4 by ANTLR 4.9.1
package antlr;

	import java.util.HashMap;
    import java.util.ArrayList;
    import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YalacoParser}.
 */
public interface YalacoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YalacoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(YalacoParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalacoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(YalacoParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalacoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YalacoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalacoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YalacoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalacoParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(YalacoParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalacoParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(YalacoParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalacoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(YalacoParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalacoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(YalacoParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalacoParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(YalacoParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalacoParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(YalacoParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalacoParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(YalacoParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalacoParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(YalacoParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalacoParser#printLineStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintLineStatement(YalacoParser.PrintLineStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalacoParser#printLineStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintLineStatement(YalacoParser.PrintLineStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalacoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(YalacoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalacoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(YalacoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalacoParser#truncExpression}.
	 * @param ctx the parse tree
	 */
	void enterTruncExpression(YalacoParser.TruncExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalacoParser#truncExpression}.
	 * @param ctx the parse tree
	 */
	void exitTruncExpression(YalacoParser.TruncExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YalacoParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(YalacoParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link YalacoParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(YalacoParser.DataContext ctx);
}