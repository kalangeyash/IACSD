#include <iostream>
using namespace std;

int main()
{
    int a1,a2,a3;
    cout<<"Enter angles of Trianle one after other  \n";
    cin>>a1;
    cin>>a2;
    cin>>a3;

    if(a1+a2+a3 == 180) cout<<"Triangle is valid(addition of all angles is 180 ) \n";
    else cout<<"Triangle is NOT valid(addition of all angles is not 180 ) \n";
}