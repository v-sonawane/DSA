t=int(input())

while t>0:
    a=list(map(int,input().split()))
    temp=a[len(a)-1]
    for i in range(len(a)-1,0,-1):
        a[i]=a[i-1]
    a[0]=temp
    print(a)
    t-=1