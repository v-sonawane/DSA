t=int(input())

while t>0:
    a=list(map(int,input().split()))
    minimum=a[0]
    maximum=a[0]
    for i in range(1,len(a)):
        if a[i]>maximum:
            a[i]=maximum
        if a[i]<minimum:
            a[i]=minimum
    print("Maximum: {} Minimum: {}",maximum,minimum)
    t-=1