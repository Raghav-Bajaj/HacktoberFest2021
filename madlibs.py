# Today, my fabulous camp group went to a (an)
# ____________ (adjective) amusement park. It was a
# fun park with lots of cool ____________ (plural noun)
# and enjoyable play structures. When we got there, my
# kind counselor shouted loudly, "Everybody off the
# ____________ (noun)." We all pushed out in a terrible
# hurry. My counselor handed out yellow tickets, and
# we scurried in. I was so excited!
adjective = input("Adjective: ")
adjective2 = input("Adjective: ")
pl = input("Plural noun: ")
noun1 = input("Noun: ")
noun2 = input("Noun: ")
name = input("Name: ")


madlibs = f"Today, my fabulous camp group went to a {adjective} amusement park. It was a {adjective2} park with lots of cool" \
          f"{pl} and enjoyable play structures. \nWhen we got there, my kind counselor shouted loudly, 'Everybody off " \
          f" the {noun1}.' \nWe all pushed out in a terrible hurry. My counselor handed out yellow tickets, and we " \
          f"scurried in. I was so {noun2}! \nsigning off {name}\n"

print(madlibs)
