package lesson4.linkedlist;

import java.awt.*;
import java.util.ListIterator;

public class MainLinkedIterator {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkIterator iter = new LinkIterator(list);

        iter.insertAfter("Ivan",24);
        iter.insertBefore("Dima",18);
        list.print();

        System.out.println(iter.deleteCurrent());
        list.print();

    }
}
