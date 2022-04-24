t=int(input())
while t>0:
    arr=list(map(int,input().split()))
    print(arr[::-1])
    t-=1