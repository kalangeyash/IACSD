#include <iostream>
using namespace std;

int main(){
    int a;
    cout<<"Enter number\n";
    cin>>a;

    if(a % 5 == 0 && a % 7 == 0)
    {
        cout<<"The given number "<< a <<" is Divisble by 5 and 7 both\n";
    }
    else if(a % 5 == 0)
    {
        cout<<"The given number "<< a <<" is Divisble by 5 only and not 7\n";
    }
    else if(a % 7 == 0)
    {
        cout<<"The given number "<< a <<" is Divisble by 7 only and not 5\n";        
    }
    else
    {
        cout<<"The given number "<< a <<" is not Divisble by either 7 nor 5\n";  
    }

}