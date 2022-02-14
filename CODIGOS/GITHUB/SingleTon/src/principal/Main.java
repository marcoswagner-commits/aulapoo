package principal;

import java.util.logging.Level;
import java.util.logging.Logger;
import padroes.Singleton;

public class Main {

    
    public static void main(String[] args) {
                    
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
                
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
        
        Singleton s3 = Singleton.getInstance();
        System.out.println(s3);
        
        s1.finalize();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Singleton s4 = Singleton.getInstance();
        System.out.println(s4);
        
    }
    
}
