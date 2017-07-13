package ru.academits.malykh.list;

public class SinglyLinkedList {
    private ListElement head;
    private ListElement tail;

    public void printList() {
        for (ListElement p = head; p != null; p = p.getNext()) {
            System.out.println(p.getData());
        }
    }

    public int getSize() {
        int count = 0;
        if (head != null) {
            count++;
            while (head.next != null) {
                count++;
                head = head.next;
            }
        } else {
            return 0;
        }
        return count;
    }

    public ListElement getHead() {
        return head;
    }

    public ListElement getListElement(int index) {
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }

        int count = 0;
        ListElement p;
        for (p = head; p != null; p = p.next) {
            count++;
            if (count == index) {
                return p;
            }
        }
        return p;
    }

    public void getValue(int index) {
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }
    }

    public void setValue(int element, int index) {
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }

        if (head.data == index) {
            head.data = element;
            return;
        }

        /*if (tail.data == index) {
            tail.data = element;
            return;
        } */

        ListElement listElement = head;
        while (listElement != null) {
            if (listElement.data == index) {
                listElement.data = element;
                return;
            }
            listElement = listElement.next;
        }
    }

    public void addFirst(int element) {
        head = new ListElement(element, head);
    }

    /*public void addLast(int element) {
        ListElement listElement = new ListElement(element, tail);
        listElement.data = element;
        tail = listElement.next;
        tail = listElement;
    } */

    public int removeFirstElement() {
        ListElement p = head;
        head = head.getNext();
        return p.getData();
    }


    //head = head.getNext();


    //return p.getData();
}
