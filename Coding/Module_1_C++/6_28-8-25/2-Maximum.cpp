/*Function Template – Maximum
Write a function template findMax() that returns the maximum of two values.


Test with int, float, and char.*/
#include<iostream>
using namespace std;

template<class T> void findMax(T &a,T &b)
{
    if(a>b)
    {
        cout<<a <<" Is Maximum"<<endl;
    }
    else{
        cout<<b <<" Is Maximum"<<endl;
    }
}

int main(){
    int a,b;
    cout<<"Enter two Integer Value ";
    cin>>a>>b;
    findMax(a,b);

    double f ,g ;
    cout<<"Enter two Double Value ";
    cin>>f>>g;
    findMax(f,g);

    string q,r;
    cout<<"Enter two Character Value ";
    cin>>q>>r;
    findMax(q,r);
}