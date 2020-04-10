package java_practice.myqueue;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue(200);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        System.out.println(myQueue.peek());
    }
}
