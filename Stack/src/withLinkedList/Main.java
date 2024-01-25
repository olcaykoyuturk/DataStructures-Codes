package withLinkedList;

public class Main {
    public static void main(String[] args) {
        // Stack oluşturuldu
        LinkedList linkedList = new LinkedList(5);

        // Stack eleman ekleme
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        linkedList.push(6);

        linkedList.print();

        //Stack eleman silme
        linkedList.pop();
        linkedList.pop();

        // Yazdırma
        linkedList.print();
    }
}
