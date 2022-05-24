public class FindMiddleElement {
    private int arr[];
    int top,capacity;

    FindMiddleElement(int size){
        arr=new int[size];
        top=-1;
        capacity=size;
    }

    void push(int x){
        if(top<capacity){
            top++;
            arr[top]=x;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    int findMiddle(){
        if (top%2== 0){
            return arr[top/2];
        }
        else{
            return arr[(top/2)+1];
        }
    }
    public static void main(String[] args){

    }
}
