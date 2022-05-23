public class Stack{
    private int arr[];
    private int top;
    private int capacity;
    
    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }

    public void push(int x){
        if (isFull()){
            System.out.println("Overflow");
            System.exit(1);
        }
        System.out.println("Pushing "+x);
        arr[++top]=x;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public int size(){
        return top+1;
    }

    public Boolean isEmpty(){
        return top==-1;
    }

    public Boolean isFull(){
        return top==capacity-1;
    }

    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Stack stack=new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();

        System.out.println("After Popping: ");

        stack.printStack();
    }
}