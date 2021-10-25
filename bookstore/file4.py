import sqlite3
con = sqlite3.connect("bookdata.db")
cur = con.cursor()
print("Welcome to VIVEK Bookstrore.")
while True:
    
        value = input("Enter book Title :")
        sql = cur.execute("SELECT price FROM booklist WHERE  title='" + value + "';")
        record = cur.fetchone()[0]
        if record == None:
            print(f"Sorry sir currently not avilable! \nWe will try to get {value} book for you Next time")
        else:
            print(f"Yes Sir, we have it in stock. It costs Rs{record}. Would you like to take it?")
            ask = int(input("1 for yes and 2 for No :"))
            if ask == 1:
               copies = int(input("How many copies :"))
               print("Sure. Anything else, Sir?")
               user_choice2 = ""
               while (user_choice2 != "Yes" and user_choice2 != "No"):
                   user_choice2 = int(input("Enter :"))
                   if user_choice2 == "No":
                       amount =sum( record * copies)
                       print( f"Book Title :\t{value}\nPrice of Book:\t{record}\nTotal amount:\t{amount}\nThank you Sir, Visit again. Have a good day")

                   elif user_choice2 == "Yes":
                        continue

                   else:
                       print(f"you write wrong \n Yes & No is a not vaild optaion")
            elif ask == 2:
                 print(f"Thanks for asking {value} book ")


    
