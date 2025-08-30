#include <iostream>
using namespace std;

class Date{
protected:
    int day,month,year;
public:
    Date(){
        day = 0;
        month = 0;
        year = 0;
    }

    Date(int day,int month,int year){
        this->day = day;
        this->month = month;
        this->year = year;
    }
    void display(){
        cout<<"\n\t\t The date you have entered is : "<<this->day<<"|"<<month<<"|"<<year<<endl;
    }

};

int main(){
    Date d1; //default 
    Date d2; //paramaterized
    cout<<"-------Date program-------- "<<endl;
    int choice;
    
    do{
    cout<<"Enter the date you want to display : "<<endl;
    int day,month,year;
    cin>>day>>month>>year;
    
    cout<<"Displaying default constructor values: \n";
    Date d1; //default 
    d1.display();    

    cout<<"Displaying parametrized constructor values: \n";
    Date d2(day,month,year); //paramaterized
    d2.display();
    
    

    }while(choice!=0);

}
