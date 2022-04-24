t=int(input())

while t>0:
    a=list(map(int,input().split()))
    print(a[::-1])
    t-=1