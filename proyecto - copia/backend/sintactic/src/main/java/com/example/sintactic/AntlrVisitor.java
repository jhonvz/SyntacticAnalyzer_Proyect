// Generated from Antlr.g4 by ANTLR 4.13.1
package com.example.sintactic;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AntlrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface AntlrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AntlrParser#prog}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(AntlrParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link AntlrParser#stmt}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(AntlrParser.AssignStmtContext ctx);

	/**
	 * Visit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link AntlrParser#stmt}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(AntlrParser.ExprStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link AntlrParser#assignment}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AntlrParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(AntlrParser.PrimaryExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(AntlrParser.AddExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(AntlrParser.MulExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(AntlrParser.DivExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(AntlrParser.PowExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(AntlrParser.SubExprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link AntlrParser#primary}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AntlrParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link AntlrParser#primary}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(AntlrParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link AntlrParser#primary}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(AntlrParser.ParenContext ctx);
}