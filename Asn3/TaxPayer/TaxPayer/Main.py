#icsd14134 - Bonis Athanasios
import sys
import re #Χρησιμοποιούμε την βιβλιοθήκη re για να χρησιμοποιήσουμε τις συναρτήσεις για Regex
import unicodedata #Χρησιμοποιούμε την βιβλιοθήκη unicodedata για να μπορούμε να χρησιμοποιήσουμε τα ελληνικά
from TaxPayer import TaxPayer #Κάνουμε import την κλάση του TaxPayer για να την χρησιμοποιήσουμε

taxPayers_List = [] #Αρχικοποιούμε την λίστα με τους φορολογούμενους
counter = 0 #Αρχικοποιούμε τον counter για τους φορολογούμενους
totalTaxes = 0.0 #Αρχικοποιούμε το σύνολο


with open("samostax.txt", encoding="UTF-8") as f: #Διαβάζουμε το αρχείο με encoding UTF-8 για τα ελληνικά
    for i in f: #Για κάθε γραμμή
        if((re.search(r'[\d/-]+$', i))): #Αν η γραμμή περιέχει αριθμούς
            newline = re.split(" ", i) #χωρίζει σε στήλες
            newline[3] = re.sub("\n","", newline[3]) #Αφαιρεί απο την τελευταία γραμμη το \n
            taxPayers_List.append(newline) #Προσθέτει στη λίστα τον φορολογούμενο

for i in taxPayers_List: #Για κάθε φορολογούμενο
    #Δημιουργεί ενα νεό αντικείμενο φορολογούμενου στέλνοντας μέσα τα στοιχεία του απο την λίστα
    taxPayer = TaxPayer(taxPayers_List[counter][0],taxPayers_List[counter][1],float(taxPayers_List[counter][2]),float(taxPayers_List[counter][3]))
    filetax = float(taxPayers_List[counter][3])
    temp_tax = taxPayer.TaxCalculate() #Καλεί την μέθοδο για τον υπολογισμό του φόρου
    if(filetax > temp_tax): #Ανάλογα με την διαφορά του φόρου που έχει πληρώσει εμφανίζει αν πρέπει να του επιστραφούν ή να πληρώσει
             filetax -= temp_tax;
             totalTaxes -= filetax
             print("Ο φορολογούμενος με ΑΦΜ: ", taxPayer.afm , " πρέπει να επιστραφούν: " , filetax)
    else:
             filetax = temp_tax - filetax;
             totalTaxes += filetax
             print( "Ο φορολογούμενος με ΑΦΜ: ", taxPayer.afm , " πρέπει να πληρώσει: " ,filetax)
    counter = counter +1
#Εμφανίζει το σύνολο
print("Σύνολο: ", totalTaxes)


