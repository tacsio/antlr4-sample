// Generated from C:\Users\Tarcisio\Desktop\aaaaaaaa\new\MonitoringDSL.g4 by ANTLR 4.1
package listener;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import parser.MonitoringDSLParser;

/**
 * This class provides an empty implementation of {@link MonitoringDSLListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class MonitoringDSLBaseListener implements MonitoringDSLListener {
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterRoot(@NotNull MonitoringDSLParser.RootContext ctx) {}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitRoot(@NotNull MonitoringDSLParser.RootContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCondition(@NotNull MonitoringDSLParser.ConditionContext ctx) {
		System.out.println("Condition: " + ctx.getPayload().getText());
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCondition(@NotNull MonitoringDSLParser.ConditionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterExecutor(@NotNull MonitoringDSLParser.ExecutorContext ctx) {
		System.out.println("Executor: " + ctx.getPayload().getText());
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitExecutor(@NotNull MonitoringDSLParser.ExecutorContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterResource(@NotNull MonitoringDSLParser.ResourceContext ctx) {
		System.out.println("Resource: " + ctx.getChild(1).getText());
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitResource(@NotNull MonitoringDSLParser.ResourceContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterParams(@NotNull MonitoringDSLParser.ParamsContext ctx) {
		System.out.println("Params: " + ctx.getPayload().getText());
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitParams(@NotNull MonitoringDSLParser.ParamsContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterRelational_operator(@NotNull MonitoringDSLParser.Relational_operatorContext ctx) {
		System.out.println("Relational Operator: " + ctx.getPayload().getText());
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitRelational_operator(@NotNull MonitoringDSLParser.Relational_operatorContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterThreshold(@NotNull MonitoringDSLParser.ThresholdContext ctx) {
		System.out.println("Threshold value: " + ctx.getPayload().getText());
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitThreshold(@NotNull MonitoringDSLParser.ThresholdContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterConditions(@NotNull MonitoringDSLParser.ConditionsContext ctx) {
		int conditions = ctx.getChildCount() -1;
		if(conditions > 1){
			conditions = conditions - (conditions/2);
		}
		System.out.println("Number of conditions: " + conditions);
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitConditions(@NotNull MonitoringDSLParser.ConditionsContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMonitor_rule(@NotNull MonitoringDSLParser.Monitor_ruleContext ctx) {	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMonitor_rule(@NotNull MonitoringDSLParser.Monitor_ruleContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMetric(@NotNull MonitoringDSLParser.MetricContext ctx) { 
		System.out.println("Metric name: " + ctx.getPayload().getText());
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMetric(@NotNull MonitoringDSLParser.MetricContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTarget(@NotNull MonitoringDSLParser.TargetContext ctx) {
		System.out.println("Target: " +  ctx.getPayload().getText());
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTarget(@NotNull MonitoringDSLParser.TargetContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAction(@NotNull MonitoringDSLParser.ActionContext ctx) {
		System.out.println("Action: " + ctx.getPayload().getText());
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAction(@NotNull MonitoringDSLParser.ActionContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterValue(@NotNull MonitoringDSLParser.ValueContext ctx) {
		
		//TODO
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitValue(@NotNull MonitoringDSLParser.ValueContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMetric_name(@NotNull MonitoringDSLParser.Metric_nameContext ctx) {
		//TODO
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMetric_name(@NotNull MonitoringDSLParser.Metric_nameContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterActions(@NotNull MonitoringDSLParser.ActionsContext ctx) { 
		System.out.println("Number of actions: " + ctx.getChildCount());
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitActions(@NotNull MonitoringDSLParser.ActionsContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) {}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }
}