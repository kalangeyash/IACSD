#include <iostream>
#include <vector>
#include <typeinfo>
#include <stdexcept>
using namespace std;

// ---------- Custom Exception ----------
class InvalidVehicleActionException : public runtime_error
{
public:
    InvalidVehicleActionException(const string &msg) : runtime_error(msg) {}
};

// ---------- Base Class ----------
class Vehicle
{
protected:
    int vehicle_id;
    string vehicle_type;

public:
    Vehicle() : vehicle_id(0), vehicle_type("") {}
    Vehicle(int id, string type) : vehicle_id(id), vehicle_type(type) {}

    virtual void accept()
    {
        cout << "Enter Vehicle ID: ";
        cin >> vehicle_id;
        cout << "Enter Vehicle Type: ";
        cin >> vehicle_type;
    }

    virtual void display()
    {
        cout << "Vehicle ID = " << vehicle_id
             << " | Vehicle Type = " << vehicle_type << endl;
    }

    virtual ~Vehicle() {}
};

// ---------- Derived Class EV ----------
class EV : public Vehicle
{
    int battery_capacity;
    int charging_time;

public:
    EV() : Vehicle(), battery_capacity(0), charging_time(0) {}
    EV(int id, string type, int cap, int time)
        : Vehicle(id, type), battery_capacity(cap), charging_time(time) {}

    void chargeBattery()
    {
        cout << "[EV] Charging... Capacity = "
             << battery_capacity << " kWh, Time = "
             << charging_time << " hrs\n";
    }

    void accept() override
    {
        Vehicle::accept();
        cout << "Enter battery capacity (kWh): ";
        cin >> battery_capacity;
        cout << "Enter charging time (hrs): ";
        cin >> charging_time;
    }

    void display() override
    {
        Vehicle::display();
        cout << "Battery Capacity = " << battery_capacity
             << " | Charging Time = " << charging_time << endl;
    }
};

// ---------- Derived Class Diesel ----------
class Diesel : public Vehicle
{
    int fuel_capacity;

public:
    Diesel() : Vehicle(), fuel_capacity(0) {}
    Diesel(int id, string type, int cap)
        : Vehicle(id, type), fuel_capacity(cap) {}

    void refuelDiesel()
    {
        cout << "[Diesel] Refueling... Capacity = "
             << fuel_capacity << " liters\n";
    }

    void accept() override
    {
        Vehicle::accept();
        cout << "Enter fuel capacity (liters): ";
        cin >> fuel_capacity;
    }

    void display() override
    {
        Vehicle::display();
        cout << "Fuel Capacity = " << fuel_capacity << endl;
    }
};

// ---------- Main ----------
int main()
{
    vector<Vehicle *> arr;
    bool exit = false;

    cout << "=== Vehicle Management System (Vector) ===\n";
    cout << "1. Add EV\n2. Add Diesel\n3. Display All\n"
         << "4. Perform Actions (dynamic_cast)\n"
         << "5. Perform Actions (typeid)\n0. Exit\n";

    while (!exit)
    {
        try
        {
            int ch;
            cout << "\nEnter choice: ";
            cin >> ch;

            switch (ch)
            {
            case 1:
            {
                Vehicle *v = new EV();
                v->accept();
                arr.push_back(v);
                break;
            }
            case 2:
            {
                Vehicle *v = new Diesel();
                v->accept();
                arr.push_back(v);
                break;
            }
            case 3:
            {
                cout << "\n--- Displaying Vehicles ---\n";
                for (auto v : arr)
                    v->display();
                break;
            }
            case 4:
            { // RTTI using dynamic_cast + exception
                cout << "\n--- Actions using dynamic_cast ---\n";
                for (auto v : arr)
                {
                    if (EV *ev = dynamic_cast<EV *>(v))
                    {
                        ev->chargeBattery();
                    }
                    else if (Diesel *d = dynamic_cast<Diesel *>(v))
                    {
                        d->refuelDiesel();
                    }
                    else
                    {
                        throw InvalidVehicleActionException(
                            "Unknown Vehicle Type in dynamic_cast!");
                    }
                }
                break;
            }
            case 5:
            { // RTTI using typeid + exception
                cout << "\n--- Actions using typeid ---\n";
                for (auto v : arr)
                {
                    if (typeid(*v) == typeid(EV))
                    {
                        EV *ev = static_cast<EV *>(v);
                        ev->chargeBattery();
                    }
                    else if (typeid(*v) == typeid(Diesel))
                    {
                        Diesel *d = static_cast<Diesel *>(v);
                        d->refuelDiesel();
                    }
                    else
                    {
                        throw InvalidVehicleActionException(
                            "Unknown Vehicle Type in typeid check!");
                    }
                }
                break;
            }
            case 6:
            { // RTTI using typeid + dynamic_cast together
                cout << "\n--- Actions using typeid + dynamic_cast ---\n";
                for (auto v : arr)
                {
                    if (typeid(*v) == typeid(EV))
                    {
                        // type confirmed, safe to cast
                        if (EV *ev = dynamic_cast<EV *>(v))
                            ev->chargeBattery();
                        else
                            throw InvalidVehicleActionException(
                                "Typeid said EV, but dynamic_cast failed!");
                    }
                    else if (typeid(*v) == typeid(Diesel))
                    {
                        if (Diesel *d = dynamic_cast<Diesel *>(v))
                            d->refuelDiesel();
                        else
                            throw InvalidVehicleActionException(
                                "Typeid said Diesel, but dynamic_cast failed!");
                    }
                    else
                    {
                        throw InvalidVehicleActionException(
                            "Unknown Vehicle Type in typeid + dynamic_cast check!");
                    }
                }
                break;
            }
            case 0:

            //hello123world45 123+45 = 168
                exit = true;
                break;

            default:
                cout << "Invalid choice!\n";
            }
        }
        catch (const InvalidVehicleActionException &e)
        {
            cout << "RTTI Error: " << e.what() << endl;
        }
        catch (const exception &e)
        {
            cout << "General Error: " << e.what() << endl;
        }
    }

    // cleanup
    for (auto v : arr)
        delete v;

    return 0;
}


/*
for(auto v: arr)
{
    if(typeid(*v) == typeid(EV))
    {
        if(EV *v1 = dynamic_cast<EV*>(v))
        {
            v1->display();
        }
        else{
                throw MyVehicleExc("Unknown vehicle type")
        }
    }
        else if(typeid(*v) == typeid(Diesel))
        {
            if(Diesel* d1 = dynamic_cast<Diesel*>(v))
            {
                d1->display();
            }
            else{
                throw MyVehicleExc("Unknow vehilce type");
            }
        }
        else{
        throw InvalidVehicleActionException(
                            "Unknown Vehicle Type in typeid + dynamic_cast check!");
                    }
}
*/