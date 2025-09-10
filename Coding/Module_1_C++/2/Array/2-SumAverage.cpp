
#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Enter the number of students: ";
    cin >> n;

    if (n <= 0) {
        cout << "Invalid number of students." << endl;
        return 1;
    }

    float* marks = new float[n];
    float total = 0.0;

    cout << "Enter the marks of " << n << " students:" << endl;
    for (int i = 0; i < n; ++i) {
        cin >> marks[i];
        total += marks[i];
    }

    float average = total / n;

    cout << "Total marks: " << total << endl;
    cout << "Average marks: " << average << endl;

    delete[] marks;
    return 0;
}
