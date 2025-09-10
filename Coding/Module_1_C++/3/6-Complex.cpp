#include <iostream>

using namespace std;

class ComplexNumber {
private:
    float real;
    float imaginary;

public:
    ComplexNumber() {
        real = 0.0f;
        imaginary = 0.0f;
    }

    ComplexNumber(float r, float i) {
        real = r;
        imaginary = i;
    }

    void setReal(float r) { real = r; }
    float getReal() { return real; }
    void setImaginary(float i) { imaginary = i; }
    float getImaginary() { return imaginary; }

    void display() {
        cout << real << " + " << imaginary << "i" << endl;
    }
};

int main() {
    ComplexNumber c1;
    cout << "Default Complex Number: ";
    c1.display();

    ComplexNumber c2(5.5, 3.2);
    cout << "Parameterized Complex Number: ";
    c2.display();

    c1.setReal(2.1);
    c1.setImaginary(4.8);
    
    cout << "\nAfter using setters: ";
    cout << c1.getReal() << " + " << c1.getImaginary() << "i" << endl;
    return 0;
}
