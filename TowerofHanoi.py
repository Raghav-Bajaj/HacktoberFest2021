#Getting input 
n=int(input("Enter the number of disks"))

#Recursive function 
def tow(n,a,b,c):
  if(n!=0):
    tow(n-1,a,c,b)
    print(a," to ",c)
    tow(n-1,b,a,c)
  
#function call
tow(n,"a","b","c")