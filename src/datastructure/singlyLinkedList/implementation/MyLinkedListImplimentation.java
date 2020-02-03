package datastructure.singlyLinkedList.implementation;
import datastructure.singlyLinkedList.linkedList.MyLinkedList;
import datastructure.singlyLinkedList.node.Node;

public class MyLinkedListImplimentation {
    public static void main(String[] args) {
        MyLinkedList linkedList=new MyLinkedList();

        linkedList.InsertAtLast(200);
        linkedList.InsertAtLast(300);
        linkedList.insertAtBeginning(100);
        linkedList.insertAtBeginning(150);
        linkedList.printList();
        System.out.println();
        Node delete =linkedList.deleteFromBeginning();
        if(delete!=null){
            System.out.println("delete data="+delete.getData());
        }
        else {
            System.out.println("empty list");
        }
        linkedList.printList();

    }
}
