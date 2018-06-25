
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class RMIClient {
    public static void main(String args[]){
        RMIClient client = new RMIClient();
        client.connectServer();
    }

    private void connectServer() {
       try{
          Registry reg = LocateRegistry.getRegistry("127.0.0.1",1099); 
          RMI rmi = (RMI) reg.lookup("server");
          System.out.println("connected to server");
          String text = rmi.getData("Hi, orish");
          System.out.println(text);
          text = rmi.getData("room type: executive");
          System.out.println(text);
          text = rmi.getData("coming in date: 21.6.2018");
          System.out.println(text);
          text = rmi.getData("departure date: 27.6.2018");
          System.out.println(text);
     
       }catch(Exception e){
           System.out.println(e);
       }
    }
}
