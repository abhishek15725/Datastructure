package datastructure.singlyLinkedList.linkedList;
import datastructure.singlyLinkedList.node.Node;
public class MyLinkedList {
    Node head;

    public Node getHead() {
        return head;
    }

    public MyLinkedList(){
        head=null;

    }
    //insert at Last
    public void InsertAtLast(int data){
        Node node =new Node(data);
        if(head==null){
            head=node;
        }
        else{
            Node temp =head;
            while (temp.getNext() !=null){
                temp =temp.getNext();
            }
            temp.setNext(node);
        }
    }
    //traverse
   public void printList(){
        System.out.println("printing list...");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.getData());
            temp=temp.getNext();
            if(temp!=null){
                System.out.print("---->");
            }
        }
    }
    //insertAtBeginning
    public void insertAtBeginning(int data){
        Node node=new Node(data);
        node.setNext(head);
        head=node;
    }
    //delete from beginning
    public Node deleteFromBeginning(){
        Node response=null;
        response=head;
        if(head!=null){
            head=head.getNext();
        }
        return response;
    }
    //delete FromLast
    public Node deleteFromLst(){
        Node response=null;
        if(head!=null){
            Node temp =head;
            Node previous=null;
            while(temp.getNext()!=null){
                previous=temp;
                temp=temp.getNext();
            }
            if(previous!=null){
                response=previous.getNext();
                previous.setNext(null);
            }
            else{
                response=head;
                head=null;
            }
        }
        return response;
    }
}
