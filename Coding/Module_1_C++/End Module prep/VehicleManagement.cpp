// 2.Vehicle Management System

// Design a class Vehicle representing general information about vehicles with members like vehicle_id and vehicle_type.

// Derive two specialized classes:

// ElectricVehicle with members battery_capacity and charging_time, and a method chargeBattery().

// DieselVehicle with member fuel_capacity, and a method refuelDiesel().

// The system should:

// Allow dynamic addition of vehicles using polymorphism.

// Accept & Display information using a virtual function.

// Use RTTI (e.g., dynamic_cast or instanceof) to invoke vehicle-specific behavior.

//  Note:-Create Array of Objects or Vector Or Map

#include <iostream>
using namespace std;

class Vehicle
{
private:
    int vehicle_id;
    string vehicle_type;

public:
    Vehicle()
    {
        this->vehicle_id = 0;
        this->vehicle_type = "";
    }

    Vehicle(int vehicle_id, string vehicle_type)
    {
        this->vehicle_id = vehicle_id;
        this->vehicle_type = vehicle_type;
    }

    virtual void accept()
    {
        cout << "Enter vid";
        cin >> vehicle_id;
        cout << "Enter vType";
        cin >> vehicle_type;
    }
    virtual void display()
    {
        cout << "\tIn Vehicle Display()";
        cout << "Vehicle Id = " << vehicle_id << " | Vehicle Type = " << vehicle_type;
    }
};

class EV : public Vehicle
{
    // ElectricVehicle with members battery_capacity and charging_time, and a method chargeBattery().
private:
    int battery_capacity;
    int charging_time;

public:
    EV() : Vehicle()
    {
        this->battery_capacity = 0;
        this->charging_time = 0;
    }
    EV(int vehicle_id, string vehicle_type, int battery_capacity, int charging_time) : Vehicle(vehicle_id, vehicle_type)
    {
        this->battery_capacity = battery_capacity;
        this->charging_time = charging_time;
    }
    void chargeBattery()
    {

        cout << "In Ev charge Battry function";
    }

    void accept()
    {
        Vehicle::accept();
        cout << "\tIn EV accpt\nEnter battery capacity and charging time";
        cin >> battery_capacity >> charging_time;
    }
    void display()
    {
        Vehicle::display();
        cout << "\nBattry capacity " << battery_capacity << " Charging time " << charging_time;
        cout<<endl;
    }
};

// DieselVehicle with member fuel_capacity, and a method refuelDiesel().
class Diesel : public Vehicle
{

private:
    int fuel_capacity;

public:
    Diesel()
    {
        this->fuel_capacity = 0;
    }
    Diesel(int vehicle_id, string vehicle_type, int fuel_capacity) : Vehicle(vehicle_id, vehicle_type)
    {
        this->fuel_capacity = fuel_capacity;
    }
    void refuelDiesel()
    {
        cout << "In diesel refuel";
    }

    void accept()
    {
        Vehicle::accept();
        cout << "In Diesel accpt";
    }
    void display()
    {
        Vehicle::display();
        cout<<endl;
    }
};

int main()
{
    int n;
    cout << "Enter size of vechicle lot";
    cin >> n;

    Vehicle **arr = new Vehicle *[n];

    int idx = 0;
    bool exit = false;
    int ch;
    cout << "Welcome to Vehicle management system";
    cout << "1. Add Ev \n2. Add Diesel\n3.display ev\n4.Either ChargeBattery() for ev or RefuelDiesel() for Diesel ";
    while (!exit)
    {
        try
        {
            cout << "Enter choice";
            cin >> ch;
            switch (ch)
            {
            case 1:
                if (idx < n)
                {
                    arr[idx] = new EV();
                    arr[idx]->accept();
                    idx++;
                }
                else
                {
                    throw overflow_error("Vehicle lot full");
                }
                break;
            case 2:
                if (idx < n)
                {
                    arr[idx] = new Diesel();
                    arr[idx]->accept();
                    idx++;
                }
                else
                {
                    throw overflow_error("Vehicle lot full");
                }
                break;

            case 3:
                cout << "\n--- Displaying Vehicles ---\n";
                for (int i = 0; i < idx; i++)
                {
                    arr[i]->display();
                    cout << endl;
                }
                break;

            case 4:
                cout << "\n--- Performing Specific Actions (RTTI) ---\n";
                for (int i = 0; i < idx; i++)
                {
                    if (EV *ev = dynamic_cast<EV *>(arr[i]))
                    {
                        ev->chargeBattery();
                    }

                    else if (
                        Diesel *d = dynamic_cast<Diesel *>(arr[i]))
                    {
                        d->refuelDiesel();
                    }
                }
                break;
            case 0:
                exit = true;
                break;

            default:
                cout << "Invalid choice!\n";
            };
        }
        catch (overflow_error &e)
        {
            cout << "Error " << e.what() << endl;
        }
    }
    for(int i =0; i < idx;i++)
    {
        delete arr[i];
    }
    delete[] arr;
    return 0;
};