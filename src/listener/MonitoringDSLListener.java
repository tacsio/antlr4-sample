// Generated from C:\Users\Tarcisio\Desktop\aaaaaaaa\new\MonitoringDSL.g4 by ANTLR 4.1
package listener;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

import parser.MonitoringDSLParser;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MonitoringDSLParser}.
 */
public interface MonitoringDSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(@NotNull MonitoringDSLParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(@NotNull MonitoringDSLParser.RootContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull MonitoringDSLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull MonitoringDSLParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#executor}.
	 * @param ctx the parse tree
	 */
	void enterExecutor(@NotNull MonitoringDSLParser.ExecutorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#executor}.
	 * @param ctx the parse tree
	 */
	void exitExecutor(@NotNull MonitoringDSLParser.ExecutorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull MonitoringDSLParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull MonitoringDSLParser.ResourceContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull MonitoringDSLParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull MonitoringDSLParser.ParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(@NotNull MonitoringDSLParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(@NotNull MonitoringDSLParser.Relational_operatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#threshold}.
	 * @param ctx the parse tree
	 */
	void enterThreshold(@NotNull MonitoringDSLParser.ThresholdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#threshold}.
	 * @param ctx the parse tree
	 */
	void exitThreshold(@NotNull MonitoringDSLParser.ThresholdContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(@NotNull MonitoringDSLParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(@NotNull MonitoringDSLParser.ConditionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#monitor_rule}.
	 * @param ctx the parse tree
	 */
	void enterMonitor_rule(@NotNull MonitoringDSLParser.Monitor_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#monitor_rule}.
	 * @param ctx the parse tree
	 */
	void exitMonitor_rule(@NotNull MonitoringDSLParser.Monitor_ruleContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#metric}.
	 * @param ctx the parse tree
	 */
	void enterMetric(@NotNull MonitoringDSLParser.MetricContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#metric}.
	 * @param ctx the parse tree
	 */
	void exitMetric(@NotNull MonitoringDSLParser.MetricContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(@NotNull MonitoringDSLParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(@NotNull MonitoringDSLParser.TargetContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull MonitoringDSLParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull MonitoringDSLParser.ActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull MonitoringDSLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull MonitoringDSLParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#metric_name}.
	 * @param ctx the parse tree
	 */
	void enterMetric_name(@NotNull MonitoringDSLParser.Metric_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#metric_name}.
	 * @param ctx the parse tree
	 */
	void exitMetric_name(@NotNull MonitoringDSLParser.Metric_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MonitoringDSLParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(@NotNull MonitoringDSLParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MonitoringDSLParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(@NotNull MonitoringDSLParser.ActionsContext ctx);
}