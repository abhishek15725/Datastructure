package java_practice.myqueueL;

public class Main {
    public static void main(String[] args) {
        MyQueueL myQueueL=new MyQueueL();
        myQueueL.enQueue(5);
        myQueueL.enQueue(3);
        myQueueL.enQueue(1);
        System.out.println("dequeue="+myQueueL.deQueue().getData());
    }

}
