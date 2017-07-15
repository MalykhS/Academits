package ru.academits.malykh.main;

import ru.academits.malykh.list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        SinglyLinkedList list1 = new SinglyLinkedList();
        list.addFirst(4);
        list.addFirst(33);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        //System.out.println(list1.copyList(list));
        System.out.println();
        list.printList();

        //System.out.println(list.getListElement(6));
    }
}