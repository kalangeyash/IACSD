#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int choice;
    const double PI = 3.14159;

    do {
        cout << "\n--- Geometry Menu ---\n";
        cout << "a) Compute area of circle\n";
        cout << "b) Compute area of rectangle\n";
        cout << "c) Compute area of triangle\n";
        cout << "d) Exit\n";
        cout << "Enter your choice: ";
        char userChoice;
        cin >> userChoice;

        switch (userChoice) {
            case 'a': {
                double radius;
                cout << "Enter radius of the circle: ";
                cin >> radius;
                cout << "Area of the circle is: " << PI * radius * radius << endl;
                break;
            }
            case 'b': {
                double length, width;
                cout << "Enter length of the rectangle: ";
                cin >> length;
                cout << "Enter width of the rectangle: ";
                cin >> width;
                cout << "Area of the rectangle is: " << length * width << endl;
                break;
            }
            case 'c': {
                double base, height;
                cout << "Enter base of the triangle: ";
                cin >> base;
                cout << "Enter height of the triangle: ";
                cin >> height;
                cout << "Area of the triangle is: " << 0.5 * base * height << endl;
                break;
            }
            case 'd':
                cout << "Exiting program." << endl;
                return 0; 
            default:
                cout << "Invalid choice. Please try again." << endl;
        }
    } while (true);

    return 0;
}
