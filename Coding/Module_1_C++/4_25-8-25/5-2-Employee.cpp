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
class Employee:public Date{
private:
    int id;
    string name;
public:
    Employee()
    {
        id = 0;
        name = "default";
    }
    // Employee(int id, string name):Date(day,month,year){
    //     this->id = id;
    //     this->name = name;
    //     this->day = day;
    //     this->month = month;
    //     this->year = year;
    // }
        Employee(int id, string name,int day,int month,int year):Date(day,month,year){
        this->id = id;
        this->name = name;
        this->day = day;
        this->month = month;
        this->year = year;
    }

    void getData(int id,string name,int day,int month,int year)
    {
        this->id = id;
        this->name = name;
        this->day = day;
        this->month = month;
        this->year = year;
    }
    void display(){
        cout<<"\n\t\t Employee details"<<endl;
        cout<<"Empoyee name : "<<this->name<<endl;
        cout<<"Empoyee ID : "<<this->id<<endl;
        cout<<"Empoyee DOB : "<<this->day<<"|"<<this->month<<"|"<<this->year<<endl;
        
    }

};

int main(){
    int id,day,month,year;
    string name;
    cout<<"\n\t\tEnter Employee details"<<endl;
    cout<<"\n\t Employee ID"<<endl;
    cin>>id;
    cout<<"\n\t Employee Name"<<endl;
    cin>>name;
    cout<<"\n\t Employee DOB(DD|MM|YYYY)"<<endl;
    cin>>day>>month>>year;

    Employee e;
    e.getData(id,name,day,month,year);
    e.display();
};