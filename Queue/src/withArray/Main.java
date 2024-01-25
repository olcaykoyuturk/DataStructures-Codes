package withArray;

public class Main {
    public static void main(String[] args) {
        // Queue oluşturma
        Queue queue = new Queue(5);

        // Queue veri ekleme
        queue.enQueue(5);
        queue.enQueue(3);
        queue.enQueue(1);
        queue.enQueue(7);
        queue.enQueue(10);
        queue.enQueue(4);

        // Queue veri çıkarma
        queue.deQueue();
        queue.deQueue();

        // Queue yazdırma
        queue.print();
    }
}
