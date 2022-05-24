public class KStacksInAnArray {
    private int arr[],top[],next[];
    int n,k,free;

    KStacksInAnArray(int k1,int n1){
        k=k1;
        n=n1;
        arr=new int[n];
        top=new int[k];
        next=new int[n];

        for(int i=0;i<k;i++)
            top[i]=-1;
        
        free=0;

        for (int i = 0; i < n - 1; i++)
                next[i] = i + 1;
            next[n - 1] = -1;
    }

    boolean isFull(){
        return (free==-1);
    }

    void push (int x,int stack_no){

        if (isFull()){
            System.out.println("Stack Overflow");
            return;
        }

        int i=free;
        free=next[i];
        next[i]=top[stack_no];
        top[stack_no]=i;
        arr[i]=x;
    }

    int pop(int stack_no){
        if (isEmpty(stack_no)){
            System.out.println("Stack Underflow");
            return -1;
            }

            int i=top[stack_no];
            top[stack_no]=next[i];
            next[i]=free;
            free=i;
            return arr[i];
    }

    boolean isEmpty(int stack_no){
        return (top[stack_no] == -1);
    }
    public static void main(String[] args){
        KStacksInAnArray stack=new KStacksInAnArray(3, 10);
        stack.push(1,2);
        stack.push(2,1);
        stack.push(3,0);
        System.out.println("Popped element from stack 4 is: "+stack.pop(1));
    }
}
