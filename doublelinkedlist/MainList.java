package lesson4.doublelinkedlist;

public class MainList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst("Oleg", 23);
        list.insertFirst("Ivan", 35);
        list.insertFirst("Maria", 21);

        list.insertLast("Semen",55);
        list.print();
        System.out.println();
        list.delete("Oleg");
        list.print();
    }
}
