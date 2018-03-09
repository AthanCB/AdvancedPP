//icsd14134 - Bonis Athanasios
#include <iostream>
using namespace std;

//Αρχικοποιώ τους 3 πίνακες μας με τιμές που ορίζουμε εμείς.
int tb1[] = {2, 1, 4, 3, 3, 4, 2, 1, 2, 3};
char tb2[] = {'C', 'B', 'D', 'B', 'C', 'D', 'B', 'C', 'A', 'C'};
double tb3[] = {1.7, 2.2, 2.7, 3.1, 4.2, 1.7, 2.6, 2.9, 3.3, 2.4};
//Χρησιμοποιώ το sum ως γενικό άθροισμα των τιμών των πινάκων
double sum;
/*Το average κρατάει το άθροισμα του κάθε πίνακα ώστε να βγει
 *μέσος όρος, για κάθε έναν απο τους πίνακες.*/
double average;
/*Χρησιμοποιούμε template στη κλάση Calculation, για να
 * υπολογίσουμε τα αθροίσματα του εκάστοτε πίνακα,
 * αν είναι οτιδοίποτε άλλο εκτός απο χαρακτήρας, προστείθεται
 * με τον γενικό τύπο όπως παρακάτω, αλλιώς χρησιμοποιεί την κλάση
 * με τους χαρακτήρες.*/
template <typename T>
class Calculation {
public:
    void Calculate(T x){
        average += x;
    }
};
/*Αν η είσοδος στην Calculation είναι χαρακτήρες καλείται η μέθοδος
 * Calculate σε αυτό το σημείο και αντικαθιστά τα γράμματα, με αριθμούς
 * όπως αναφέρεται στην εκφώνηση, προσθέτοντας τους στον υπολογισμό του
 * μέσου όρου κάθε περιοχής.*/
template<>
class Calculation<char> {
public:
    void Calculate(char x) {
        if(x == 'A')
            average += 1;
        else if(x == 'B')
            average += 2;
        else if(x == 'C')
            average += 3;
        else if(x == 'D')
            average += 4;
        else if(x == 'E')
            average += 5;

    }
};

int main() {
    //Αρχικοποιώ τα αθρόισματα.
    sum = 0;
    average = 0;
    //Δημιουργώ τα εκάστοτα αντικείμενα για κάθε πίνακα.
    Calculation <int> calc1;
    Calculation <char> calc2;
    Calculation <double> calc3;

    /*Για κάθε αριθμό ενός πίνακα γίνεται η κλήση της Calculate ώστε
     * να υπολογιστεί το άθροισμα του κάθε πίνακα, αλλά και του συνολικού
     * μέσω της πρόσθεσης στο sum. Αν για κάθε πίνακα βρίσκεται στη τελευταία
     * επανάληψη εμφανίζει τον μέσο όρο του.*/
    for(int i=0;i<10;i++){
        calc1.Calculate(tb1[i]);
        if(i==9){
            sum += average;
            cout << "The average energy efficiency in Karlovasi is: " << average/10 << endl;
            average = 0;
        }
    }
    for(int i=0;i<10;i++){
        calc2.Calculate(tb2[i]);
        if(i==9){
            sum += average;
            cout << "The average energy efficiency in Vathi is: " << average/10 << endl;
            average = 0;
        }
    }
    for(int i=0;i<10;i++){
        calc3.Calculate(tb3[i]);
        if(i==9){
            sum += average;
            cout << "The average energy efficiency in Pythagoreio is: " << average/10 << endl;
            average = 0;
        }
    }
    //Τέλος εμφανίζει τα συνολικά αποτελέσματα σε όλη τη Σάμο.
    cout << endl << "The average energy efficiency in Samos is: " << sum/30 << endl;
}
