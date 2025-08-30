#include<iostream>
using namespace std;


int main(){
    cout<<"---------------Array---------"<<endl;

    int arr[5];
    arr[0]=10;
    arr[1]=20;
    arr[2]=30;
    arr[3]=40;
    arr[4]=50;
    cout<<"----------display elements from array-------"<<endl;
int i;
    for(i=0;i<5;i++){
        cout<<arr[i]<<endl;
        
    }
cout<<"--------Accept Array Elements--------"<<endl;
for(i=0;i<5;i++){
    cin>>arr[i];
}
cout<<"----------display elements from array-------"<<endl;

    for(i=0;i<5;i++){
        cout<<arr[i]<<endl;
        
    }
}