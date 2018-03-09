//icsd14134 - Bonis Athanasios
package com.ex01;

//Η κλάση SecurityManager είναι υπεύθυνη για τον υπολογισμό των δύο πρώτων αριθμών του κάθε γινομένου.
public class SecurityManager{
    /*Δήλωση των δύο αριθμών. Οι δηλώσεις των αριθμών έχουν γίνει σε long για να μπορούν να γίνουν
    υπολογισμοί μεγάλων αριθμών.*/
    private long prime_number1, prime_number2;

    //Η συνάρτηση findNumbers, αρχικά δέχεται τον αριθμό που είναι γινόμενο πρώτων.
    void findNumbers(long productNumber){
        /*Αρχικοποιεί δύο boolean μεταβλητές οι οποίες θα καθορίζουν πότε θα σταματάει η αναζήτηση
        για τους δύο αριθμούς.*/
        boolean found1=false,found2 = false;
        //Ο πρώτος πρώτος αριθμός είναι ο αριθμός 2, επομένως θέτουμε τον counter να ξεκινά απο το 2.
        int counter = 2;
        //Μέχρι να βρεθούν οι 2 αριθμοί εκτελεί αναζήτηση
        do{
            //Ψάχνουμε τον πρώτο ακέραιο διαιρέτη του γινόμενου αριθμού.
           if(productNumber%counter==0){
               /*Μόλις βρούμε τον πρώτο ακέραιο διαιρέτη ελέγχουμε αν είναι πρώτος αριθμός, επομένως
               αν ο διαιρέτης είναι πρώτος αριθμός, έχουμε βρεί τους δύο πρώτους αριθμούς και βγαίνουμε
               απο την επανάληψη.*/
               prime_number1 = productNumber/counter;
               prime_number2 = counter;
                if(isPrime(prime_number1))
                    found1 = true;
                if(isPrime(prime_number2))
                    found2 = true;
           }
           counter++;
       }while(!found1 && !found2);
    }

    //Συνάρτηση που ελέγχει αν ο αριθμός είναι πρώτος.
    boolean isPrime(long n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    //Κάνω override τη toString για να εμφανίσω τα αποτελέσματα κάθε φορά.
    @Override
    public String toString(){
        return "Prime Number 1: " + String.valueOf(prime_number1) + " Prime Number 2: " + String.valueOf(prime_number2);
    }

}
