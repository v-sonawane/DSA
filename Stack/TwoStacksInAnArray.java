public class TwoStacksInAnArray{
    private int arr[];
    private int top1,top2,capacity;

    TwoStacksInAnArray(int size){
        arr=new int[size];
        top1=-1;
        top2=size;
        capacity=size;
    }

    void push1(int x){
        if(top1<top2-1){
            top1++;
            arr[top1]=x;
        }
        else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    void push2(int x){
        if(top1<top2-1){
            top2--;
            arr[top2]=x;
        }
        else{
            System.out.println("System Overflow");
            System.exit(1);
        }
    }
    int pop1(){
        if(top1>=0){
            int x=arr[top1];
            top1--;
            return x;
        }
        else{
            System.out.println("Stack Underflow!");
            System.exit(1);
        }
        return 0;
    }
    int pop2(){
        if(top2<capacity){
            int x=arr[top2];
            top2++;
            return x;
        }
        else{
            System.out.println("Stack Underflow!");
            System.exit(1);
        }
        return 0;
    }
    
    public static void main(String[] args){
        TwoStacksInAnArray stack=new TwoStacksInAnArray(5);
        stack.push1(1);
        stack.push1(2);
        stack.push2(3);
        System.out.println("After popping element from stack 1: "+stack.pop1());
        System.out.println("After popping element from stack 2: "+stack.pop2());
        System.out.println("After popping element from stack 2: "+stack.pop2());
    }
}