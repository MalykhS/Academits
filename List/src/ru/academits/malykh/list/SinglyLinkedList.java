package ru.academits.malykh.list;

public class SinglyLinkedList {
    private ListElement head;
    private ListElement tail;

    public void printList() {
        for (ListElement p = head; p != null; p = p.getNext()) {
            System.out.println(p.getData());
        }
    }

    private void getNullPointerException() {
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }
    }

    private void getArrayIndexOutOfBoundsException(int index, int count) {
        if (index > count || index < 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such index in the list!");
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
        getNullPointerException();

        int count = -1;
        for (ListElement p = head; p != null; p = p.next) {
            count++;
            if (count == index) {
                return p.data;
            }
        }

        getArrayIndexOutOfBoundsException(index, count);
        return 0;
    }

    public int setValue(int element, int index) { //изменить значение по указанному индексу
        getNullPointerException();
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

        getArrayIndexOutOfBoundsException(index, count);
        return 0;
    }

    public ListElement getNode(int index) {//получение узла по индексу
        getNullPointerException();

        int count = -1;
        ListElement p;
        for (p = head; p != null; p = p.next) {
            count++;
            if (count == index) {
                return p;
            }
        }

        getArrayIndexOutOfBoundsException(index, count);
        return null;
    }

    public int getDeletedElement(int index) { //удаление элемента по индексу
        getNullPointerException();

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

        getArrayIndexOutOfBoundsException(index, count);
        return 0;
    }

    public void addFirst(int element) {
        head = new ListElement(element, head);
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

        getArrayIndexOutOfBoundsException(index, count);
    }

    public void removeNodeByValue(int value) { //удаление узла по значению ??????
        getNullPointerException();

        for (ListElement p = head, prev = null; p != null; prev = p, p = p.next) {
            if (p.data == value) {
                assert prev != null;
                prev.next = prev.next.next;
            }
        }
    }

    public void removeNode(ListElement p1) { // выход за пределы ???
        getNullPointerException();

        ListElement p;
        for (p = head; p != null; p = p.next) {
            if (p.data == p1.data) {
                p.next = p.next.next;
                return;
            }
        }
    }

    public void addNode(ListElement p1, int element) {
        for (ListElement p = head, prev = null; p != null; prev = p, p = p.next) {
            if (p.data == p1.data) {
                assert prev != null;
                prev.next.next = new ListElement(element, p.next);
            }
        }
    }

    private void getDeletedFirstElement() {
        getNullPointerException();
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

    /*public SinglyLinkedList copyList(SinglyLinkedList list) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        for (ListElement p1 = head; p1 != null; p1 = p1.next) {
            for (ListElement p = head; p != null; p = p.next) {
                p.data = p1.data;
                p.next = p1.next;
            }

        }
        return list1;
    } */
}