#include <iostream>
#include <string>

using namespace std;

class Book {
private:
    string bname;
    int id;
    string author;
    float price;

public:
    Book() {
        bname = "Untitled";
        id = 0;
        author = "Anonymous";
        price = 0.0f;
    }

    Book(string name, int bookId, string auth, float p) {
        bname = name;
        id = bookId;
        author = auth;
        price = p;
    }

    void setBName(string name) { bname = name; }
    string getBName() { return bname; }
    void setId(int bookId) { id = bookId; }
    int getId() { return id; }
    void setAuthor(string auth) { author = auth; }
    string getAuthor() { return author; }
    void setPrice(float p) { price = p; }
    float getPrice() { return price; }

    void display() {
        cout << "ID: " << id << ", Title: " << bname << ", Author: " << author << ", Price: $" << price << endl;
    }
};

int main() {
    Book b1;
    cout << "Default Book: ";
    b1.display();

    Book b2("The Hitchhiker's Guide", 42, "Douglas Adams", 19.99);
    cout << "Parameterized Book: ";
    b2.display();

    b1.setBName("C++ Programming");
    b1.setId(101);
    b1.setAuthor("Bjarne Stroustrup");
    b1.setPrice(59.95);

    cout << "\nAfter using setters: ";
    b1.display();
    return 0;
}

