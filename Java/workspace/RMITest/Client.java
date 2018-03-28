import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JOptionPane;

public class Client extends UnicastRemoteObject implements RPrint{

	
	protected Client() throws RemoteException {
		super();
		
	}

	public static void main(String[] args) {
		Client ser2;
		try {
			ser2 = new Client();
			Naming.rebind("//127.0.0.1/server2", ser2);
			System.out.println("server2 is ready now");

		} catch (Exception e) {
			System.out.println("error");
		}
		
		try {
			
			RPrint remote = (RPrint) Naming.lookup("//127.0.0.1/server1");
			String input = JOptionPane.showInputDialog(null, "enter sentence to print on the server" );
			remote.print(input);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void print(String msg) throws RemoteException {
		System.out.println(msg);
		
	}

}
