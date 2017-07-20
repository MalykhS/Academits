package ru.academits.malykh.main;

import ru.academits.malykh.list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();

        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(1);
        list.addFirst(0);



        System.out.println(list.getDeletedFirstElement());
        System.out.println();
        list.printList();


        //list1.printList();



    }
}