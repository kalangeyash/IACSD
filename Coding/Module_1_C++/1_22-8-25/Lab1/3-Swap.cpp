#include <iostream>
using namespace std;

int main(){
    int a,b;
    cout<<"Enter two numbers\n";
    cin>>a>>b;
    cout<<"a = " << a<<" b = "<<b<<endl;

    a=a+b;
    b=a-b;
    a=a-b;
    cout<<"After Swapping\n";
    cout<<"a = " << a<<" and b = "<<b <<endl;;

}