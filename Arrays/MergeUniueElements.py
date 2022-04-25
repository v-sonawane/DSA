t=int(input())

while t>0:
    a=list(map(int,input().split()))
    b=list(map(int,input().split()))
    res=set()
    for i in a:
        res.add(i)
    for i in b:
        res.add(i)
    print(res)
    t-=1