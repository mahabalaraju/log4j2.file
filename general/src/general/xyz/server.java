package general.xyz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

public static void main(String[] args) throws IOException {
	

	Socket socket=null;
    InputStreamReader inputstreamreader=null;
    OutputStreamWriter outputstreamwriter=null;
    BufferedReader bufferedreader=null;
    BufferedWriter bufferedwriter=null;
    ServerSocket serversocket=null;
    		
    		serversocket=new ServerSocket(1233);
    
    		while(true) {
    			try {
    				socket=serversocket.accept();
    				
    				inputstreamreader=new InputStreamReader(socket.getInputStream());
    				outputstreamwriter =new OutputStreamWriter(socket.getOutputStream());
    				
    				bufferedreader =new BufferedReader(inputstreamreader);
    				bufferedwriter=new BufferedWriter(outputstreamwriter);
    				
    				while(true) {
    					String msgfromclient=bufferedreader.readLine();
    					System.out.println("client:"+msgfromclient);
    					bufferedwriter.write("msg recieved");
    					bufferedwriter.newLine();
    					bufferedwriter.flush();
    					
    					if(msgfromclient.equalsIgnoreCase("bye"));
    					break;
    					
    				}
    				socket.close();
    				bufferedreader.close();
    				bufferedwriter.close();
    				inputstreamreader.close();
    				outputstreamwriter.close();
    				
    				
    			}
    			catch(IOException e) {
    				e.printStackTrace();
    			}
    		}
}
}









