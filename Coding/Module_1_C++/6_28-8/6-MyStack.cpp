/*class Template – Stack
Implement a class template Stack<T> with functions:
push(), pop(), peek(), isEmpty().
Test with int and string.*/

#include <iostream>
using namespace std;

template<class T> class MyStack{
private:
    T* arr;
    int capacity;
    int top;
public:
    MyStack(int size)
    {   
        capacity = size;
        arr = new T[capacity];
        top = -1;
    }

    void push(T value) {
        if (top == capacity - 1) {
            cout << "Stack full! Cannot push " << value << endl;
            return;
        }
        arr[top] = value;
        top++;
    }

    void pop(){
        if (isEmpty()) {
            cout << "Stack empty! Cannot pop" << endl;
            return;
        }
        cout << "Popped: " << arr[top--] << endl;
    }


};

int main(){

}

