#include <iostream>
using namespace std;

int main(){
    char ch;
    cout<<"Enter a lowercase character ";
    cin>>ch;

    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
    {
        cout<<"Character "<<ch<<" is a Vowel\n";
    }
    else  cout<<"Character "<<ch<<" is a Consonant\n";
}