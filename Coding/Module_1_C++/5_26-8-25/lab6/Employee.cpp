#include <iostream>
using namespace std;

class Employee{
protected:
    int id;
    string name;
    int deptId;
    double basicSalary;
public:
    Employee(){
        id = 0;
        name = "";
        deptId = 0;
        basicSalary = 0.0;
    }
    Employee(int id,string name,int deptId , double basicSalary)
    {
        this->id = id;
        this->name = name;
        this->deptId = deptId;
        this->basicSalary = basicSalary;
    }
    virtual double computeNetSalary(){
        cout<<"Net salary is = "<<basicSalary;
        return this->basicSalary;
    }

};

class Manager:public Employee{
private:
    double perfBonus;
public:
    Manager(){

    }
    Manager(int id,string name,int deptId, double basicSalary, double perfBonus):Employee(id,name,deptId,basicSalary){
        // this->id = id;
        // this->name = name;
        // this->deptId=deptId;
        // this->basicSalary = basicSalary;
        this->perfBonus = perfBonus;
    }
     double computeNetSalary(){
        cout<<"Net salary is (in Manager)= "<<basicSalary;
        return this->basicSalary + this->perfBonus;
    }

};



class Worker:public Employee{
private:
    double hoursWorked;
    double hourlyRate;
public:
    Worker(int id , string name , int deptId , double basicSalary , double hoursWorked , double hourlyRate ):Employee(id,name,deptId,basicSalary){
        this->id = id;
        this->name = name;
        this->deptId=deptId;
        this->basicSalary = basicSalary;
        this->hoursWorked = hoursWorked;
        this->hourlyRate = hourlyRate;
    }
    // double computeNetSalary(){
    //     cout<<"Net salary is (in Manager)= "<<basicSalary;
    //     return this->basicSalary + (this->hoursWorked * this->hourlyRate);
    // }
    double computeNetSalary() override {
        cout << "Net salary is (in Worker) = " << basicSalary << endl;
        return basicSalary + (hoursWorked * hourlyRate);
    }
    void printHourlyRate(){
        cout << "Hourly Rate of Worker is " << hourlyRate << endl;
    }
};


int main() {
    int choice;
    Employee  *arr[5];
    int idx = 0;

    do {
        cout << "1. Hire Manager\n2. Hire Worker\n3. Display all employees' net salary\n4. Exit\n";
        cin >> choice;

        int id, deptId;
        double basicSalary, perfBonus, hourlyRate,hoursWorked;
        string name;

        switch (choice) {
            case 1:
                if (idx >= 5) {
                    cout << "Employee array is full!" << endl;
                    break;
                }
                cout << "\t\tEnter Manager Details" << endl;
                cout << "\t\tEnter Id, Name, DeptId, Basic Salary, Performance Bonus" << endl;
                cin >> id >> name >> deptId >> basicSalary >> perfBonus;
                arr[idx++] =new Manager(id, name, deptId, basicSalary, perfBonus);
                break;

            case 2:
                if (idx >= 5) {
                    cout << "Employee array is full!" << endl;
                    break;
                }
                cout << "\t\tEnter Worker Details" << endl;
                cout << "\t\tEnter Id, Name, DeptId, Basic Salary, Hourly Rate" << endl;
                cin >> id >> name >> deptId >> basicSalary>>hoursWorked >> hourlyRate;
                arr[idx++] = new Worker(id, name, deptId, basicSalary,hoursWorked,hourlyRate);
                break;

            case 3:
                for (int i = 0; i < idx; ++i) {
                    // double ans = arr[i].computeNetSalary; 
                    double ans = arr[i]->computeNetSalary();
                    cout << "Net Salary: " << ans << endl;
                }
                break;


            case 4:
                cout << "Exiting program..." << endl;
                break;

            default:
                cout << "Invalid choice!" << endl;
                break;
        }
    } while (choice != 4);

    return 0;
}
