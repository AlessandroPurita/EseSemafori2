/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesemafori2;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aless
 */
public class DatiCondivisi {
    
    private int Da1A12Inseriti;
    private int Da13A24Inseriti;
    private int Da25A36Inseriti;
    private int Da1A12Letti;
    private int Da13A24Letti;
    private int Da25A36Letti;
    private int buffer;
    private int num;

   
    
    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;
    private Semaphore sem4;
    private Semaphore sem5;
    private Semaphore sem6;
    public DatiCondivisi( int num) 
    {
        this.sem1 = new Semaphore(0);
        this.sem2 = new Semaphore(0);
        this.sem3= new Semaphore(0);
        this.sem4=new Semaphore(1);
        this.sem5=new Semaphore(0);
        this.sem6=new Semaphore(0);
        this.num = num;
    }
    public void signalSem5()
    {
    sem5.release();
    
    }
    public void waitSem5()
    {
        try {
            sem5.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void signalSem6()
    {
    sem6.release();
    
    }
    public void waitSem6()
    {
        try {
            sem6.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void waitSem1()
    {
        try {
            sem1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void waitSem2()
    {
        try {
            sem2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void waitSem3()
    {
        try {
            sem3.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void waitSem4()
    {
        try {
            sem4.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void signalSem1()
    {
    
    sem1.release();
    
    }
    public void signalSem2()
    {
    
    sem2.release();
    }
    public void signalSem3()
    {
    
    sem3.release();
    }
    public void signalSem4()
    {
    
    sem4.release();
    }
    public synchronized void  incDa1A12Inseriti()
    {
    
    Da1A12Inseriti++;
    
    
    }
    public synchronized void  incDa13A24Inseriti()
    {
    
    Da13A24Inseriti++;
    
    
    }
    public synchronized void incDa25A36Inseriti()
    {
    
    Da25A36Inseriti++;
    
    
    }
    public synchronized void incDa25A36Letti()
    {
    
    Da25A36Letti++;
    
    }
    public synchronized void incDa1A12Letti()
    {
    
    Da1A12Letti++;
    
    }
    public synchronized void incDa13A24Letti()
    {
    
    Da13A24Letti++;
    
    }
     public void setDa1A12Inseriti(int Da1A12Inseriti) {
        this.Da1A12Inseriti = Da1A12Inseriti;
    }

    public void setDa13A24Inseriti(int Da13A24Inseriti) {
        this.Da13A24Inseriti = Da13A24Inseriti;
    }

    public void setDa25A36Inseriti(int Da25A36Inseriti) {
        this.Da25A36Inseriti = Da25A36Inseriti;
    }

    public void setDa1A12Letti(int Da1A12Letti) {
        this.Da1A12Letti = Da1A12Letti;
    }

    public void setDa13A24Letti(int Da13A24Letti) {
        this.Da13A24Letti = Da13A24Letti;
    }

    public void setDa25A36Letti(int Da25A36Letti) {
        this.Da25A36Letti = Da25A36Letti;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSem1(Semaphore sem1) {
        this.sem1 = sem1;
    }

    public void setSem2(Semaphore sem2) {
        this.sem2 = sem2;
    }

    public void setSem3(Semaphore sem3) {
        this.sem3 = sem3;
    }

    public void setSem4(Semaphore sem4) {
        this.sem4 = sem4;
    }

    public int getDa1A12Inseriti() {
        return Da1A12Inseriti;
    }

    public int getDa13A24Inseriti() {
        return Da13A24Inseriti;
    }

    public int getDa25A36Inseriti() {
        return Da25A36Inseriti;
    }

    public int getDa1A12Letti() {
        return Da1A12Letti;
    }

    public int getDa13A24Letti() {
        return Da13A24Letti;
    }

    public int getDa25A36Letti() {
        return Da25A36Letti;
    }

    public int getBuffer() {
        return buffer;
    }

    public int getNum() {
        return num;
    }

    public Semaphore getSem1() {
        return sem1;
    }

    public Semaphore getSem2() {
        return sem2;
    }

    public Semaphore getSem3() {
        return sem3;
    }

    public Semaphore getSem4() {
        return sem4;
    }
}
