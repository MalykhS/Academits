package ru.academits.malykh.main;

import ru.academits.malykh.list.ListElement;
import ru.academits.malykh.list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
        list.addFirst(5);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);

        list.setValue(1, 8);
        System.out.println();

        list.printList();



    }
}