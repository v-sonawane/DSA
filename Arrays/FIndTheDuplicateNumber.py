t=int(input())

while t>0:
    a=list(map(int,input().split()))
    res=a[0]
    for i in range(1,len(a)):   
        res=res^a[i]
    print(res)
    t-=1