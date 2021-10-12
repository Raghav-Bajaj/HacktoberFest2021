num = int(input("Enter the number: "))
temp = num
r = 0
while(num > 0):
    last_Digit = num%10
    r = r*10 + last_Digit
    num //= 10
    
if(temp==r):
    print(str(temp)+ " is a palindrome")
else:
    print(str(temp) + " is not a palindrome")