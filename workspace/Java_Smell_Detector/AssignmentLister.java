//package DataClassBadSmell;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Assignment;
public class AssignmentLister extends ASTVisitor {
private int assignmentListerCounter = 0;
public int getAssignmentListerCounter() {
return assignmentListerCounter;
}
public boolean visit(Assignment node) {
assignmentListerCounter++;
return true;
}
}
