package ru.academits.malykh.main;

import ru.academits.malykh.list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();

        list.addFirst(0);
        list.addFirst(1);

        list.copyList(list);

        System.out.println();
        list1.printList();



    }
}