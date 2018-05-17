import sys
import string
import unicodedata #Χρησιμοποιούμε την βιβλιοθήκη unicodedata για να μπορούμε να χρησιμοποιήσουμε τα ελληνικά
import re #Χρησιμοποιούμε την βιβλιοθήκη re για να χρησιμοποιήσουμε τις συναρτήσεις για Regex

class TaxPayer(object): #Δημιουργούμε μια κλάση TaxPayer για τον κάθε φορολογούμενο με τις ιδιότητες, αφμ, αριθμός παιδιών,εισόδημα,φόρος
    def __init__(self, afm, children, income,tax):
        self.afm = afm
        self.children = children
        self.income = income
        self.tax = tax
        

    def TaxCalculate(self): #Δημιουργούμε μια συνάρτηση για τον υπολογισμό του φόρου
        temp_tax = 0.0 #Αρχικοποιούμε την μεταβλητή που θα κρατάει τον φόρο
        if(self.income < 12000): #Αν ο μισθός είναι κάτω απο 12000 τότε είναι 10% του εισοδήματος
            temp_tax += self.income*0.1
        else: #Αλλιώς 15% του εισοδήματος
            temp_tax += self.income*0.15
        temp_tax -= (float(self.children)*0.1)*temp_tax #Ανάλογα τον αριθμό των παιδιών υπολογίζει την έκπτωση
        return temp_tax #επιστρέφει τον υπολογισμένο φόρο
       


