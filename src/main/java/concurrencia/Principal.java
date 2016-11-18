/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class Principal implements Runnable {
    //SEGUNDA FORMA DE CREAR THREADS IMPLEMENTANTO LA INTERFACE 
    //RUNNABLE USANDO POLIMORFISMO
    public static void main(String[] args) {
    //Runnable --> referencia de la clase
    Runnable r=new Principal();
    Thread t1 = new Thread(r);
    t1.setName("Juan");
    Thread t2 = new Thread(r);
    t2.setName("Ana");
    //t1.start();
    //t2.start();
    
    
    //TERCERA FORMA QUE VIENE EN EL EXAMEN
    //USANDO CLASES INTERNAS ANONIMAS
    
    Thread t3= new Thread(new Runnable(){
        @Override
        public void run() {
            while(true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            System.out.println("Soy un background Thread..");
            }
            }
        
    });
    t3.start();
    
    
    
    
    }
    

    

    //@Override;
    public void run() {
        /*
        System.out.println("Soy un Thread y me llamo "+ Thread.currentThread().getName());   
        if(Thread.currentThread().getName().equals("Ana")){
            System.out.println("Soy mujer");
        }else{
                    System.out.println("Soy Hombre");
        }
        
        }
        */
    }
    
}
