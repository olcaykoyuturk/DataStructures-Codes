package withArray;

public class Main {
    public static void main(String[] args) {
        // Stack oluşturma
        Stack stack = new Stack(5);

        // Stack veri ekleme
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        // Stack veri silme
        stack.pop();
        stack.pop();
        stack.pop();

        // Array'i yazdır
        stack.print();


    }
}