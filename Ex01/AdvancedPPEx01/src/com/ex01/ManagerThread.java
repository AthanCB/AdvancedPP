package com.ex01;

public class ManagerThread extends Thread {
    private long number;
    ManagerThread(long number){
        this.number = number;
    }
    public void run(){
        long start = System.nanoTime();
        SecurityManager sm = new SecurityManager();
        sm.findNumbers(number);
       // System.out.println(sm.toString());
        long elapsedTime = (System.nanoTime()) - start;
        System.out.println( sm.toString() + " | " + elapsedTime / 1e6 + " ms" );
    }
}
