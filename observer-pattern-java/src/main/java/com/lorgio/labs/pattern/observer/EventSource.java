package com.lorgio.labs.pattern.observer;

import java.util.Observable;
import java.util.Scanner;

/**
 * Created by lorgiotrinidad on 22-01-17.
 */
public class EventSource extends Observable implements Runnable {
    public void run() {
        while(true) {
            String response = new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }
}
