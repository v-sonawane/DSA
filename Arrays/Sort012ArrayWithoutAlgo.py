t= int(input())

while t>0:
    a=list(map(int,input().split()))
    count0,count1,count2=0,0,0
    for i in range(len(a)):
        if a[i]==0:
            count0+=1
        elif a[i]==1:
            count1+=1
        else:
            count2+=1
    res=[0]*count0 + [1]*count1 + [2]*count2
    print(res)
    t-=1