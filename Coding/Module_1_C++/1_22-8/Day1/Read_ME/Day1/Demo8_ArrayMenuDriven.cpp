#include<iostream>
using namespace std;


int main()
{
int i;
int arr[5];
int index=0;
int choice;

cout<<"1:add element in array"<<endl;
cout<<"2:Show  array"<<endl;
do{
    cout<<"Enter Choice:";
    cin>>choice;
 switch (choice)
 {
 case 1:
        if(index<=4){
       cout<<"Enter Number:";
       cin>>arr[index];//0
       index++;
        }
        else{
            cout<<"-------Array Is Full------"<<endl;
        }
    /* code */
    break;
 case 2:for(i=0;i<index;i++){
    cout<<arr[i];
 }
       break;
  default:
    break;
 }

}while(choice!=0);

}