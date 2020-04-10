package java_practice.myqueue;

public class MyQueue {
    private int[] queue;
    private int rear;
    private int front;
    private int size;

public boolean isEmpty() {
    boolean response = false;
    if (front == rear) {
        response = true;
    }
    return response;
}
public boolean enqueue(int element) {
    boolean response = false;
    if (rear != queue.length - 1) {
        rear++;
        queue[rear] = element;
        response = true;
        size++;
    }
    return response;
}
public MyQueue(int sizeOfArray) {
    queue = new int[sizeOfArray];
    rear = -1;
    front = -1;
    size = 0;
}
public int dequeue() {
    int response = 0;
    if (!isEmpty()) {
        front++;
        response = queue[front];
    }
    size--;

    return response;
}
public int peek(){
    int response=0;
    if(!isEmpty()){
        response=queue[front];
    }return response;
}
    }



