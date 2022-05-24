import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class DeleteFromEnd {
    
    Node head;

    class Node{
        
        int data;
        Node next;

        Node(int value){
            data=value;
            next=null;
        }
    }

    DeleteFromEnd insert(DeleteFromEnd list, int value){
        
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

    DeleteFromEnd deleteFromEnd(DeleteFromEnd list){
        if(list.head==null){
            return null;
        }
        else{
            while(list.head.next.next!=null){
                list.head=list.head.next;
            }
            list.head.next=null;
        }
        return list;
    }

    void printList(DeleteFromEnd list){
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
        DeleteFromEnd list=new DeleteFromEnd();
        list.insert(list, 1);
        list.insert(list,2);
        list.deleteFromEnd(list);
        list.printList(list);
    }
}
