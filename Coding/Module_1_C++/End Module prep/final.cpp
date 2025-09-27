#include <iostream>
#include <vector>
#include <string>
#include <exception>
#include <typeinfo> // for typeid
using namespace std;

// --- Custom Exception Class ---
class MyVehicleExc : public exception {
private:
    string msg;
public:
    MyVehicleExc(const string& message) : msg(message) {}

    const char* what() const noexcept override {
        return msg.c_str();
    }
};

// --- Base Class: Vehicle ---
class Vehicle {
private:
    int vehicle_id;
    string vehicle_type;

public:
    Vehicle() : vehicle_id(0), vehicle_type("") {}
    Vehicle(int id, string type) : vehicle_id(id), vehicle_type(type) {}
    virtual ~Vehicle() {}

    int get_vehicle_id() { return vehicle_id; }

    virtual void accept() {
        cout << "\nEnter Vehicle ID: ";
        cin >> vehicle_id;
        cout << "Enter Vehicle Type (e.g., 'Car', 'Truck'): ";
        cin >> vehicle_type;
    }

    virtual void display() {
        cout << "------------------------------------------" << endl;
        cout << "  [General Vehicle Info]" << endl;
        cout << "  Vehicle ID: " << vehicle_id << endl;
        cout << "  Vehicle Type: " << vehicle_type << endl;
    }
};

// --- Derived Class: ElectricVehicle (EV) ---
class EV : public Vehicle {
private:
    int battery_capacity; // in kWh
    int charging_time;    // in hours

public:
    EV() : Vehicle(), battery_capacity(0), charging_time(0) {}
    EV(int id, string type, int capacity, int time) 
        : Vehicle(id, type), battery_capacity(capacity), charging_time(time) {}

    void chargeBattery() {
        cout << "  >>> Charging EV: Battery with " << battery_capacity 
             << " kWh capacity is charging for " << charging_time << " hours." << endl;
    }

    void accept() override {
        Vehicle::accept();
        cout << "  [EV Specific Input]" << endl;
        cout << "  Enter Battery Capacity (kWh): ";
        cin >> battery_capacity;
        cout << "  Enter Full Charging Time (hours): ";
        cin >> charging_time;
    }

    void display() override {
        Vehicle::display();
        cout << "  [Electric Vehicle Details]" << endl;
        cout << "  Battery Capacity: " << battery_capacity << " kWh" << endl;
        cout << "  Charging Time: " << charging_time << " hours" << endl;
    }
};

// --- Derived Class: DieselVehicle (Diesel) ---
class Diesel : public Vehicle {
private:
    int fuel_capacity; // in Liters

public:
    Diesel() : Vehicle(), fuel_capacity(0) {}
    Diesel(int id, string type, int capacity) 
        : Vehicle(id, type), fuel_capacity(capacity) {}

    void refuelDiesel() {
        cout << "  >>> Refueling Diesel Vehicle: Fuel tank with " 
             << fuel_capacity << " Liters capacity is being refilled." << endl;
    }

    void accept() override {
        Vehicle::accept();
        cout << "  [Diesel Specific Input]" << endl;
        cout << "  Enter Fuel Capacity (Liters): ";
        cin >> fuel_capacity;
    }

    void display() override {
        Vehicle::display();
        cout << "  [Diesel Vehicle Details]" << endl;
        cout << "  Fuel Capacity: " << fuel_capacity << " Liters" << endl;
    }
};

// --- Main Program ---
int main() {
    vector<Vehicle*> vehicle_lot;
    bool exit = false;
    int ch;

    cout << "==========================================" << endl;
    cout << "  Welcome to Vehicle Management System" << endl;
    cout << "==========================================" << endl;

    auto display_menu = []() {
        cout << "\n-------------------- MENU --------------------" << endl;
        cout << "1. Add Electric Vehicle (EV)" << endl;
        cout << "2. Add Diesel Vehicle" << endl;
        cout << "3. Display All Vehicles" << endl;
        cout << "4. Invoke Specific Action (Charge/Refuel - RTTI + typeid)" << endl;
        cout << "0. Exit" << endl;
        cout << "----------------------------------------------" << endl;
        cout << "Enter your choice: ";
    };

    while (!exit) {
        try {
            display_menu();
            if (!(cin >> ch)) {
                cin.clear();
                cin.ignore(10000, '\n');
                throw MyVehicleExc("Invalid input. Please enter a number from the menu.");
            }

            switch (ch) {
                case 1: {
                    cout << "\n--- Adding Electric Vehicle ---" << endl;
                    Vehicle* v_ev = new EV();
                    v_ev->accept();
                    vehicle_lot.push_back(v_ev);
                    cout << "\n** Electric Vehicle Added! **" << endl;
                    break;
                }

                case 2: {
                    cout << "\n--- Adding Diesel Vehicle ---" << endl;
                    Vehicle* v_diesel = new Diesel();
                    v_diesel->accept();
                    vehicle_lot.push_back(v_diesel);
                    cout << "\n** Diesel Vehicle Added! **" << endl;
                    break;
                }

                case 3: {
                    if (vehicle_lot.empty()) {
                        cout << "\n*** The vehicle lot is currently empty. ***" << endl;
                        break;
                    }
                    cout << "\n--- Displaying All Vehicles (" << vehicle_lot.size() << " Total) ---" << endl;
                    for (auto v : vehicle_lot) {
                        v->display();
                    }
                    cout << "------------------------------------------" << endl;
                    break;
                }

                case 4: {
                    if (vehicle_lot.empty()) {
                        cout << "\n*** No vehicles to perform actions on. ***" << endl;
                        break;
                    }
                    cout << "\n--- Performing Specific Actions (RTTI + typeid) ---" << endl;
                    for (auto v : vehicle_lot) {
                        if (typeid(*v) == typeid(EV)) {
                            EV* ev = dynamic_cast<EV*>(v);
                            cout << "\n[Vehicle ID: " << ev->get_vehicle_id() << " - EV Action]: ";
                            ev->chargeBattery();
                        }
                        else if (typeid(*v) == typeid(Diesel)) {
                            Diesel* d = dynamic_cast<Diesel*>(v);
                            cout << "\n[Vehicle ID: " << d->get_vehicle_id() << " - Diesel Action]: ";
                            d->refuelDiesel();
                        }
                        else {
                            cout << "\n[Error] Unknown vehicle type encountered in RTTI/typeid check." << endl;
                        }
                    }
                    cout << "---------------------------------------------------------" << endl;
                    break;
                }

                case 0: {
                    exit = true;
                    cout << "\nExiting Vehicle Management System." << endl;
                    break;
                }

                default: {
                    throw MyVehicleExc("Invalid choice. Please select an option from 0 to 4.");
                }
            }
        }
        catch(const MyVehicleExc& e) {
            cout << "\n[Custom Exception]: " << e.what() << endl;
        }
        catch(const exception& e) {
            cout << "\n[Standard Exception]: " << e.what() << endl;
        }
    }

    // Cleanup
    cout << "\nCleaning up " << vehicle_lot.size() << " vehicles..." << endl;
    for (auto v : vehicle_lot) {
        delete v;
    }
    vehicle_lot.clear();
    cout << "Cleanup complete. Goodbye!" << endl;

    return 0;
}