package com.lorgio.labs.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lorgiotrinidad on 22-01-17.
 */
public class MyApp {

    public static void main(String[] args) {
        System.out.println("Enter text: ");
        EventSource eventSource = new EventSource();

        eventSource.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("Received response: "+ arg);
            }
        });

        new Thread(eventSource).start();
    }
}
