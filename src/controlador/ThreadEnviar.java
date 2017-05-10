package controlador;

import model.Partida;
import model.Serp;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * Created by Grup 6 on 13/04/2017.
 */
public class ThreadEnviar extends Thread {
    private DataOutputStream doStream;
    private ObjectOutputStream doStreamO; // = new ObjectOutputStream(sClient.getOutputStream());
    private Scanner sc;
    private Serp serp;

    public ThreadEnviar(Scanner sc, DataOutputStream doStream, ObjectOutputStream doStreamO, Serp serp){
        this.doStream = doStream;
        this.doStreamO = doStreamO;
        this.sc = sc;
        this.serp = serp;
    }
    @Override
    public void run(){
        try{
            while (true){

                doStreamO.writeObject(serp);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
