#include <iostream>

using namespace std;

class Point {
private:
    int x, y;

public:
    Point() {
        x = 0;
        y = 0;
    }

    Point(int xVal, int yVal) {
        x = xVal;
        y = yVal;
    }

    void setX(int xVal) { x = xVal; }
    int getX() { return x; }
    void setY(int yVal) { y = yVal; }
    int getY() { return y; }

    void display() {
        cout << "(" << x << ", " << y << ")" << endl;
    }
};

int main() {
    Point p1;
    cout << "Default Point: ";
    p1.display();

    Point p2(10, 20);
    cout << "Parameterized Point: ";
    p2.display();
    
    p1.setX(5);
    p1.setY(15);    
    
    cout << "\nAfter using setters: ";
    cout << "(" << p1.getX() << ", " << p1.getY() << ")" << endl;
    return 0;
}
