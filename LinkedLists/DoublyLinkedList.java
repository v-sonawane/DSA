public class DoublyLinkedList {

    Node head;

    class Node{
        int data;
        Node prev;
        Node next;

        Node(int value){
            data=value;
        }
    }

    //Adding a Node at the front of the list
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        new_node.prev=null;

        if(head!=null){
            head.prev=new_node;
        head=new_node;

        }
    }

    //Adding a node before a given node

    public static void main(String[] args){

    }
}
