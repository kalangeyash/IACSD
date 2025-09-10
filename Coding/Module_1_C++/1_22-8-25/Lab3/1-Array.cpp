#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    if (n <= 0) {
        cout << "Invalid array size." << endl;
        return 1;
    }

    int* arr = new int[n];
    
    cout << "Enter " << n << " integers:" << endl;
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }

    long long sum = 0;
    for (int i = 0; i < n; ++i) {
        sum += arr[i];
    }
    
    double average = static_cast<double>(sum) / n;

    int maxNum = arr[0];
    int minNum = arr[0];
    for (int i = 1; i < n; ++i) {
        if (arr[i] > maxNum) {
            maxNum = arr[i];
        }
        if (arr[i] < minNum) {
            minNum = arr[i];
        }
    }

    cout << "\n--- Array Analysis ---" << endl;
    cout << "Sum of elements: " << sum << endl;
    cout << "Average of elements: " << average << endl;
    cout << "Maximum element: " << maxNum << endl;
    cout << "Minimum element: " << minNum << endl;

    delete[] arr;

    return 0;
}

