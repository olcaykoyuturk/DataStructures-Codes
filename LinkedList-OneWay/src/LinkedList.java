public class LinkedList {
    public Node head;

    public LinkedList(){
        this.head = null;
    }

    public void basaEkleme(int data){
        Node eleman = new Node();
        eleman.data = data;

        if(head == null){
            eleman.next = null;
            head = eleman;
            System.out.println("Listeye ilk eleman eklendi! => " + eleman.data);
        }
        else{
            eleman.next = head;
            head = eleman;
            System.out.println("Listenin basina eleman eklendi => " + eleman.data);
        }
    }

    public void sonaEkleme(int data){
        Node eleman = new Node();
        eleman.data = data;

        if (head == null){
            eleman.next = null;
            head = eleman;
            System.out.println("Listeye ilk eleman eklendi! => " + eleman.data);
        }
        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            eleman.next = null;
            temp.next = eleman;
            System.out.println("Listenin sonuna eleman eklendi! => " + eleman.data);
        }
    }

    public void arayaEkleme(int indis, int data){
        Node eleman = new Node();
        eleman.data = data;

        if (head == null && indis == 0){ // Liste boşsa
            eleman.next = null;
            head = eleman;
            System.out.println("Listeye ilk eleman eklendi! => " + eleman.data);
        }
        else if(head != null && indis == 0){ // Listenin başına eleman ekleme
            eleman.next = head;
            head = eleman;
            System.out.println("Basa eleman eklendi! =>" + eleman.data);
        }
        else {
            Node temp = head;
            Node temp2 = head;
            int n = 0;

            while (temp.next != null){
                temp2 = temp;
                temp = temp.next;
                n++;
            }

            if(indis == n){ // Listenin sonuna eleman ekleme
                eleman.next = temp;
                temp2.next = eleman;
                System.out.println(n + ". indise eleman eklendi => " + eleman.data);
            }
            else { // Araya ekleme durumları
                temp = head;
                temp2 = head;
                int i = 0;
                while (temp.next != null && i < indis){
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                eleman.next =temp;
                temp2.next = eleman;
                System.out.println(i + ". indise eleman eklendi => " + eleman.data);
            }
        }
    }

    public void bastanSilme(){
        if(head == null){ // Listede eleman yok iste
            System.out.println("Liste boş");
        }
        else if(head.next == null){ // Listede tek eleman var iste
            head = null;
            System.out.println("İlk eleman silindi, liste tamamen boş!");
        }
        else{
            head = head.next;
            System.out.println("İlk eleman silindi!");
        }
    }

    public void sondanSilme(){
        if(head == null){
            System.out.println("Liste boş");
        }
        else if(head.next == null){
            head = null;
            System.out.println("İlk eleman silindi, liste boş");
        }
        else {
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null){
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            System.out.println("Sondan eleman silindi");
        }
    }

    public void aradanSilme(int indis){
        if(head == null){
            System.out.println("Liste bos");
        }
        else if(head.next == null && indis == 0) {
            head = null;
            System.out.println("Listedeki ilk eleman silindi, liste bos");
        } else {
            Node temp = head;
            Node temp2 = head;
            int n = 0;

            while (temp.next != null){
                temp2 = temp;
                temp = temp.next;
                n++;
            }
            if (n == indis){
                temp2.next = null;
                System.out.println("Listedeki son eleman silindi.");
            }
            else {
                temp = head;
                temp2 = head;
                int i = 0;

                while (i != indis){
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                temp2.next = temp.next;
                System.out.println("Aradaki eleman silindi.");
            }
        }
    }

    public void ikiListeEkleme(LinkedList list1, LinkedList list2){
        Node temp = list1.head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = list2.head;
    }

    public void yazdir(){
        if(head == null){
            System.out.println("Liste bos!");
        }
        else {
            Node temp = head;
            System.out.print("Liste, ");
            while (temp != null){
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
}
