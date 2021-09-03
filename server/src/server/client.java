
package server;

import java.net.Socket; 
import java.util.Scanner;

public class client {
    
    public static void main(String[] args) {
        try{ 
        
               Socket client= new Socket("localhost",1234);
               Scanner in=new Scanner(client.getInputStream());
               
               String msg=in.nextLine();
               System.out.println(msg);
               
               in.close();
              client.close();

  
        }
        catch(Exception e){
        
            System.out.println("Error "+e);
        }
    }
}
