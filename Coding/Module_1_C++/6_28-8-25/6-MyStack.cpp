/*class Template – Stack
Implement a class template Stack<T> with functions:
push(), pop(), peek(), isEmpty().
Test with int and string.*/

#include <iostream>
#include <string>
using namespace std;

template<class T> 
class MyStack {
private:
    T* arr;
    int capacity;
    int top;

public:
    MyStack(int size) {   
        capacity = size;
        arr = new T[capacity];
        top = -1;
    }

    ~MyStack() {
        delete[] arr;
    }

    void push(T value) {
        if (top == capacity - 1) {
            cout << "Stack full! Cannot push " << value << endl;
            return;
        }
        arr[++top] = value;
    }

    void pop() {
        if (isEmpty()) {
            cout << "Stack empty! Cannot pop" << endl;
            return;
        }
        cout << "Popped: " << arr[top--] << endl;
    }

    T peek() {
        if (isEmpty()) {
            throw runtime_error("Stack empty! No top element");
        }
        return arr[top];
    }

    bool isEmpty() {
        return top == -1;
    }
};

int main() {
    cout << "Testing with int stack:\n";
    MyStack<int> intStack(5);
    intStack.push(10);
    intStack.push(20);
    intStack.push(30);
    cout << "Top element: " << intStack.peek() << endl;
    intStack.pop();
    intStack.pop();
    intStack.pop();
    intStack.pop(); // extra pop to show empty condition

    cout << "\nTesting with string stack:\n";
    MyStack<string> strStack(3);
    strStack.push("Apple");
    strStack.push("Banana");
    strStack.push("Cherry");
    cout << "Top element: " << strStack.peek() << endl;
    strStack.pop();
    strStack.pop();
    strStack.pop();
    strStack.pop(); // extra pop to show empty condition

    return 0;
}