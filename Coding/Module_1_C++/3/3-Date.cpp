
#include <iostream>

using namespace std;

class Date {
private:
    int dd, mm, yy;

public:
    Date() {
        dd = 1;
        mm = 1;
        yy = 2000;
    }

    Date(int d, int m, int y) {
        dd = d;
        mm = m;
        yy = y;
    }

    void setDay(int d) { dd = d; }
    int getDay() { return dd; }
    void setMonth(int m) { mm = m; }
    int getMonth() { return mm; }
    void setYear(int y) { yy = y; }
    int getYear() { return yy; }

    void display() {
        cout << dd << "/" << mm << "/" << yy << endl;
    }
};

int main() {
    Date d1;
    cout << "Default Date: ";
    d1.display();

    Date d2(10, 9, 2025);
    cout << "Parameterized Date: ";
    d2.display();

    d1.setDay(15);
    d1.setMonth(12);
    d1.setYear(2024);
    
    cout << "\nAfter using setters: ";
    cout << d1.getDay() << "/" << d1.getMonth() << "/" << d1.getYear() << endl;
    return 0;
}
