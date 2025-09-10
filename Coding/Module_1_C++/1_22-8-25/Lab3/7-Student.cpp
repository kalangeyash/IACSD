#include <iostream>
#include <string>

using namespace std;

class Student {
private:
    int rollno;
    float marks1, marks2, marks3;

public:
    void acceptInfo() {
        cout << "Enter Roll Number: ";
        cin >> rollno;
        cout << "Enter Marks for Subject 1: ";
        cin >> marks1;
        cout << "Enter Marks for Subject 2: ";
        cin >> marks2;
        cout << "Enter Marks for Subject 3: ";
        cin >> marks3;
    }

    void displayInfo() {
        float total = marks1 + marks2 + marks3;
        float percentage = total / 3.0f;
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        cout << "\n--- Student Report ---" << endl;
        cout << "Roll Number: " << rollno << endl;
        cout << "Marks 1: " << marks1 << endl;
        cout << "Marks 2: " << marks2 << endl;
        cout << "Marks 3: " << marks3 << endl;
        cout << "------------------------" << endl;
        cout << "Total Marks: " << total << endl;
        cout << "Percentage: " << percentage << "%" << endl;
        cout << "Grade: " << grade << endl;
    }
};

int main() {
    Student s1;

    s1.acceptInfo();
    s1.displayInfo();

    return 0;
}
