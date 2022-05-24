public class LinkedList{

    Node head;

    class Node{
        
        int data;
        Node next;

        Node(int value){
            data=value;
            next=null;
        }
    }

    LinkedList insert(LinkedList list, int value){
        
        Node new_node = new Node(value);
        new_node.next=null;

        if(list.head==null){
            list.head=new_node;
        }
        else{

            Node last=list.head;

            while(last.next!=null){
                last=last.next;
            }

            last.next=new_node;
        }

        return list;
    }

    void printList(LinkedList list){
        Node current_node=list.head;
        if(current_node==null){
            System.out.println("No items are present in the list");
        }
        else{
            System.out.println("LinkedList: ");
            while(current_node!=null){
                System.out.print(current_node.data+" ");
                current_node=current_node.next;
            }
        }
    }

    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.insert(list, 1);
        list.insert(list,2);
        list.printList(list);
    }
}