#include <iostream>

using namespace std;

int main() {
    int n, even_sum = 0, odd_sum = 0;
    cout << "Enter the upper limit (n): ";
    cin >> n;

    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0)
            even_sum += i;
        else
            odd_sum += i;
    }

    cout << "Sum of all even numbers between 1 to " << n << " is: " << even_sum << endl;
    cout << "Sum of all odd numbers between 1 to " << n << " is: " << odd_sum << endl;
    
    return 0;
}
