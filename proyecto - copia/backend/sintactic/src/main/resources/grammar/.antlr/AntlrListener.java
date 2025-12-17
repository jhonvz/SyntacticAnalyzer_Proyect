// Generated from c:/Users/velas/Desktop/proyecto - copia/backend/sintactic/src/main/resources/grammar/Antlr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrParser}.
 */
public interface AntlrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AntlrParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AntlrParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link AntlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(AntlrParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link AntlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(AntlrParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link AntlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(AntlrParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link AntlrParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(AntlrParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AntlrParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AntlrParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(AntlrParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(AntlrParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(AntlrParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(AntlrParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(AntlrParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(AntlrParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(AntlrParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(AntlrParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(AntlrParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(AntlrParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(AntlrParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link AntlrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(AntlrParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link AntlrParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AntlrParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link AntlrParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AntlrParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link AntlrParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterId(AntlrParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link AntlrParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitId(AntlrParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link AntlrParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParen(AntlrParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link AntlrParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParen(AntlrParser.ParenContext ctx);
}