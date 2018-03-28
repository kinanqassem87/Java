//package DataClassBadSmell;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.ReturnStatement;
public class ReturnStatementLister extends ASTVisitor {
private int returnStatementCounter = 0;
public int getReturnStatementCounter() {
return returnStatementCounter;
}
public boolean visit(ReturnStatement node) {
returnStatementCounter = 1;
return true;
}
}
