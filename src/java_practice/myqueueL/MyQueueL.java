package java_practice.myqueueL;

public class MyQueueL {
        private Node front;
        private Node rear;
        private int size;
      public MyQueueL() {
          front = null;//head
          rear = null;//tail
          size = 0;
      }
       public boolean isEmpty(){
          boolean response=false;
          if(size==0){
              response=true;
          }
          return response;
        }
        public void enQueue(int element){
          Node node =new Node(element);
          if(front ==null){
              rear=node;
              front=node;
          }
          else{
              rear.setNext(node);
              rear=node;
          }
            size++;
        }
        public Node deQueue(){
          Node response=null;
          if(front!=null){
              if(front.getNext()!=null){
                  response=new Node(front.getData());
                  front =front.getNext();
                  size--;
              }else{
                  response=new Node(front.getData());
                  front=null;
                  rear=null;
                  size--;
              }
          }
          return response;
        }

    }


