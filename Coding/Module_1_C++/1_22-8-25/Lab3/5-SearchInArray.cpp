#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    if (n <= 0) {
        cout << "Invalid array size." << endl;
        return 1;
    }

    vector<int> arr(n);
    cout << "Enter " << n << " integers:" << endl;
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }

    int searchNum;
    cout << "Enter the number to search for: ";
    cin >> searchNum;

    bool found = false;
    for (int i = 0; i < n; ++i) {
        if (arr[i] == searchNum) {
            found = true;
            break;
        }
    }

    if (found) {
        cout << searchNum << " is present in the array." << endl;
    } else {
        cout << searchNum << " is not present in the array." << endl;
    }

    return 0;
}
