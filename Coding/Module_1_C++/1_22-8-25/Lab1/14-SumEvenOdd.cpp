#include <iostream>

using namespace std;

int main() {
    int n, even_sum = 0, odd_sum = 0;
    cout << "Enter the value of n: ";
    cin >> n;
    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0)
            even_sum += i;
        else
            odd_sum += i;
    }
    cout << "Sum of all even numbers are: " << even_sum << endl;
    cout << "Sum of all odd numbers are: " << odd_sum << endl;
    return 0;
}
