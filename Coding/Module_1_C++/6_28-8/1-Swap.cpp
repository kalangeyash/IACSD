/*Function Template – Swap
Write a function template swapValues() that swaps two variables of any type.


Test with int, double, and string.*/
#include <iostream>
using namespace std;

template <class T> void Swap(T &a, T &b)
{
    T temp = a;
    a = b;
    b = temp;
    cout<< " After Swapping : a = "<<a<< " b = "<<b<<endl;
}

int main(){
    int a ,b ;
    cout<<"Enter two Integer Value ";
    cin>>a>>b;
    cout<< " Before Swapping : a = "<<a<< " b = "<<b<<endl;
    Swap(a,b);

    double f ,g ;
    cout<<"Enter two Double Value ";
    cin>>f>>g;
    cout<< " Before Swapping : a = "<<f<< " b = "<<g<<endl;
    Swap(f,g);

    string q,r;
    cout<<"Enter two String Value ";
    cin>>q>>r;
    cout<< " Before Swapping : a = "<<q<< " b = "<<r<<endl;
    Swap(q,r);
    return 0;
}

