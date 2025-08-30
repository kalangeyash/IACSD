/*
Class Template – Box
Implement a class template Box<T> that stores one value of any type and provides          
getValue() and setValue() methods.
*/

#include <iostream>
using namespace std;

template<class T> class Box{
private:
    T price;
public:
    Box(T price)
    {
        this->price = price;
    }
    T getPrice()const{
        return price;
    }
    void setPrice(T price){
        this->price = price;
    }
};

int main(){
    cout<<"\t\t Integer Datatype ------"<<endl;
    int p1 = 10;

    Box<int> ob1(p1);
    cout<<"The price of first object is "<<ob1.getPrice();
    ob1.setPrice(200);
    cout<<endl;
    cout<<"The price after changing first object is "<<ob1.getPrice();
    cout<<endl;

    cout<<"\t\t Double Datatype ------"<<endl;
    double p2 = 10;

    Box<double> ob2(p2);
    cout<<"The price of first object is "<<ob2.getPrice();
    ob2.setPrice(200);
    cout<<endl;
    cout<<"The price after changing first object is "<<ob2.getPrice();
    cout<<endl;
}