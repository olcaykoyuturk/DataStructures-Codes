package withLinkedList;

public class Queue {
    private int size;
    private int counter;
    private Node front;
    private Node rear;

    public Queue(int size){
        this.size = size;
        this.counter = 0;
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data){
        if(size == counter){
            System.out.println("Queue dolu!!");
        }else {
            Node eleman = new Node(data);
            if(counter == 0){
                front = eleman;
                rear = eleman;
                System.out.println("Sıraya ilk eleman eklendi => " + eleman.data);
            }else {
                rear.next = eleman;
                rear = rear.next;
                System.out.println("Sıraya eleman eklendi => " + eleman.data);
            }
            counter++;
        }
    }

    public void deQueue(){
        if(counter == 0){
            System.out.println("Queue zaten bos!!");
        }else {
            System.out.println("Sıradan eleman çıkartıldı => " + front.data);
            front = front.next;
            counter--;
        }
    }

    public void print(){
        if(counter == 0){
            System.out.print("Queue zaten bos!!");
        }else {
            Node temp = front;
            System.out.print("Liste: ");
            while (temp != null){
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
