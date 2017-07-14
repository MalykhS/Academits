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

    public int getListElement(int index) { //получить значение по указанному индексу
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }

        int count = -1;
        for (ListElement p = head; p != null; p = p.next) {
            count++;
            if (count == index) {
                return p.data;
            }
        }

        if (index > count || index <= 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such index in the list!");
        }
        return 0;
    }

    public int setValue(int element, int index) { //изменить значение по указанному индексу
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }
        int count = -1;

        for (ListElement p = head; p != null; p = p.next) {
            count++;

            if (count == index) {
                ListElement p1 = new ListElement();
                p1.data = p.data;
                p.data = element;
                return p1.data;
            }
        }

        if (index > count || index <= 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such index in the list!");
        }
        return 0;
    }

    public ListElement getNode(int index) {//получение узла по индексу
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }

        int count = -1;
        ListElement p;
        for (p = head; p != null; p = p.next) {
            count++;
            if (count == index) {
                return p;
            }
        }

        if (index > count || index <= 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such index in the list!");
        }
        return null;
    }

    public int getDeletedElement(int index) { //удаление элемента по индексу
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }

        int count = -1;
        for (ListElement p = head, prev = null; p != null; prev = p, p = p.next) {
            count++;
            if (count == index) {
                if (index == 0) {
                    ListElement p1 = head;
                    getDeletedFirstElement();
                    return p1.getData();
                } else {
                    assert prev != null;
                    prev.next = prev.next.next;
                    return p.data;
                }
            }
        }

        if (index > count || index < 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such index in the list!");
        }
        return 0;
    }

    public void addFirst(int element) {
        head = new ListElement(element, head);
    }

    public void addLast(int element) {

    }

    public void addElement(int element, int index) {
        int count = -1;
        for (ListElement p = head, prev = null; p != null; prev = p, p = p.next) {
            count++;
            if (index == 0) {
                addFirst(element);
                return;
            }
            if (count == index) {
                assert prev != null;
                prev.next = new ListElement(element, p);
            }
        }

        if (index > count || index < 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such index in the list!");
        }
    }

    public void removeNode(int value) { //удаление узла по значению ??????
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }

        for (ListElement p = head, prev = null; p != null; prev = p, p = p.next) {
            if (p.data == value) {
                assert prev != null;
                prev.next = prev.next.next;
            }
        }
    }

    public void removeNode1(ListElement p1) { // не работает
        for (ListElement p = head, prev = null; p != null; prev = p, p = p.next) {
            if (p.next.data == p1.next.data) {
                System.out.println(p.getData());
            }
        }
    }

    private void getDeletedFirstElement() {
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }

        head = head.getNext();
    }

    public void invertList() {
        ListElement p = head;
        ListElement prev = null;
        while (p != null) {
            ListElement temp = p.next;
            p.next = prev;
            prev = p;
            head = p;
            p = temp;
        }
    }
}