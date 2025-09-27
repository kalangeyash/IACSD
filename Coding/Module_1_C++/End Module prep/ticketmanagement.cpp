// Aaj chya batch ch question!!!
// Problem Statement – Ticket Management System

// Design a class hierarchy for managing Bus Tickets and Train Tickets using inheritance.

// 1. Base Class: Ticket
// 	•	Data Members:
// 	•	ticket_no : int
// 	•	passenger_name : string
// 	•	fare : double
// 	•	Member Function:
// 	•	display() : to display the ticket details.

// 2. Derived Class: Bus_Ticket
// 	•	Additional Data Members:
// 	•	seat_no : int (validation: must be between 1 and 40)
// 	•	age : int
// 	•	distance_km : double
// 	•	is_ac : bool (true → AC, false → Non-AC)
// 	•	Member Function:
// 	•	calc_fare() :
// 	•	fare = distance_km × 2
// 	•	If is_ac == true, add 20% extra.

// 3. Derived Class: Train_Ticket
// 	•	Additional Data Members:
// 	•	coach_type : string (values: "AC", "General", "Sleeper")
// 	•	distance_km : double
// 	•	Member Function:
// 	•	calc_fare() :
// 	•	fare = distance_km × 1.5
// 	•	If coach_type == "AC", add 30% extra charge.

// 4. Main Program
// 	•	Provide a menu to the user:
// 	1.	Add Bus Ticket
// 	2.	Add Train Ticket
// 	3.	Display All Tickets (with calculated fare)
// 	4.	Exit

/*
for(auto x: arr)
{
    if(typeid(*x) == typeid(Bus_ticket))
    {
        if(BusTicket *b = dynamic_cast<Bus_Ticket*>(x))    
    }
}
*/
#include <iostream>
#include <vector>
#include <string>
#include <stdexcept>
using namespace std;

// ================= Base Class =================
class Ticket {
protected:
    int ticket_no;
    string passenger_name;
    double fare;

public:
    Ticket() : ticket_no(0), passenger_name(""), fare(0.0) {}
    Ticket(int no, string name) : ticket_no(no), passenger_name(name), fare(0.0) {}

    virtual void accept() {
        cout << "Enter Ticket No: ";
        cin >> ticket_no;
        cout << "Enter Passenger Name: ";
        cin >> passenger_name;
    }

    virtual void calc_fare() = 0;  // pure virtual
    virtual void display() {
        cout << "Ticket No: " << ticket_no
             << " | Passenger: " << passenger_name
             << " | Fare: " << fare << endl;
    }

    virtual ~Ticket() {}
};

// ================= Derived Class: Bus Ticket =================
class Bus_Ticket : public Ticket {
    int seat_no;
    int age;
    double distance_km;
    bool is_ac;

public:
    Bus_Ticket() : Ticket(), seat_no(0), age(0), distance_km(0), is_ac(false) {}

    void accept() override {
        Ticket::accept();
        cout << "Enter Seat No (1-40): ";
        cin >> seat_no;
        if (seat_no < 1 || seat_no > 40)
            throw invalid_argument("Seat number must be between 1 and 40!");

        cout << "Enter Age: ";
        cin >> age;
        cout << "Enter Distance (km): ";
        cin >> distance_km;
        cout << "Is AC? (1 = Yes, 0 = No): ";
        cin >> is_ac;
    }

    void calc_fare() override {
        fare = distance_km * 2;
        if (is_ac) fare += fare * 0.20;  // 20% extra
    }

    void display() override {
        Ticket::display();
        cout << "Seat No: " << seat_no
             << " | Age: " << age
             << " | Distance: " << distance_km << " km"
             << " | Type: " << (is_ac ? "AC" : "Non-AC") << endl;
    }
};

// ================= Derived Class: Train Ticket =================
class Train_Ticket : public Ticket {
    string coach_type;   // "AC", "General", "Sleeper"
    double distance_km;

public:
    Train_Ticket() : Ticket(), coach_type("General"), distance_km(0) {}

    void accept() override {
        Ticket::accept();
        cout << "Enter Coach Type (AC/General/Sleeper): ";
        cin >> coach_type;
        cout << "Enter Distance (km): ";
        cin >> distance_km;
    }

    void calc_fare() override {
        fare = distance_km * 1.5;
        if (coach_type == "AC")
            fare += fare * 0.30; // 30% extra
    }

    void display() override {
        Ticket::display();
        cout << "Coach: " << coach_type
             << " | Distance: " << distance_km << " km" << endl;
    }
};

// ================= Main Program =================
int main() {
    vector<Ticket*> tickets;
    bool exit = false;

    cout << "=== Ticket Management System ===" << endl;
    cout << "1. Add Bus Ticket\n2. Add Train Ticket\n3. Display All Tickets\n4. Exit\n";

    while (!exit) {
        try {
            int ch;
            cout << "\nEnter choice: ";
            cin >> ch;

            switch (ch) {
                case 1: {
                    Ticket* t = new Bus_Ticket();
                    t->accept();
                    t->calc_fare();
                    tickets.push_back(t);
                    break;
                }
                case 2: {
                    Ticket* t = new Train_Ticket();
                    t->accept();
                    t->calc_fare();
                    tickets.push_back(t);
                    break;
                }
                case 3: {
                    cout << "\n--- All Tickets ---\n";
                    for (auto t : tickets)
                        t->display();
                    break;
                }
                case 4:
                    exit = true;
                    break;
                default:
                    cout << "Invalid choice!\n";
            }
        }
        catch (const exception& e) {
            cout << "Error: " << e.what() << endl;
        }
    }

    // Cleanup
    for (auto t : tickets) delete t;

    return 0;
}