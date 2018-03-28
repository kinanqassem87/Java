//package DataClassBadSmell;
import java.util.List;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.TypeDeclaration;
public class TypeDeclarationStatement extends ASTVisitor {
private boolean interfaceFlag = false;
private boolean abstractFlag = false;
public boolean getInterfaceFlag() {
	return interfaceFlag;
	}
	public boolean getAbstractFlag() {
	return abstractFlag;
	}
	public boolean visit(TypeDeclaration node) {
	abstractFlag = false;
	List temp = node.modifiers();
	for (int i = 0; i < temp.size(); i++) {
	if (temp.get(i).toString().equalsIgnoreCase("abstract"))
	abstractFlag = true;
	}
	if (node.isInterface())
	interfaceFlag = true;
	return true;
	}
	}
