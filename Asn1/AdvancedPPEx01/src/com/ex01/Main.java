//icsd14134 - Bonis Athanasios
package com.ex01;

public class Main {
    //Αρχικά, δημιουργώ έναν πίνακα με τα γινόμενα πρώτων αριθμών
    private static long[] numbers = new long[]{18828731, 47603, 2579713, 54888247};

    public static void main(String[] args) {
        //Έχω υλοποιήσει τις δύο ζητούμενες περιπτώσεις σε δύο διαφορετικές μεθόδους
        System.out.println("----Threading Solution----");
        ThreadingSolution();
        System.out.println("----Non Threading Solution----");
        NonThreadingSolution();

    }

    private static void ThreadingSolution(){
        //Δημιουργώ ένα πίνακα απο την κλάση που έχω κάνει extends το Thread, 4 θέσεων, αφού τόσοι είναι οι αριθμοί που θέλω να υπολογίσω.
        ManagerThread[] Threads = new ManagerThread[4];
        //Θέτω την αρχή της χρονομέτρησης.
        long start = System.nanoTime();
        //Αρχικοποιω τα threads.
        for(int i=0;i<4;i++){
            Threads[i] = new ManagerThread(numbers[i]);
        }
        //Στη συνέχεια, ξεκινούν όλα τα threads
        for(ManagerThread thread : Threads)
            thread.start();
        //Χρησιμοποιώ την join για να περιμένουν τα thread.
        for(ManagerThread thread : Threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Βγάζω τον τελικό χρόνο εκτέλεσης και τον εμφανίζω.
        long elapsedTime = (System.nanoTime()) - start;
        System.out.println("Execution time of all threads: " + elapsedTime / 1e6 + " ms");
    }

    private static void NonThreadingSolution(){
        //Χωρίς την υλοποίηση threading,αρχικά δημιουργώ κατευθείαν, ένα αντικείμενο της κλάσης που υπολογίζει τους αριθμούς.
        SecurityManager sm = new SecurityManager();
        //Ξεκινά η χρονομέτρηση
        long startg = System.nanoTime();
        //Για κάθε αριθμό στον πίνακα, καλώ την συνάρτηση υπολογισμού απο την κλάση SecurityManager.
        for(long i : numbers){
            //Χρονομετρώ τον κάθε υπολογισμό με τον ίδιο ακριβώς τρόπο.
            long start = System.nanoTime();
            sm.findNumbers(i);
            long elapsedTime = (System.nanoTime()) - start;
            //Εμφανίζονται τα αποτελέσματα στην οθόνη.
            System.out.println(sm.toString() + " | " + elapsedTime / 1e6 + " ms");
        }
        //Τελειώνει η γενική χρονομέτρηση της διαδικασίας και εμφανίζεται στην οθόνη το αποτέλεσμα.
        long elapsedTimeg = (System.nanoTime()) - startg;
        System.out.println("Execution time: " + elapsedTimeg / 1e6 + " ms");
    }


}
