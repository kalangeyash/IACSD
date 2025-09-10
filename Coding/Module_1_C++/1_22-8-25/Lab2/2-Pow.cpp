#include <iostream>

using namespace std;

int main() {
    int x, n;
    long long result = 1;

    cout << "Enter the base number (x): ";
    cin >> x;
    cout << "Enter the exponent (n): ";
    cin >> n;
    
    if (n < 0) {
        cout << "This program does not support negative exponents." << endl;
        return 1;
    }

    for (int i = 0; i < n; ++i) {
        result *= x;
    }

    cout << x << " raised to the power of " << n << " is: " << result << endl;

    return 0;
}
