
#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;

    if (n <= 0) {
        cout << "Invalid size." << endl;
        return 1;
    }

    int* arr = new int[n];

    cout << "Enter " << n << " elements:" << endl;
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }

    int searchElement;
    cout << "Enter the element to search for: ";
    cin >> searchElement;

    bool found = false;
    for (int i = 0; i < n; ++i) {
        if (arr[i] == searchElement) {
            found = true;
            break;
        }
    }

    if (found) {
        cout << searchElement << " exists in the array." << endl;
    } else {
        cout << searchElement << " does not exist in the array." << endl;
    }

    delete[] arr;
    return 0;
}
