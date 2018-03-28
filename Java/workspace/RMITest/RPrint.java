import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RPrint extends Remote{
	void print(String msg) throws RemoteException;
}
