#include<iostream>
using namespace std;

int main(){
cout<<"1:show all prds \n 2:Add new prd \n 3:search prd \n 4:exit"<<endl;
cout<<"Enter Your Choice:"<<endl;
int ch;
cin>>ch;

//if (ch==1)
switch(ch){
    case 1:cout<<"Show All Prds:"<<endl;
            break;
            
    case 2:cout<<"Add New Prd:"<<endl;
           break;
    case 3:cout<<"Enter Prd Id to search:"<<endl;
            break;
    case 4:cout<<"Exit From App:"<<endl;
             break;
      default:
           cout<<"Invalid choice"<<endl;
             break;
}

cout<<"----------Thank You------"<<endl;





}

