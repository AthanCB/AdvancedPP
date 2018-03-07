package com.ex01;

public class Main {
    private static long[] numbers = new long[]{239818425947159L, 974069, 1079, 1643};

    public static void main(String[] args) {
        System.out.println("----Threading Solution----");
        ThreadingSolution();
        System.out.println("----Non Threading Solution----");
        NonThreadingSolution();
    }

    /*private static void ManagerAsRunnable(){
        Thread t1 = new Thread(new SecurityManager(numbers[0]));
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    private static void ThreadingSolution(){
        ManagerThread[] Threads = new ManagerThread[4];
        long start = System.nanoTime();
        for(int i=0;i<4;i++){
            Threads[i] = new ManagerThread(numbers[i]);
        }
        for(ManagerThread thread : Threads)
            thread.start();

        for(ManagerThread thread : Threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long elapsedTime = (System.nanoTime()) - start;
        System.out.println("Execution time of all threads: " + elapsedTime / 1e6 + " ms");
    }

    private static void NonThreadingSolution(){

        SecurityManager sm = new SecurityManager();
        long startg = System.nanoTime();
        for(long i : numbers){
            long start = System.nanoTime();
            sm.findNumbers(i);
            long elapsedTime = (System.nanoTime()) - start;
            System.out.println(sm.toString() + " | " + elapsedTime / 1e6 + " ms");
        }
        long elapsedTimeg = (System.nanoTime()) - startg;
        System.out.println("Execution time of all threads: " + elapsedTimeg / 1e6 + " ms");
    }


}