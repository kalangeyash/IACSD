

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
    bool* visited = new bool[n];

    cout << "Enter " << n << " elements:" << endl;
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
        visited[i] = false;
    }

    cout << "Frequency of each element:" << endl;
    for (int i = 0; i < n; ++i) {
        if (visited[i] == true) {
            continue;
        }

        int count = 1;
        for (int j = i + 1; j < n; ++j) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        cout << arr[i] << " occurs " << count << " times." << endl;
    }

    delete[] arr;
    delete[] visited;
    return 0;
}
