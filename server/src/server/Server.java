
package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  
    public static void main(String[] args) {
        try{ 
        
               ServerSocket server = new ServerSocket(1234);
               Socket s=  server.accept();
               System.out.println("Start");
               String message="Hello";
               
               PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
               
               pw.write(message);
               pw.close();
               s.close();
               server.close();

  
        }
        catch(Exception e){
        
            System.out.println("Error "+e);
        }
    }
    
}
