#include <iostream>
using namespace std;

int tb1[] = {2, 1, 4, 3, 3};
char tb2[] = {'C', 'B', 'D', 'B', 'C'};
double tb3[] = {1.7, 2.2, 2.7, 3.1, 4.2};
int counter;
double sum;
double average;
template <typename T>
class Calculation {
public:
    void Calculate(T x){
        average += x;
        counter++;
    }
};

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
        counter++;

    }
};

int main() {
    sum = 0;
    average = 0;
    counter = 0;
    Calculation <int> calc1;
    Calculation <char> calc2;
    Calculation <double> calc3;

    for(int i=0;i<5;i++){
        calc1.Calculate(tb1[i]);
        if(i==4){
            sum += average;
            cout << "The average energy efficiency in Karlovasi is: " << average/5 << endl;
            average = 0;
        }
    }
    for(int i=0;i<5;i++){
        calc2.Calculate(tb2[i]);
        if(i==4){
            sum += average;
            cout << "The average energy efficiency in Vathi is: " << average/5 << endl;
            average = 0;
        }
    }
    for(int i=0;i<5;i++){
        calc3.Calculate(tb3[i]);
        if(i==4){
            sum += average;
            cout << "The average energy efficiency in Pythagoreio is: " << average/5 << endl;
            average = 0;
        }
    }
    cout << endl << "The average energy efficiency in Samos is: " << sum/counter << endl;
}
