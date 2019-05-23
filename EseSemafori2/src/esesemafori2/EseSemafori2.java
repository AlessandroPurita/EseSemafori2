/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesemafori2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aless
 */
public class EseSemafori2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Scanner input = new Scanner(System.in);
            int num;
            System.out.println("Inserisci il numero di numeri da generare");
            num = input.nextInt();
            
            DatiCondivisi ptrDati = new DatiCondivisi(num);
            ThGenera thg = new ThGenera(ptrDati);
            ThConta1 thc1 = new ThConta1(ptrDati);
            ThConta2 thc2 = new ThConta2(ptrDati);
            ThConta3 thc3 = new ThConta3(ptrDati);
            
            thg.start();
            thc1.start();
            thc2.start();
            thc3.start();
            
            
            thg.join();
            thc1.join();
            thc2.join();
            thc3.join();
            
            System.out.println("Fine programma");
        } catch (InterruptedException ex) {
            Logger.getLogger(EseSemafori2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
