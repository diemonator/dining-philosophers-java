/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diningphilosophersfx.solution2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Chopstick {
    private final int index;  // for debugging...
    private boolean used;
    
    public Chopstick(int i)
    {
        used = false;
        index = i;
    }
    
    public void get() {
        used = true;
        System.out.println(Thread.currentThread().getName() + ": get chopstick:" + index);
    }
    
    public void put() {
        System.out.println(Thread.currentThread().getName() + ": put chopstick:" + index);
        used = false;
    }
    
    public boolean isUsed() {
        return used;
    }
}
