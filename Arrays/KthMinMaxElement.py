t=int(input())

while t>0:
    a=list(map(int,input().split()))
    k=int(input())
    a.sort()
    print("Maximum: {} and Minimum: {}",a[len(a)-k],a[k-1])
    t-=1