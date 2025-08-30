#include<iostream>
using namespace std;

int main()
{

int age;
cout<<"Plz Enter Age:";
cin>>age;

if(age>=18){
    //true part
    cout<<"Valid Age:"<<endl;
}

cout<<"--------if else----------"<<endl;

if(age>=18)
{//true
    cout<<"Valid :"<<endl;
}
else{
    //false
    cout<<"In Valid Age :"<<endl;
}
cout<<"----if else if-----"<<endl;
cout<<"Enter Month Number:"<<endl;
int month;
cin>>month;
if(month==1){
    cout<<"--Jan----"<<endl;
}
else if(month==2){
     cout<<"--Feb----"<<endl;
}
else if(month==3){
     cout<<"--March----"<<endl;
}
else if(month==4){
    
     cout<<"--Apr----"<<endl;
}
else{
    //default else
    cout<<"----invalid month-----"<<endl;
}


cout<<"-------------end--------"<<endl;



//

}

