//package DataClassBadSmell;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.ExpressionStatement;
public class ExpressionStatementLister extends ASTVisitor {
	private int assignmentListerCounter = 0;
	public int getAssignmentListerCounter() {
	return assignmentListerCounter;
	}
	public boolean visit(ExpressionStatement node) {
	AssignmentLister visitor = new AssignmentLister();
	node.accept(visitor);
	assignmentListerCounter = visitor.getAssignmentListerCounter();
	return true;
	}
	}
