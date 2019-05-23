/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesemafori2;

import java.util.Random;

/**
 *
 * @author aless
 */
public class ThGenera extends Thread {

    DatiCondivisi ptrDati;
    int num;
    int buffer;

    public ThGenera(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
        this.num = ptrDati.getNum();
        this.buffer = ptrDati.getBuffer();
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
         ptrDati.waitSem4();
            buffer = rand.nextInt(36) + 1;
            if (buffer >= 1 && buffer <= 12) 
            {
                ptrDati.incDa1A12Inseriti();
                System.out.println("1 a 12 inseriti:"+ ptrDati.getDa1A12Inseriti());
            }
            if (buffer >= 13 && buffer <= 24)
            {
                ptrDati.incDa13A24Inseriti();
                System.out.println("13 a 24 inseriti:"+ ptrDati.getDa13A24Inseriti());
            }
            if (buffer >= 25 && buffer <= 36)
            {
                ptrDati.incDa25A36Inseriti();
                System.out.println("25 a 36 inseriti:"+ ptrDati.getDa25A36Inseriti());
            }
            ptrDati.setBuffer(buffer);
            ptrDati.signalSem1();
        }

    }

}
