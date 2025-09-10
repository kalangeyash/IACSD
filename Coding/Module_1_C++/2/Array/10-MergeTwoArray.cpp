
#include <iostream>

using namespace std;

int main() {
    int n1, n2;

    cout << "Enter the size of the first array: ";
    cin >> n1;
    int* arr1 = new int[n1];
    cout << "Enter elements for the first array:" << endl;
    for (int i = 0; i < n1; ++i) {
        cin >> arr1[i];
    }

    cout << "Enter the size of the second array: ";
    cin >> n2;
    int* arr2 = new int[n2];
    cout << "Enter elements for the second array:" << endl;
    for (int i = 0; i < n2; ++i) {
        cin >> arr2[i];
    }

    int n3 = n1 + n2;
    int* mergedArr = new int[n3];

    for (int i = 0; i < n1; ++i) {
        mergedArr[i] = arr1[i];
    }
    for (int i = 0; i < n2; ++i) {
        mergedArr[n1 + i] = arr2[i];
    }

    cout << "Merged array: ";
    for (int i = 0; i < n3; ++i) {
        cout << mergedArr[i] << " ";
    }
    cout << endl;

    delete[] arr1;
    delete[] arr2;
    delete[] mergedArr;
    return 0;
}
