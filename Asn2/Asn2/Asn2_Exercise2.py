#icsd14134 - Μπόνης Αθανάσιος
import random #θα χρησιμοποιήσουμε την βιβλιοθήκη random για να παράξουμε τυχαίους αριθμούς
import sys #η βιβλιοθήκη sys θα χρειαστεί για να διακόψουμε το πρόγραμμα
while True: #θα τρέχει επαναληπτικά μέχρι να θελήσει ο χρήστης να σταματήσει
    counterNumbers = input("How much numbers do you want? (x for Exit)") #Ζητά απο τον χρήστη πόσους αριθμούς θα παίξει
    numberList = [] #αρχικοποιεί την λίστα με τους αριθμούς
    while(counterNumbers.isnumeric() == False): #ελέγχει αν έχει δώσει σωστή μορφή ο χρήστης
        if(counterNumbers == "x"): #αν ο χρήστης δώσει x στην είσοδο τότε βγαίνει απο το πρόγραμμα
            sys.exit()
        counterNumbers = input("Your choice must be a numeric. Please give how much numbers do you want?")
    for i in range(0,int(counterNumbers)): #Ζητά τους αριθμούς απο τον χρήστη, κάνει ελέγχους αν είναι σωστοί και τους εκχωρεί
            numberChoice = input("Give number between 1-80: ")
            while(numberChoice.isnumeric() == False):
                numberChoice = input("Give a true number: ")
            while((int(numberChoice) <1) or (int(numberChoice) > 80)):
                numberChoice = input("Please number must be between 1-80. Give the number again: ")
            while(int(numberChoice) in numberList):
                numberChoice = input("The number is already chosen. Please give a different number: ")
            numberList.append(int(numberChoice))
    print("Your choices: ", end=" ") #τους εμφανίζει στην οθόνη
    print(numberList)
    moneyAdd = input("Give the value of money that you want(1,2,5 or 10 euro): ") #ζητά το ποσό που θέλει να παίξει ο χρήστης
    while(counterNumbers.isnumeric() == False): #κάνει έλεγχο αν είναι αριθμός και αν είναι 1,2,5 ή 10.
        moneyAdd = input("Your choice must be a numeric. Please give the value of the money again: ")
    while((int(moneyAdd) != 1) and (int(moneyAdd) != 2) and (int(moneyAdd) != 5) and (int(moneyAdd) != 10)):
        moneyAdd = input("Your choice must be 1,2,5 or 10. Please give the value of the money again: ")
    print("Your amount: ", end=" ") #το εμφανίζει στην οθόνη
    print(moneyAdd)
    randomList = [] #αρχικοποιεί και δημιουργεί τυχαίους 20 αριθμούς απο το 1 ως το 80
    randomList = random.sample(range(1,80),20)
    print("The draw is: ", end=" ") #Εμφανίζει την κλήρωση
    print(randomList)
    successCounter = 0 #αρχικοποιεί τον μετρητή που θα κρατάει πόσους αριθμούς βρήκε
    for i in numberList: #τρέχει όλη την λίστα με τους αριθμούς που έδωσε ο χρήστης
        if(i in randomList): #αν ο αριθμός βρίσκεται στην λίστα της κλήρωσης, τότε αυξάνει τον μετρητή
            successCounter = successCounter + 1
            print("You found the number: ", end=" ") #και εμφανίζει τον αριθμό στην οθόνη
            print(i)
    print("You found ", end=" ") #Τέλος, εμφανίζει πόσους απο τους αριθμούς βρήκε
    print(successCounter,end=" ")
    print(" numbers.")
    #δημιουργούμε τον πίνακα κερδών 
    table = ((0,2.5),(0,1,5),(0,0,2.5,25),(0,0,1,4,100),(0,0,0,2,20,450),(0,0,0,1,7,50,1600),(0,0,0,1,3,20,100,5000),(0,0,0,0,2,10,50,1000,15000),(0,0,0,0,1,5,25,200,4000,40000),(2,0,0,0,0,2,20,80,500,10000,100000),(2,0,0,0,0,1,10,50,250,1500,15000,500000),(4,0,0,0,0,0,4,25,150,1000,2500,25000,1000000))
    #εμφανίζουμε τα κέρδη δίνοντας ως γραμμή το πόσους αριθμούς έπαιξε ο χρήστης -1 για να πάει στην σωστή γραμμή
    #και ώς στήλη το πόσους πέτυχε. Κάνουμε τον πολλαπλασιασμό για να βγεί το ποσό.
    print(table[int(counterNumbers)-1][successCounter] * int(moneyAdd), end=" ") 
    print(" euro.")