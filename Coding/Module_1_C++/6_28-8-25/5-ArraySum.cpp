/*
Function Template – Array Sum
Write a function template sumArray() that accepts an array of any type and returns the sum of its elements.
*/

#include <iostream>
using namespace std;

template<class T> T sumArray(T arr[],T n)
{   
    T sum = 0;
    for(int i = 0;i<n;i++)
    {
        sum = sum + arr[i];
        // sum += arr[i];
    }
    return sum;
}

int main()
{
    int n;
    cout<<"Enter how many elements you want in arry";
    cin>>n;
    int arr[n];
    for(int i = 0;i<n;i++)
    {
        cout<<"Enter "<<i+1<<" element"<<endl;
        cin>>arr[i];
    }

    
    cout<<"Sum of entire array arr is : "<<sumArray<int>(arr,n)<<endl;  
        
    
    int nm;
    cout<<"Enter how many elements you want in arry";
    cin>>nm;
    double array1[nm];
    for(int i = 0;i<n;i++)
    {
        cout<<"Enter "<<i+1<<" element"<<endl;
        cin>>array1[i];
    }

    
    cout<<"Sum of entire array arr is : "<<sumArray<double>(array1,n)<<endl;  

};