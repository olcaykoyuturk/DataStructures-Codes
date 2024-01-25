package withArray;

public class Queue {
    private int array[];
    private int size;
    private int rear;
    private int front;

    public Queue(int size){
        this.size = size;
        array = new int[size];
        this.rear = -1;
        this.front = 0;
    }

    public void enQueue(int data){
        if((size-1) == rear){
            System.out.println("Queue dolu!!");
        }else{
            rear++;
            array[rear] = data;
        }
    }
    public void deQueue(){
        if (rear == -1){
            System.out.println("Queue zaten bos!!");
        }else {
            for (int i=1; i<=rear; i++){
                array[i-1] = array[i];
            }
            rear--;
        }
    }

    public void print(){
        if(rear == -1){
            System.out.println("Queue zaten bos!!");
        }else {
            System.out.print("Liste =>");
            for (int i=0; i<=rear; i++){
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }
}
