import sqlite3
con = sqlite3.connect('bookdata.db')
cur = con.cursor()

def add():
    while (True):
        try:
            myid = int(input("Enter Id:\t"))
            myname = input("Enter Title:\t ")
            myauthor = input("Enter Author:\t ")
            mymarks = int(input("Enter Price:\t "))
            cur.execute("INSERT INTO  booklist(Book_id, Title, Author, Price) VALUES (?,?,?,?);",(myid, myname, myauthor, mymarks))
            con.commit()
            print("You Succesfully Added data")
        except:
            print("You Entered some wrong Data ")

        user_choice2 = ""
        while (user_choice2 != "c" and user_choice2 != "q"):
            print("Press q to quit and c to If you want add more data")
            user_choice2 = input("Enter")
            if user_choice2 == "q":
                exit()
            elif user_choice2 == "c":
                continue
            else:
                print(f" you write wrong \n{ user_choice2} is a not vaild optaion")

def display():
    print("Book_id\t Title\t Author\t Price\n")
    vv = cur.execute("SELECT * FROM  booklist")
    for i in vv:
        print(i[0], "\t", i[1], "\t====>>", i[2], "\t", i[3])
    con.close()

def Updating():
    print("here you can change price of any book")
    user = input("Enter Title Which you want to update:")
    cur.execute("SELECT price FROM booklist WHERE  title='" +user+ "';")
    record = cur.fetchone()
    print(f"The old price of {user} book is {record}")
    user2 = input("Now Enter new price :")
    con.execute("UPDATE booklist SET price='"+user2+"' WHERE title='"+user+"' ")
    con.commit()
    print("Record updated sucessfully")


if __name__ == '__main__':
    print("hello to VIVEK bookstroe database \nEnter Your choice ")
    take = int(input("1 for Add \t 2 for Name of Books \t 3 for updating price\nYour choice:\t"))
    if take==1 :
        print(add())
    elif take==2 :
        print(display())
    elif take == 3 :
        print(Updating())
    else:
        print("Error !!!. You entered wrong data ")


