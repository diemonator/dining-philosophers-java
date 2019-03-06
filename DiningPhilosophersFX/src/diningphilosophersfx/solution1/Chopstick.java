/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diningphilosophersfx.solution1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Joris
 */
public class Chopstick {
    private final Lock chopstickLock;
    private final int index;  // for debugging...

    public Chopstick(int i)
    {
        chopstickLock = new ReentrantLock();
        index = i;
    }
    
    public void get() {
        chopstickLock.lock();
        System.out.println(Thread.currentThread().getName() + ": get chopstick:" + index);
    }
    
    public void put() {
        System.out.println(Thread.currentThread().getName() + ": put chopstick:" + index);
        chopstickLock.unlock();
    }

}
