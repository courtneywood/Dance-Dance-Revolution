package client;

import java.io.IOException;
import java.net.Socket;

public class Client {
	public static ClientServerCommunicator csc;
	
	public Client() throws IOException 
	{
		DDR wGUI = new DDR();
		Socket s = wGUI.getSocket();
		csc = new ClientServerCommunicator(s);
	}
	
	public static void main(String[] args) throws IOException {
		Client clientDDR = new Client();
	}
}
