def getArea(r):

 PI = 3.142 #Declaring the constant pi value 
 return PI * (r*r); #Performing pi times (r x r)


#function call
#Printing only 2 decimal digits so "%.2f"
#Test case 1
print("Area is %.2f" %getArea(5));
#Test case 2
print("Area is %.2f" %getArea(12));