package ru.academits.malykh.main;

import ru.academits.malykh.list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
        list2.addFirst(10);
        list2.addFirst(20);

        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);

        list1.copyList(list2);

        list2.printList();
        System.out.println();
        list1.printList();

    }
}