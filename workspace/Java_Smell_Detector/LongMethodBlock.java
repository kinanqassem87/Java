//package LongMethodBadSmell;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Block;
public class LongMethodBlock extends ASTVisitor {
private int numberOfStatements;
public int getNumberOfStatements() {
return numberOfStatements;
}
public boolean visit(Block node) {
LongMethodBlock visitor = new LongMethodBlock();
int temp = visitor.getNumberOfStatements();
numberOfStatements = node.statements().size() + temp;
return true;
}
}
