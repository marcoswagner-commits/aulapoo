package padroes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author marcos_wagner
 */
public class Singleton {
    
    private String dataBase;
    private String porta;
    private String status;
    private String momento;
    
    private static Singleton instance = null;

    private Singleton(String dataBase, String porta, String status, String momento) {
        this.dataBase = dataBase;
        this.porta = porta;
        this.status = status;
        this.momento = new SimpleDateFormat("HH:mm:ss").format(new Date());
     }
    
    @Override
    public void finalize() {
        instance = null;
    }

   
    
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton("DBClientes", "3301","conectado","15:16:22");
        return instance;
    }

    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }

    @Override
    public String toString() {
        return "Singleton{" + "dataBase=" + dataBase + ", porta=" + porta + ", status=" + status + ", momento=" + momento + '}';
    }

   
    
    
}
