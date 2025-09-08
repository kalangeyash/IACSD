#include <iostream>
using namespace std;

int main(){
    float sal;
    cout<<"Enter basic salary \n";
    cin>>sal;

    if(sal<=150000)
    {
        cout<<"No tax"<<endl;
    }
    else if(150000<sal && sal<=300000)
    {
        float tax = sal*0.20;
        cout<<"Salary is "<<sal<<" and "<<"Tax = "<<tax<<endl;
    }
    else
    {
        float tax = sal*0.30;
        cout<<"Salary is "<<sal<<" and "<<"Tax = "<<tax<<endl;
    }

}