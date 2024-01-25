package withLinkedList;

public class LinkedList {
    private Node top;
    private int size;
    private int indis;

    public LinkedList(int size){
        this.top = null;
        this.size = size;
        this.indis = 0;
    }

    public void push(int data){
        Node eleman = new Node();
        eleman.data = data;

        if(indis == size){
            System.out.println("Liste dolu, eleman eklenemedi!");
        }
        else {
            if(indis == 0){
                top = eleman;
                System.out.println("Liste bos, ilk eleman eklendi => " + data);
                indis++;
            }
            else {
                eleman.next = top;
                top = eleman;
                indis++;
                System.out.println("Stack'a eleman eklendi => " + data);
            }
        }
    }

    public void pop() {
        if (indis == 0) {
            System.out.println("Stack zaten bos!!");
        } else {
            System.out.println("Stack'tan eleman cikartildi => " + top.data);
            Node temp = top;
            top = top.next;
            temp.next = null; // Opsiyonel, gereksiz referansları null yapmak iyi bir pratiktir.
            indis--;
        }
    }


    public void print(){
        if(indis == 0){
            System.out.println("Liste bos!");
        }
        else {
            Node temp = top;
            System.out.println("Stack: ");

            while (temp != null){
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
