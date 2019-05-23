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
public class ThConta1 extends Thread {

    DatiCondivisi ptrDati;
    int num;
    int buffer;

    public ThConta1(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
        this.num = ptrDati.getNum();
        this.buffer = ptrDati.getBuffer();
    }

    @Override
    public void run() 
    {
        for (int i = 0; i < num; i++) 
        {
            ptrDati.waitSem1();
            buffer = ptrDati.getBuffer();
            if (buffer >= 1 && buffer <= 12) 
            {
                ptrDati.incDa1A12Letti();
                System.out.println("1 a 12 letti:" + ptrDati.getDa1A12Letti());
            }
            ptrDati.signalSem2();
        }
    }
}
