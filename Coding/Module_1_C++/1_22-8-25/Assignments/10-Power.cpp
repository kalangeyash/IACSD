#include <iostream>
using namespace std;

int power(int m ,int n){
    int res = 1;
    for(int i = 0;i<n;i++)
    {
        res = res*m;
    }
    return res;
}

int main(){
    int m, n;
    cout<<"Enter two number\n";
    cin>>m>>n;
    int ans = power(m,n);
    cout<<"m^n = " << ans<<endl;



}
