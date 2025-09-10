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
    int* arr_desc = new int[n];

    cout << "Enter " << n << " elements:" << endl;
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
        arr_desc[i] = arr[i];
    }

    for (int i = 0; i < n - 1; ++i) {
        for (int j = 0; j < n - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    
    cout << "Array in ascending order: ";
    for (int i = 0; i < n; ++i) {
        cout << arr[i] << " ";
    }
    cout << endl;

    for (int i = 0; i < n - 1; ++i) {
        for (int j = 0; j < n - i - 1; ++j) {
            if (arr_desc[j] < arr_desc[j + 1]) {
                int temp = arr_desc[j];
                arr_desc[j] = arr_desc[j + 1];
                arr_desc[j + 1] = temp;
            }
        }
    }

    cout << "Array in descending order: ";
    for (int i = 0; i < n; ++i) {
        cout << arr_desc[i] << " ";
    }
    cout << endl;

    delete[] arr;
    delete[] arr_desc;
    return 0;
}
