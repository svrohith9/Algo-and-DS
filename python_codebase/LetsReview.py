n = int(input())
while n > 0:
    data = input()
    a = ""
    b = ""
    for i in range(len(data)):
        if i % 2 == 0:
            a = a+data[i]
        else:
            b = b+data[i]
    print(f"{a} {b}")
    n = n-1
