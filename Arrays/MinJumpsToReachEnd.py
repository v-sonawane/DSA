t=int(input())

while t>0:
    a=list(map(int,input().split()))
    jump=0
    if a[0]==0:
        print(-1)
    else:
        for i in range(len(a)):
            jump+=1
            if (a[i]==0 and i!=len(a)-1):
                jump=0
                break
            else:
                if i+a[i]>=len(a):
                    break
                else:
                    i+=a[i]
        print(jump-1)
    t-=1