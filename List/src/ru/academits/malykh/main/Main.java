package ru.academits.malykh.main;

import ru.academits.malykh.list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(9);
        list.addFirst(6);
        list.addFirst(1);
        list.addFirst(123);
        System.out.println(list.removeFirstElement());
        System.out.println();
        list.printList();

    }
}
