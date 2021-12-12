package application;

import java.net.*;
import java.io.*;

/**
 * @author Arafin
 *
 */
public class MyServer extends Thread{
	
	private ServerSocket serverSocket;
	private Socket server;
	private String ipAdd;
	
	public static boolean connected = false;
	
	public MyServer() {		
		try {
			serverSocket = new ServerSocket(3000); /*server instantiates a ServerSocket object,
			 										denoting which port number communication is to occur on. */
		    serverSocket.setSoTimeout(30000);
		} catch (IOException e) {
			
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				server = serverSocket.accept(); //This method waits until a client connects to the server on the given port
				
//				System.out.println(server + "This is server");
				ipAdd = server.getRemoteSocketAddress().toString();
				if(ipAdd != null) {
					connected = true;
				}
				MyController.arrayList.add(ipAdd);
			} catch(SocketTimeoutException e) {
	            break;
			} catch(NullPointerException e) {
	            break;
			} catch (IOException e) {
	            break;
			} catch(Exception e) {
				e.printStackTrace();
				break;
			}
			
			Handler.setSocketServer(server);
		}
	}
}
