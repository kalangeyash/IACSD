#include <iostream>

using namespace std;

int main() {
    int n;
    cout << "Enter the upper limit to find prime numbers: ";
    cin >> n;
    
    if (n < 2) {
        cout << "There are no prime numbers up to " << n << "." << endl;
        return 0;
    }

    cout << "Prime numbers between 1 and " << n << " are: ";
    for (int i = 2; i <= n; i++) {
        bool isPrime = true;
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            cout << i << " ";
        }
    }
    cout << endl;
    
    return 0;
}
