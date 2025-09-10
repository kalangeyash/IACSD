/* Class Template – Queue
   Implement a class template Queue<T> with functions:
   enqueue(), dequeue(), front(), isEmpty().
   Test with int and string.
*/

#include <iostream>
#include <string>
using namespace std;

template<class T>
class MyQueue {
private:
    T* arr;
    int capacity;
    int frontIndex;
    int rearIndex;
    int count;

public:
    MyQueue(int size) {
        capacity = size;
        arr = new T[capacity];
        frontIndex = 0;
        rearIndex = -1;
        count = 0;
    }

    ~MyQueue() {
        delete[] arr;
    }

    void enqueue(T value) {
        if (count == capacity) {
            cout << "Queue full! Cannot enqueue " << value << endl;
            return;
        }
        rearIndex = (rearIndex + 1) % capacity;
        arr[rearIndex] = value;
        count++;
    }

    void dequeue() {
        if (isEmpty()) {
            cout << "Queue empty! Cannot dequeue" << endl;
            return;
        }
        cout << "Dequeued: " << arr[frontIndex] << endl;
        frontIndex = (frontIndex + 1) % capacity;
        count--;
    }

    T front() {
        if (isEmpty()) {
            throw runtime_error("Queue empty! No front element");
        }
        return arr[frontIndex];
    }

    bool isEmpty() {
        return count == 0;
    }
};

int main() {
    cout << "Testing with int queue:\n";
    MyQueue<int> intQueue(5);
    intQueue.enqueue(10);
    intQueue.enqueue(20);
    intQueue.enqueue(30);
    cout << "Front element: " << intQueue.front() << endl;
    intQueue.dequeue();
    intQueue.dequeue();
    intQueue.dequeue();
    intQueue.dequeue(); // extra dequeue to test empty condition

    cout << "\nTesting with string queue:\n";
    MyQueue<string> strQueue(3);
    strQueue.enqueue("Red");
    strQueue.enqueue("Green");
    strQueue.enqueue("Blue");
    cout << "Front element: " << strQueue.front() << endl;
    strQueue.dequeue();
    strQueue.dequeue();
    strQueue.dequeue();
    strQueue.dequeue(); // extra dequeue to test empty condition

    return 0;
}