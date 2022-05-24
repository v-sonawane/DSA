public class InsertAnywhere {
    
    Node head;

    class Node{
        
        int data;
        Node next;

        Node(int value){
            data=value;
            next=null;
        }
    }

    InsertAnywhere insert(InsertAnywhere list, int value){
        
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

    InsertAnywhere insertAnywhere(InsertAnywhere list, int pos,int value){
        Node new_node=new Node(value);
        Node curNode=list.head;
        if(pos==1){
            if(curNode==null){
                curNode=new_node;
            }
            else{
                new_node.next=curNode;
                curNode=new_node;
            }
        }
        else{
            int i=1;
            while(i<=pos-2){
                curNode=curNode.next;
                i++;
            }
            Node temp=curNode.next;
            curNode.next=new_node;
            new_node.next=temp;
        }
        return list;
    }

    void printList(InsertAnywhere list){
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
        InsertAnywhere list=new InsertAnywhere();
        list.insert(list, 1);
        list.insert(list,2);
        list.insert(list,3);
        list.insertAnywhere(list, 2,5);      
        list.printList(list);
    }
}
