a=int(input())    #getting the input

def callme(a):   #directly passing the input into the function
  sq=a*a
  while(a>0):   #Extracing every single digit from back and comparing
    if(a%10!=sq%10):
      return False
    sq=sq//10   #getting the last digit of square value
    a=a//10   #getting the last digit of given(input) value
  return True

if callme(a):   #If True this block will execute
  print("Automorphic")
else:
  print("Not Automorphic")