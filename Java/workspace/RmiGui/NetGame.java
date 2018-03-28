import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.JLabel;
public interface NetGame extends Remote{
	public void play(String seelected) throws RemoteException;
}
