#include <iostream>

using namespace std;

int main() {
    int choice;
    double total = 0;
    char cont;

    do {
        cout << "\n--- Pizza Menu ---\n";
        cout << "1. Margherita - Rs100\n";
        cout << "2. Pepperoni - Rs120\n";
        cout << "3. Veggie -Rs140\n";
        cout << "4. Chicken - Rs200\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: total += 100; break;
            case 2: total += 120; break;
            case 3: total += 140; break;
            case 4: total += 200; break;
            default: cout << "Invalid choice.\n";
        }

        cout << "Current total: Rs" << total << endl;
        cout << "Do you want to order another pizza? (y/n): ";
        cin >> cont;
    } while (cont == 'y' || cont == 'Y');

    cout << "Final Amount to Pay: Rs" << total << endl;
    return 0;
}
