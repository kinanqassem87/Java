//package DataClassBadSmell;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Block;
public class BlockLister extends ASTVisitor{
private int numberOfStatements;
public int getNumberOfStatements(){
return numberOfStatements;
}
public boolean visit(Block node) {
numberOfStatements = node.statements().size();
ReturnStatementLister visitor = new ReturnStatementLister();
node.accept(visitor);
numberOfStatements = numberOfStatements -
visitor.getReturnStatementCounter();
VariableDeclerationStatementLister visitor1 = new
VariableDeclerationStatementLister();
node.accept(visitor1);
numberOfStatements = numberOfStatements -
visitor1.getVariableDeclarationStatementCounter();
ExpressionStatementLister visitor2 = new
ExpressionStatementLister();
node.accept(visitor2);
numberOfStatements = numberOfStatements -
visitor2.getAssignmentListerCounter();
return true;
}
}
