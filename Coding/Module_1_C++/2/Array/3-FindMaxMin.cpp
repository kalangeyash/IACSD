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

    int maxElement = arr[0];
    int minElement = arr[0];

    for (int i = 1; i < n; ++i) {
        if (arr[i] > maxElement) {
            maxElement = arr[i];
        }
        if (arr[i] < minElement) {
            minElement = arr[i];
        }
    }

    cout << "Largest element: " << maxElement << endl;
    cout << "Smallest element: " << minElement << endl;

    delete[] arr;
    return 0;
}
