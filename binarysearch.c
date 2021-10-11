#include <stdio.h>
int binarysearch(int arr[], int l,int r,int x)
{
    while (l<=r) {
        int m=l+(r-l)/2;
        if (arr[m]==x) {
            return m;
        }
        if (arr[m]<x)
        l=m+1;
        else
        r=m-1;
    }
    return -1;
}
int main() {
    int arr[]={2,3,4,10,40};
    int n=sizeof(arr)/sizeof(arr[0]);
    int x;
    printf("enter the element to search\n");
    scanf("%d",&x);
    int result = binarysearch(arr,0,n-1,x);
    if (result== -1) {
        printf("element is not present in array");
    }
    else {
        printf("element is present at index %d",result);
    }
    return 0;
}
