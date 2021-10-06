print("Enter the Decimal Number: ")
dec_num = int(input())
i = 0
bin_num = []
while dec_num != 0:
    rem = dec_num % 2
    bin_num.insert(i, rem)
    i = i + 1
    dec_num = int(dec_num / 2)

i = i - 1
print("\nEquivalent Binary Value is:")
while i >= 0:
    print(end=str(bin_num[i]))
    i = i - 1
print()