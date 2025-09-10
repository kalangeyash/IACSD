
#include <iostream>
#include <string>

using namespace std;

class Person {
private:
    string name;
    int age;
    string city;

public:
    Person() {
        name = "Unknown";
        age = 0;
        city = "Nowhere";
    }

    Person(string n, int a, string c) {
        name = n;
        age = a;
        city = c;
    }

    void setName(string n) { name = n; }
    string getName() { return name; }
    void setAge(int a) { age = a; }
    int getAge() { return age; }
    void setCity(string c) { city = c; }
    string getCity() { return city; }

    void display() {
        cout << "Name: " << name << ", Age: " << age << ", City: " << city << endl;
    }
};

int main() {
    Person p1;
    cout << "Default Constructor: ";
    p1.display();

    Person p2("Alice", 30, "Wonderland");
    cout << "Parameterized Constructor: ";
    p2.display();

    p1.setName("Bob");
    p1.setAge(25);
    p1.setCity("Builderland");

    cout << "\nAfter using setters: ";
    cout << "Name: " << p1.getName() << ", Age: " << p1.getAge() << ", City: " << p1.getCity() << endl;
    return 0;
}
