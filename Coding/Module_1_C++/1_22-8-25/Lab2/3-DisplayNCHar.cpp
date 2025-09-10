#include <iostream>

using namespace std;

int main() {
    char startChar;
    int n;

    cout << "Enter a character: ";
    cin >> startChar;
    cout << "Enter the number of next characters to display: ";
    cin >> n;

    cout << "The next " << n << " characters are: ";
    for (int i = 1; i <= n; ++i) {
        cout << static_cast<char>(startChar + i) << " ";
    }
    cout << endl;

    return 0;
}
