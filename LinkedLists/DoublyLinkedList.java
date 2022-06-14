public class DoublyLinkedList {
    Node head;
    class Node{
        int data;
        Node prev,next;
    
    Node(int value){
        data=value;
        prev=null;
        next=null;

    }
    }
    DoublyLinkedList insert(DoublyLinkedList list,int value){
        Node new_node=new Node(value);
        Node curNode=list.head;
        if(curNode==null){
            curNode=new_node;
            curNode.prev.data=-1;
            curNode.prev=null;
            curNode.next=null;
        }
        else{
            while(curNode.next!=null){
                curNode=curNode.next;
            }
            curNode.next=new_node;
            new_node.prev=curNode;
        }
        return list;
    }

    void printList(DoublyLinkedList list){
        Node curNode=list.head;
        while(curNode.next!=null){
            System.out.println("This is the current node: "+curNode.data+". This is it's previous node: "+curNode.prev+". This is it's next node: "+curNode.next+".");
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list=new DoublyLinkedList();
        list.insert(list,1);
        list.insert(list, 2);
        list.printList(list);

    }
}
