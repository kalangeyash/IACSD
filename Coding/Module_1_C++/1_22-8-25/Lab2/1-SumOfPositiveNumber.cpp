#include <iostream>

using namespace std;

int main() {
    int number;
    int sum = 0;

    cout << "Enter positive numbers to sum. Enter a non-positive number to stop." << endl;

    while (true) {
        cout << "Enter a number: ";
        cin >> number;

        if (number <= 0) {
            break; 
        }

        sum += number;
    }

    cout << "The sum of the positive numbers is: " << sum << endl;

    return 0;
}
