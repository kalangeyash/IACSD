#include <iostream>

using namespace std;

// Inline function to calculate the area of a square
inline float squareArea(float side) {
    return side * side;
}

// Inline function to calculate the area of a rectangle
inline float rectangleArea(float length, float breadth) {
    return length * breadth;
}

// Inline function to calculate the area of a circle
inline float circleArea(float radius) {
    const float PI = 3.14159f;
    return PI * radius * radius;
}

int main() {
    int choice;
    char cont;

    do {
        cout << "\n--- Area Calculator Menu ---" << endl;
        cout << "1. Calculate Area of a Square" << endl;
        cout << "2. Calculate Area of a Rectangle" << endl;
        cout << "3. Calculate Area of a Circle" << endl;
        cout << "4. Exit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                float side;
                cout << "Enter the side of the square: ";
                cin >> side;
                cout << "Area of the square is: " << squareArea(side) << endl;
                break;
            }
            case 2: {
                float length, breadth;
                cout << "Enter the length of the rectangle: ";
                cin >> length;
                cout << "Enter the breadth of the rectangle: ";
                cin >> breadth;
                cout << "Area of the rectangle is: " << rectangleArea(length, breadth) << endl;
                break;
            }
            case 3: {
                float radius;
                cout << "Enter the radius of the circle: ";
                cin >> radius;
                cout << "Area of the circle is: " << circleArea(radius) << endl;
                break;
            }
            case 4:
                cout << "Exiting program." << endl;
                return 0;
            default:
                cout << "Invalid choice. Please try again." << endl;
        }

        cout << "\nDo you want to calculate another area? (y/n): ";
        cin >> cont;

    } while (cont == 'y' || cont == 'Y');

    return 0;
}
