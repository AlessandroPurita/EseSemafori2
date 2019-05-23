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
public class ThConta3 extends Thread {

    DatiCondivisi ptrDati;
    int num;
    int buffer;

    public ThConta3(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
        this.num = ptrDati.getNum();
        this.buffer = ptrDati.getBuffer();
    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) 
        {
          ptrDati.waitSem3();
          buffer = ptrDati.getBuffer();
            if(buffer>=25&&buffer<=36)
            {
            ptrDati.incDa25A36Letti();
           System.out.println("25 a 36 letti:" + ptrDati.getDa25A36Letti());

            }
            ptrDati.signalSem4();
        }

    }

}
