#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int n, originalNum, remainder, result = 0, digits = 0;
    cout << "Enter a positive integer: ";
    cin >> n;
    originalNum = n;
    int temp = n;
    while(temp != 0) {
        temp /= 10;
        ++digits;
    }
    temp = n;
    while (temp != 0) {
        remainder = temp % 10;
        result += pow(remainder, digits);
        temp /= 10;
    }
    if (result == originalNum)
        cout << originalNum << " is an Armstrong number." << endl;
    else
        cout << originalNum << " is not an Armstrong number." << endl;
    return 0;
}
