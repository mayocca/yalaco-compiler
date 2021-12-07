// Generated from D:/Users/Matu/Documents/NetBeansProjects/ANTLR-Compiler/src/main/antlr\Yalaco.g4 by ANTLR 4.9.1
package antlr;

	import java.util.HashMap;
    import java.util.ArrayList;
    import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YalacoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YalacoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YalacoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(YalacoParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalacoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(YalacoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalacoParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(YalacoParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalacoParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(YalacoParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalacoParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(YalacoParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalacoParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(YalacoParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalacoParser#printLineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintLineStatement(YalacoParser.PrintLineStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalacoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(YalacoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalacoParser#truncExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncExpression(YalacoParser.TruncExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YalacoParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(YalacoParser.DataContext ctx);
}