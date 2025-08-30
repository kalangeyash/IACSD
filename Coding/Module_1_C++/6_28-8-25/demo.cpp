#include <iostream>
using namespace std;

template <class T>
class MyStack {
private:
    T* arr;        // dynamic array to hold stack elements
    int top;       // index of top element
    int capacity;  // maximum size of stack

public:
    // Constructor
    MyStack(int size) {
        capacity = size;
        arr = new T[capacity];
        top = -1; // initially empty
    }

    // Destructor
    ~MyStack() {
        delete[] arr;
    }

    // Push element onto stack
    void push(T value) {
        if (top == capacity - 1) {
            cout << "Stack Overflow! Cannot push " << value << endl;
            return;
        }
        arr[++top] = value;
    }

    // Pop element from stack
    void pop() {
        if (isEmpty()) {
            cout << "Stack Underflow! Cannot pop" << endl;
            return;
        }
        cout << "Popped: " << arr[top--] << endl;
    }

    // Peek at top element
    T peek() const {
        if (isEmpty()) {
            throw runtime_error("Stack is empty! No top element.");
        }
        return arr[top];
    }

    // Check if stack is empty
    bool isEmpty() const {
        return top == -1;
    }
};

// ---------------------- MAIN ----------------------
int main() {
    // Test with int
    MyStack<int> intStack(5);
    intStack.push(10);
    intStack.push(20);
    intStack.push(30);
    cout << "Top element in int stack: " << intStack.peek() << endl;
    intStack.pop();
    cout << "Top element after pop: " << intStack.peek() << endl;

    cout << "----------------------" << endl;

    // Test with string
    MyStack<string> strStack(3);
    strStack.push("Hello");
    strStack.push("World");
    cout << "Top element in string stack: " << strStack.peek() << endl;
    strStack.pop();
    cout << "Top element after pop: " << strStack.peek() << endl;

    return 0;
}