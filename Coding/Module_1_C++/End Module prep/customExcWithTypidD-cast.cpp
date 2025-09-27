#include <iostream>
#include <typeinfo>
#include <stdexcept>   // for exception
using namespace std;

// ---------- Custom Exception ----------
class VehicleOverflowException : public runtime_error {
public:
    VehicleOverflowException(const string& msg) : runtime_error(msg) {}
};

// ---------- Base Class ----------
class Vehicle {
protected:
    int vehicle_id;
    string vehicle_type;

public:
    Vehicle() : vehicle_id(0), vehicle_type("") {}
    Vehicle(int id, string type) : vehicle_id(id), vehicle_type(type) {}

    virtual void accept() {
        cout << "Enter Vehicle ID: ";
        cin >> vehicle_id;
        cout << "Enter Vehicle Type: ";
        cin >> vehicle_type;
    }

    virtual void display() {
        cout << "Vehicle ID = " << vehicle_id
             << " | Vehicle Type = " << vehicle_type << endl;
    }

    virtual ~Vehicle() {}
};

// ---------- Derived Class EV ----------
class EV : public Vehicle {
    int battery_capacity;
    int charging_time;

public:
    EV() : Vehicle(), battery_capacity(0), charging_time(0) {}
    EV(int id, string type, int cap, int time)
        : Vehicle(id, type), battery_capacity(cap), charging_time(time) {}

    void chargeBattery() {
        cout << "[EV] Charging battery... Capacity: "
             << battery_capacity << " kWh, Time: "
             << charging_time << " hrs\n";
    }

    void accept() override {
        Vehicle::accept();
        cout << "Enter battery capacity (kWh): ";
        cin >> battery_capacity;
        cout << "Enter charging time (hrs): ";
        cin >> charging_time;
    }

    void display() override {
        Vehicle::display();
        cout << "Battery Capacity = " << battery_capacity
             << " | Charging Time = " << charging_time << endl;
    }
};

// ---------- Derived Class Diesel ----------
class Diesel : public Vehicle {
    int fuel_capacity;

public:
    Diesel() : Vehicle(), fuel_capacity(0) {}
    Diesel(int id, string type, int cap)
        : Vehicle(id, type), fuel_capacity(cap) {}

    void refuelDiesel() {
        cout << "[Diesel] Refueling... Capacity: "
             << fuel_capacity << " liters\n";
    }

    void accept() override {
        Vehicle::accept();
        cout << "Enter fuel capacity (liters): ";
        cin >> fuel_capacity;
    }

    void display() override {
        Vehicle::display();
        cout << "Fuel Capacity = " << fuel_capacity << endl;
    }
};

// ---------- Main ----------
int main() {
    const int SIZE = 5;
    Vehicle* arr[SIZE];
    int idx = 0;
    bool exit = false;

    cout << "=== Vehicle Management System ===\n";
    cout << "1. Add EV\n2. Add Diesel\n3. Display All\n"
         << "4. Perform Actions (dynamic_cast)\n"
         << "5. Perform Actions (typeid)\n0. Exit\n";

    while (!exit) {
        try {
            int ch;
            cout << "\nEnter choice: ";
            cin >> ch;

            switch (ch) {
            case 1: {
                if (idx >= SIZE)
                    throw VehicleOverflowException("Vehicle array is full!");
                arr[idx] = new EV();
                arr[idx]->accept();
                idx++;
                break;
            }
            case 2: {
                if (idx >= SIZE)
                    throw VehicleOverflowException("Vehicle array is full!");
                arr[idx] = new Diesel();
                arr[idx]->accept();
                idx++;
                break;
            }
            case 3: {
                cout << "\n--- Displaying Vehicles ---\n";
                for (int i = 0; i < idx; i++)
                    arr[i]->display();
                break;
            }
            case 4: { // RTTI using dynamic_cast
                cout << "\n--- Actions using dynamic_cast ---\n";
                for (int i = 0; i < idx; i++) {
                    if (EV* ev = dynamic_cast<EV*>(arr[i]))
                        ev->chargeBattery();
                    else if (Diesel* d = dynamic_cast<Diesel*>(arr[i]))
                        d->refuelDiesel();
                }
                break;
            }
            case 5: { // RTTI using typeid
                cout << "\n--- Actions using typeid ---\n";
                for (int i = 0; i < idx; i++) {
                    if (typeid(*arr[i]) == typeid(EV)) {
                        EV* ev = static_cast<EV*>(arr[i]);
                        ev->chargeBattery();
                    } else if (typeid(*arr[i]) == typeid(Diesel)) {
                        Diesel* d = static_cast<Diesel*>(arr[i]);
                        d->refuelDiesel();
                    }
                }
                break;
            }
            case 0:
                exit = true;
                break;

            default:
                cout << "Invalid choice!\n";
            }
        }
        catch (const VehicleOverflowException& e) {
            cout << "Error: " << e.what() << endl;
        }
    }

    // cleanup
    for (int i = 0; i < idx; i++)
        delete arr[i];

    return 0;
}