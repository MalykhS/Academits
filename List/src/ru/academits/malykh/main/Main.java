package ru.academits.malykh.main;

import ru.academits.malykh.list.ListElement;
import ru.academits.malykh.list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();

        list.addFirst(100);
        list.addFirst(8);
        list.addFirst(2);
        list.addFirst(null);
        list.addFirst(10);
        list.addFirst(0);

        list.copyList().printList();

        System.out.println();

        list.printList();
    }
}