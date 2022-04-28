t=int(input())

while t>0:
    while t>0:
        a=list(map(int,input().split()))
        b=list(map(int,input().split()))
        n,m,i,j=len(a),len(b),len(a)-1,0

        while i>=0 and j<m:
            if a[i]>b[j]:
                a[i],b[j]=b[j],a[i]
            else:
                break
            i-=1
            j+=1
        a.sort()
        b.sort()
        a=a+b
        print(a)
        t-=1
    t-=1