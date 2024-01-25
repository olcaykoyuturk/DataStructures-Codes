public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();

        // Liste1 için eleman ekleme silme
        linkedList.basaEkleme(10);
        linkedList.basaEkleme(2);
        linkedList.basaEkleme(30);
        linkedList.sonaEkleme(31);
        linkedList.basaEkleme(98);
        linkedList.arayaEkleme(2, 84);
        linkedList.arayaEkleme(0, 51);
        linkedList.arayaEkleme(7, 99);
        linkedList.bastanSilme();
        linkedList.sondanSilme();
        linkedList.aradanSilme(2);
        linkedList.yazdir();

        // Liste 2 için elemen ekleme silme
        linkedList2.basaEkleme(2);
        linkedList2.basaEkleme(3);
        linkedList2.basaEkleme(44);
        linkedList2.basaEkleme(67);
        linkedList2.basaEkleme(29);
        linkedList2.yazdir();

        // İki listeyi birleştirme
        linkedList.ikiListeEkleme(linkedList, linkedList2);
        linkedList.yazdir();

    }
}