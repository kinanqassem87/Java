import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JOptionPane;

public class Server extends UnicastRemoteObject implements RPrint{

	RPrint client;
	
	protected Server() throws RemoteException {
		super();
	}

	public static void main(String[] args) throws RemoteException {
		Server ser = null;
		
		try {
			ser = new Server();
			Naming.rebind("//127.0.0.1/server1", ser);
			System.out.println("server1 is ready now");

		} catch (Exception e) {
			System.out.println("error");
		}
		ser.initC();
		
		String input = JOptionPane.showInputDialog(null, "enter sentence to print on the server" );
		ser.client.print(input);
		
		
		
		
	}

	public void print(String msg) throws RemoteException {
		System.out.println(msg);
	}
	
	public void initC(){
		try {
			
			client = (RPrint) Naming.lookup("//127.0.0.1/server2");
			
		} catch (Exception e) {
			initC();
		}
	}

}
