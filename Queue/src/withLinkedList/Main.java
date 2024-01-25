package withLinkedList;

public class Main {
    public static void main(String[] args) {
        // Queue oluşturuldu
        Queue queue = new Queue(5);

        // Kuyruga veri ekleme
        queue.enQueue(5);
        queue.enQueue(1);
        queue.enQueue(4);
        queue.enQueue(3);
        queue.enQueue(7);
        queue.enQueue(9);

        // Kuyrukdan veri silme
        queue.deQueue();
        queue.deQueue();

        // Kuyrugu yazdirma
        queue.print();

    }
}
