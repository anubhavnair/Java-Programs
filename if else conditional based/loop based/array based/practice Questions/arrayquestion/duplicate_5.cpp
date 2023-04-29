#include<iostream>

using namespace std;

int main(){
    int arr1[100];
    int arr2[100];
    int arr3[100];
    int i,j,n;
    int count=0;
    int a=1;
    cout<<"enter how many have to check for duplicacy"<<endl;
    cin>>n;

    for(int i=0;i<n;i++){
        cout<<"enter the element"<<endl;
        cin>>arr1[i];
        arr2[i]=arr1[i];

        for(j=0;j<n;j++){
            if(arr1[i]==arr2[j]){
                arr3[j]=a;
                a++;
            }
        }
        a=1;

        if(arr3[i]==2){
            count++;
        }
    }

    cout<<count;
}
