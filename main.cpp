# include <bits/stdc++.h>
using namespace std;
//program to return HCF of two numbers
int hcf(int a, int b){
if(b==0)
	return a;

else 
	return (b,a%b);

}
int main(){
int a,b;
cout<<"Enter two numbers: ";
cin>>a>>b;
int ans=hcf(a,b);
cout<<"\nHCF of the two numbers is "<<ans<<"\n";
return 0;
}