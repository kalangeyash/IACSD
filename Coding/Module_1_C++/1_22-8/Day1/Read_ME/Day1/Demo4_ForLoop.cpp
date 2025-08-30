#include<iostream>
using namespace std;

int main(){

    //print first 10 numbers
   int i;
   cout<<"-----first 10 numbers-------"<<endl;
   for(i=1;i<=10;i++){
    cout<<"Num="<<i<<endl;
   }

   cout<<"-----------print all even numbers from 1 to 10------"<<endl;
   for(i=1;i<=30;i++){
    if(i%2==0)
    cout<<i<<endl;
   }
   cout<<"------------------"<<endl;

   for(i=1;i<=15;i++){
    if(i==5){
        cout<<"----5 is present------"<<endl;
        break;
    }
    cout<<i<<endl;
   }
   cout<<"--------------------"<<endl;
   for(i=10;i>=1;i--)
   {
    cout<<i<<endl;
   }
   cout<<"---------end-------"<<endl;



}