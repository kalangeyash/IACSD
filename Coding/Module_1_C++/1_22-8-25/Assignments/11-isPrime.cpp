#include <iostream>
using namespace std;

int main(){
    int a;
    cout<<"Enter number\n";
    cin>>a;
    bool isPrime = false;

    for(int i = 2 ;i<a/2;i++)
    {
        if(a%i == 0)
        {
            isPrime = false;break;
        }

    }

    if(isPrime == true) cout<<"Prime";
    else cout<<"Not Prime";


}