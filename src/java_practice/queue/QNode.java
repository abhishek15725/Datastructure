package java_practice.queue;

public class QNode {
    int key;
    QNode next;

    public QNode (int key){
        this.key=key;
        this.next=null;
    }
}
class Queue{
    QNode front,rear;
    public Queue(){

        this.front=this.rear=null;
    }
    void enQueue(int key){
        QNode temp =new QNode(key);
        if(this.rear==null){
            this.front=this.rear=temp;
            return;
        }
        this.rear.next=temp;
        this.rear=temp;
    }

    QNode dequeue()
    {
        if(this.front==null)
            return null;

        QNode temp =this.front;
        this.front=this.front.next;

        if(this.front==null)
            this.rear=null;
        return temp;
    }
}

 class main{
    public static void main(String[] args) {
        Queue queue =new Queue();
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(9);
        queue.dequeue();
        System.out.println("dequeue="+ queue.dequeue().key);
    }
}