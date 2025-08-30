#include <iostream>
using namespace std;

class Employee{
private:
    int empId;
    string empName;
    double basicSal;
    double HRA;
    const double medical = 1000;
    double PF;
    double PT;
    double netSal;
    double grossSal;

public:
    Employee(){
    empId = 0;
    empName = "";
    basicSal = 0;
    HRA = 0;
    const double medical = 1000;
    PF = 0;
    PT = 0;
    netSal = 0;
    grossSal = 0;
    }

    Employee(int empId, string empName,double basicSal,double HRA,double PF ,double PT, double netSal, double grossSal){
    this->empId = empId;
    this->empName = empName;
    this->basicSal = basicSal;
    this->HRA = 0.5*basicSal;

    this->PF = 0.12*basicSal;
    this->PT = 200;
    this->netSal = netSal;
    this->grossSal = grossSal;
    };

    void display()
    {
        this->grossSal =  this->basicSal + this->HRA + this->medical;
        this->netSal = this->grossSal - (this->PT + this->PF);
        cout<<"\n\t\t Employee Details ----- "<<endl;
        cout<<"Employee id "<<this->empId;
        cout<<"Employee name "<<this->empName;
        cout<<"Employee basic sal "<<this->basicSal;
        cout<<"Employee gross sal "<<this->grossSal;
        cout<<"Employee net sal "<<this->netSal;
        

    }
    void getDetails(int empId ,string empName,double basicSal
    {
        this->
    })

    
};

int main(){
    Employee e();
    
}