t=int(input())

def shift(a,left,right):
    while(left<=right):
        if a[left]<0 and a[right]<0:
            left+=1
        elif a[left]>0 and a[right]<0:
            a[left],a[right]=a[right],a[left]
            left+=1
            right-=1
        elif a[left]>0 and a[right]>0:
            right-=1
        else:
            left+=1
            right-=1

while t>0:
    a=list(map(int,input().split()))
    shift(a,0,len(a)-1)
    print(a)
    t-=1