#include <iostream>

using namespace std;

int main() {
    int n, i, m = 0;
    bool isPrime = true;
    cout << "Enter the Number to check Prime: ";
    cin >> n;
    if (n <= 1) {
        isPrime = false;
    } else {
        m = n / 2;
        for (i = 2; i <= m; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
    }
    if (isPrime)
        cout << n << " is a prime number." << endl;
    else
        cout << n << " is not a prime number." << endl;
        
    return 0;
}
