#include<iostream>
using namespace std;

int main(){
int a=100;
do{
cout<<a<<endl;
a++;
}while(a<=10);

cout<<"----------Bank App---------"<<endl;
cout<<"1:New Account 2:Deposite 3:Withdraw 4:MoneyTransfer 5:exit"<<endl;
int choice;
do{
cout<<"Enter Choice:";

cin>>choice;
switch(choice)
{
case 1: cout<<"Accept Details:Name email "<<endl;
        break;
case 2: cout<<"Accept ActNo and Ammount for Deposite "<<endl;
       
       break;
case 3:cout<<"Accept ActNo and Ammount for Withdraw "<<endl;
       
break;
case 4:cout<<"Accept ActNo and Ammount To Money Transefer "<<endl;
        
     break;
case 5: cout<<"Exit "<<endl;
       
      break;
default:cout<<"Invalid"<<endl;
break;
}
}while(choice!=0);
cout<<"-------end------"<<endl;
}