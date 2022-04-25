t=int(input())

while t>0:
    a=list(map(int,input().split()))
    sum=a[0]
    max_sum=sum
    for i in range(1,len(a)):
        sum+=a[i]
        if sum>max_sum:
            max_sum=sum
        else:
            max_sum=a[i]
    print(max_sum)
    t-=1