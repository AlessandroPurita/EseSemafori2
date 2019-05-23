/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesemafori2;

/**
 *
 * @author aless
 */
public class ThConta2 extends Thread {

    DatiCondivisi ptrDati;
    int num;
    int buffer;

    public ThConta2(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
        this.num = ptrDati.getNum();
        this.buffer = ptrDati.getBuffer();
    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) 
        {
            ptrDati.waitSem2();
            buffer = ptrDati.getBuffer();
            if (buffer >= 13 && buffer <= 24) 
            {
             
                ptrDati.incDa13A24Letti();                
                System.out.println("13 a 24 letti:" + ptrDati.getDa13A24Letti());

            }
           ptrDati.signalSem3();
        }

    }
}
