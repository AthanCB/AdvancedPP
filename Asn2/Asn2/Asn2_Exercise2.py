import random
import sys
while True:
    counterNumbers = input("How much numbers do you want? (x for Exit)")
    numberList = []
    while(counterNumbers.isnumeric() == False):
        if(counterNumbers == "x"):
            sys.exit()
        counterNumbers = input("Your choice must be a numeric. Please give how much numbers do you want?")
    for i in range(0,int(counterNumbers)):
            numberChoice = input("Give number between 1-80: ")
            while(numberChoice.isnumeric() == False):
                numberChoice = input("Give a true number: ")
            while((int(numberChoice) <1) or (int(numberChoice) > 80)):
                numberChoice = input("Please number must be between 1-80. Give the number again: ")
            while(int(numberChoice) in numberList):
                numberChoice = input("The number is already chosen. Please give a different number: ")
            numberList.append(int(numberChoice))
    print("Your choices: ", end=" ")
    print(numberList)
    moneyAdd = input("Give the value of money that you want(1,2,5 or 10 euro): ")
    while(counterNumbers.isnumeric() == False):
        moneyAdd = input("Your choice must be a numeric. Please give the value of the money again: ")
    while((int(moneyAdd) != 1) and (int(moneyAdd) != 2) and (int(moneyAdd) != 5) and (int(moneyAdd) != 10)):
        moneyAdd = input("Your choice must be 1,2,5 or 10. Please give the value of the money again: ")
    print("Your amount: ", end=" ")
    print(moneyAdd)
    randomList = []
    randomList = random.sample(range(1,80),20)
    print("The draw is: ", end=" ")
    print(randomList)
    successCounter = 0
    for i in numberList:
        if(i in randomList):
            successCounter = successCounter + 1
            print("You found the number: ", end=" ")
            print(i)
    print("You found ", end=" ")
    print(successCounter,end=" ")
    print(" numbers.")
    table = ((0,2.5),(0,1,5),(0,0,2.5,25),(0,0,1,4,100),(0,0,0,2,20,450),(0,0,0,1,7,50,1600),(0,0,0,1,3,20,100,5000),(0,0,0,0,2,10,50,1000,15000),(0,0,0,0,1,5,25,200,4000,40000),(2,0,0,0,0,2,20,80,500,10000,100000),(2,0,0,0,0,1,10,50,250,1500,15000,500000),(4,0,0,0,0,0,4,25,150,1000,2500,25000,1000000))
    print(table[int(counterNumbers)-1][successCounter] * int(moneyAdd), end=" ")
    print(" euro.")