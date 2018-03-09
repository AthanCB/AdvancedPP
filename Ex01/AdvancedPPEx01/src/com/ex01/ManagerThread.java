//icsd14134 - Bonis Athanasios
package com.ex01;

//Η κλάση ManagerThread κληρονομεί απο την κλάση Thread ώστε να εκτελέσει σε νήμα τους υπολογισμούς τον αριθμών.
public class ManagerThread extends Thread {
    private long number;
    //Δέχεται τον εκάστοτε αριθμό μέσω του Constructor.
    ManagerThread(long number){
        this.number = number;
    }
    //Υλοποιούμε την συνάρτηση run που εδώ θα τρέξει η κλήση της διαδικασίας υπολογισμού.
    public void run(){
        //Ξεκινά η χρονομέτρηση.
        long start = System.nanoTime();
        //Δημιουργώ ένα αντικείμενο της κλάσης που υπολογίζει τους αριθμούς.
        SecurityManager sm = new SecurityManager();
        //Καλώ τη συνάρτηση που υπολογίζει τους πρώτους.
        sm.findNumbers(number);
        //Τελειώνει η χρονομέτρηση και εμφανίζεται το αποτέλεσμα στην οθόνη.
        long elapsedTime = (System.nanoTime()) - start;
        System.out.println( sm.toString() + " | " + elapsedTime / 1e6 + " ms" );
    }
}
