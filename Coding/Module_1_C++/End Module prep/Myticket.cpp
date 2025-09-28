	/*
	Aaj chya batch ch question!!!
	Problem Statement – Ticket Management System

	Design a class hierarchy for managing Bus Tickets and Train Tickets using inheritance.

	1. Base Class: Ticket
		•	Data Members:
		•	ticket_no : int
		•	passenger_name : string
		•	fare : double
		•	Member Function:
		•	display() : to display the ticket details.

	2. Derived Class: Bus_Ticket
		•	Additional Data Members:
		•	seat_no : int (validation: must be between 1 and 40)
		•	age : int
		•	distance_km : double
		•	is_ac : bool (true → AC, false → Non-AC)
		•	Member Function:
		•	calc_fare() :
		•	fare = distance_km × 2
		•	If is_ac == true, add 20% extra.

	3. Derived Class: Train_Ticket
		•	Additional Data Members:
		•	coach_type : string (values: "AC", "General", "Sleeper")
		•	distance_km : double
		•	Member Function:
		•	calc_fare() :
		•	fare = distance_km × 1.5
		•	If coach_type == "AC", add 30% extra charge.

	4. Main Program
		•	Provide a menu to the user:
		1.	Add Bus Ticket
		2.	Add Train Ticket
		3.	Display All Tickets (with calculated fare)
		4.	Exit
		*/
	/**
	 public class MYEXc :public Exception{
		private:
			string msg;
		public:
			MYEXc(const string& message) msg:(message){}

			const char* what() const noexcept override()
			{
				return msg.c_str();
			}

	}
	*/
	#include <iostream>
	#include <exception>
	#include <exception>
	#include <vector>

	using namespace std;

	class MyTicketExc : public exception
	{
	private:
		string msg;

	public:
		MyTicketExc(const string& message) : msg(message) {}

		const char *what() const noexcept override
		{
			return msg.c_str();
		}
	};

	class Ticket
	{
	private:
		int ticket_no;
		string passenger_name;
		double fare;

	public:
		Ticket()
		{
			this->ticket_no = 0;
			this->passenger_name = "";
			this->fare = 0;
		}
		Ticket(int ticket_no, string passenger_name, double fare)
		{
			this->ticket_no = ticket_no;
			this->passenger_name = passenger_name;
			this->fare = fare;
		}
		// display() : to display the ticket details.
		void accept()
		{
			cout << "\nEnter ticket no , passenegr name\n" << endl;
			cin >> ticket_no >> passenger_name;
		}
		virtual void display()
		{
			cout << "\nTicket no :" << ticket_no << " | passeneger name " << passenger_name << " | fare " << fare << endl;
		}
		void setFare(double fare)
		{
			this->fare = fare;
		}

		double getFare()
		{
			return fare;
		}
	};

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
	class Bus_Ticket : public Ticket
	{
	private:
		int seat_no;
		int age;
		double distance_km;
		bool is_ac;

	public:
		Bus_Ticket() : Ticket()
		{
			this->seat_no = 0;
			this->age = 0;
			this->distance_km = 0.0;
			this->is_ac = false;
		}
		Bus_Ticket(int ticket_no, string passenger_name, double fare, int seat_no, int age, double distance_km, bool is_ac) : Ticket(ticket_no, passenger_name, fare)
		{
			this->seat_no = seat_no;
			this->age = age;
			this->distance_km = distance_km;
			this->is_ac = is_ac;
		}

		virtual void accept()
		{
			Ticket::accept();

			cout << "\nEnter seat no , age, distance in km , is_ac or not[0/1]" << endl;
			cin >> seat_no;
			if (seat_no < 1 || seat_no > 40)
			{
				throw MyTicketExc("Seat no should be between 1 and 40");
			}
			cin>> age >> distance_km >> is_ac;
		}
		void display()
		{	
			Ticket::display();
			cout << "\nseat no :" << seat_no<<" | age:"<<age  << " |  distance in km " << distance_km << " | is_ac " << is_ac << endl;
		}
		void calc_fare()
		{
			double baseFare = distance_km * 2;
			if (is_ac == false)
			{
				setFare(distance_km * 2);
			}
			else
			{
				// setFare((distance_km*2)*0.20);
				setFare(baseFare + baseFare * 0.20);
			}
		}
	};
	// 3. Derived Class: Train_Ticket
	// 	•	Additional Data Members:
	// 	•	coach_type : string (values: "AC", "General", "Sleeper")
	// 	•	distance_km : double
	// 	•	Member Function:
	// 	•	calc_fare() :
	// 	•	fare = distance_km × 1.5
	// 	•	If coach_type == "AC", add 30% extra charge.

	class Train_Ticket : public Ticket
	{
	private:
		string coach_type;
		double distance_km;

	public:
		Train_Ticket()
		{
			this->coach_type = "";
		}

		Train_Ticket(int ticket_no, string passenger_name, double fare, string coach_type) : Ticket(ticket_no, passenger_name, fare)
		{
			this->coach_type = coach_type;
		}
		void display()
		{	
			Ticket::display();
			cout << "\nCoach type : "<<coach_type<< endl;
		}
		void accept()
		{
			Ticket::accept();
			cout << "\nEnter coach type [AC,GENERAL,SLEEPER],distance" << endl;
			cin >> coach_type;

			if (coach_type != "AC" && coach_type != "GENERAL" && coach_type != "SLEEPER")
			{
				throw MyTicketExc("Please select valid coach_type");
			}
			cin>>distance_km;	
		}
		void calc_fare()
		{
			double baseFare = distance_km * 1.5;
			if (coach_type == "AC")
			{
				setFare(baseFare + baseFare * 0.30);
			}
			else
			{
				setFare(baseFare);
			}
		}
	};
	/*
	4. Main Program
		•	Provide a menu to the user:
		1.	Add Bus Ticket
		2.	Add Train Ticket
		3.	Display All Tickets (with calculated fare)
		4.	Exit
		*/

	int main()
	{
		vector<Ticket *> arr;

		cout << "\n1. Add Bus ticket\n2.Add Train Ticket\n3.Display all tickets with calculated fare\n4.Display all " << endl;
		bool exit = false;

		while (!exit)
		{
			// int ch;
			try
			{
				int ch;
				cout<<"\nenter chocie";
				cin>>ch;
				switch (ch)
				{
				case 1:
				{
					Bus_Ticket *b = new Bus_Ticket();
					b->accept();
					b->calc_fare();
					arr.push_back(b);
					break;
				}
				case 2:
				{
					Train_Ticket *t = new Train_Ticket();
					t->accept();
					arr.push_back(t);
					break;
				}
				case 3:
				{
					for(auto x: arr)
					{
						if(typeid(*x) == typeid(Bus_Ticket))
						{
							Bus_Ticket *b = dynamic_cast<Bus_Ticket*>(x);
							b->calc_fare();
							b->display();
						}
						else if(typeid(*x) == typeid(Train_Ticket))
						{
							Train_Ticket *t = dynamic_cast<Train_Ticket*>(x);
							t->calc_fare();
							t->display();
						}
					}
					break;
				}
				// case 4:
				// for(auto v: arr)
				// {
				// 	v->display();
				// 	break;
				// }
				

				
				default:
					break;
				}
			}
			catch (MyTicketExc& e)
			{
				cout << "[My Exc]: " << e.what();
			}
		}
	}
