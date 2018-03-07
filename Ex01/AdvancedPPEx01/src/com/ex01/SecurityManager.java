package com.ex01;

public class SecurityManager {
    private long prime_number1, prime_number2;
    private long productNumber;
    SecurityManager(){

    }


    public void findNumbers(long productNumber){
        boolean found = false;
        int counter = 2;
        do{
           if(productNumber%counter==0){
               prime_number1 = productNumber/counter;
               prime_number2 = counter;

               found = true;
           }
           counter++;
       }while(!found);
    }

    @Override
    public String toString(){
        return "Prime Number 1: " + String.valueOf(prime_number1) + " Prime Number 2" + String.valueOf(prime_number2);
    }


}
