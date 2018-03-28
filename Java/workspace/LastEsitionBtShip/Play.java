import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Play extends Remote{
	Result play(int x, int y) throws RemoteException, IOException;
}
