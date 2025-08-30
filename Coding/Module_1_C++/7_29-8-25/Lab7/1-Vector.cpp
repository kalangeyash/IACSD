#include <iostream>
#include <vector>
#include<algorithm>
using namespace std;

int main()
{
    int choice;
    cout<<"Enter your vector size "; 
    vector<int> arr;
    do{
        cout<<"\n\n1:add 2:show all 3:search 4:sort 5:reverse 6:clear 0:end"<<endl;
        cout<<"\n\tEnter your choice : ";
        cin>>choice;

        switch(choice){
            case 1: 
                cout<<"\n\t\t Add Number";
                int i;
                cout<<"\n\nEnter value to add in vector\n";
                cin>>i;
                arr.push_back(i);
                cout<<"\t\t Element "<<i<<" added in vector";
                break;
            case 2:
                  cout<<"\n\t\t Display Vector:\t";
                  for(int s : arr)
                  {
                    cout<<s<<" ";
                  }
                  break;

            case 3: 
            {
            cout << "\n\t\tEnter the element you want to search: ";
            int t;
            cin >> t;

            auto it = find(arr.begin(), arr.end(), t);

            if (it != arr.end()) {
                cout << "Element found at index: " << distance(arr.begin(), it) << endl;
            } else {
                cout << "Element not present in the array." << endl;
            }

            break;
        }
                
            case 4:
                cout<<"\n\t\t Vector sorted "<<endl;
                sort(arr.begin(),arr.end());
                cout<<"Sorting completed press 2 for displaying"<<endl;
                break;
            case 5:
                cout<<"\n\t\t Vector Reverse sorted "<<endl;
                sort(arr.begin(),arr.end(),greater<>());
                cout<<"Sorting completed press 2 for displaying"<<endl;
                break;
            case 6:
                cout<<"\n \t\t Clearing vector......";
                arr.clear();
                break;

            default: cout<<"invalid option";

        };

    }while(choice!=0);
};