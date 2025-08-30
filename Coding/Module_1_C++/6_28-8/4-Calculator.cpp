/*
Class Template – Calculator
Create a class template Calculator<T> with functions:


add(), subtract(), multiply(), divide().
Test with int and double.

*/
#include<iostream>
using namespace std;

template <class T>class Calculator{
private:
    T a;
    T b;
public:
    Calculator(T a, T b)
    {
        this->a = a;
        this->b = b;
    }

    void add(){
        T c = a+b;
        cout<<"Addition of a and b is "<<c<<endl;
    }

    void substract(){
        T c = a-b;
        cout<<"Substraction of a and b is "<<c<<endl;
    }

    void multiply(){
        T c = a*b;
        cout<<"Multiplication of a and b is "<<c<<endl;
    }

    void divide(){
        if(b == 0)
        {
            cout<<"Division by Zero not allowed"<<endl;
        }else{
            T c = a/b;
            cout<<"Division of a and b is "<<c<<endl;
        }
    }
};

int main(){
    int a,b;
    cout<<"Enter two Integer Value ";
    cin>>a>>b;
    
    Calculator<int> c1(a,b);
    c1.add();
    c1.substract();
    c1.multiply();
    c1.divide();


    double f ,g ;
    cout<<"Enter two Double Value ";
    cin>>f>>g;
    Calculator<double> c2(f,g);
    c2.add();
    c2.substract();
    c2.multiply();
    c2.divide();

};


