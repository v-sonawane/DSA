t=int(input())

while t>0:
    a=list(map(int,input().split()))
    k=int(input())
    a.sort()
    ans=a[len(a)-1]-a[0]
    for i in range(1,len(a)):
        minimum=min(a[0]+k,a[i]-k)
        maximum=max(a[i-1]+k,a[len(a)-1]-k)
        res=min(ans, maximum-minimum)
    print(res)
    t-=1