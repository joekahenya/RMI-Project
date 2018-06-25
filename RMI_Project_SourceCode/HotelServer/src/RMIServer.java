import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class RMIServer extends UnicastRemoteObject implements RMI{
    
    public RMIServer() throws RemoteException{
    super();
}

    @Override
    public String getData(String text) throws RemoteException {
        text= text;
        return text;
      }
    
    
    public static void main(String args[]){
        try{
           Registry reg = LocateRegistry.createRegistry(1099);
           reg.rebind("server", new RMIServer());
           System.out.println("Server Started");
           
           
           
        }catch(Exception e){
            System.out.println(e);
        }
    
    }
}
