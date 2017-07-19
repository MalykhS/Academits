package ru.academits.malykh.list;

public class SinglyLinkedList<T> {
    private ListElement<T> head;
    private int size;

    public void printList() {
        for (ListElement<T> p = head; p != null; p = p.getNext()) {
            System.out.println(p.getData());
        }
    }

    private void printCheckListEmpty() {
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }
    }

    private void printCheckPresenceListItem(int index) {
        if (index > getSize() || index < 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such index in the list!");
        }
    }

    public int getSize() {
        return size;
    }

    public ListElement<T> getHead() {
        return head;
    }

    public T getListElement(int index) {
        return getNode(index).getData();
    }

    public T setValue(int index, T element) {
        printCheckListEmpty();
        printCheckPresenceListItem(index);

        int count = -1;
        ListElement<T> p1 = new ListElement<>();

        for (ListElement<T> p = head; p != null; p = p.getNext()) {
            count++;

            if (count == index) {
                p1.setData(p.getData());
                p.setData(element);
                return p1.getData();
            }
        }
        return null;
    }

    public ListElement<T> getNode(int index) {
        printCheckListEmpty();
        printCheckPresenceListItem(index);

        int count = -1;
        ListElement<T> p;
        for (p = head; p != null; p = p.getNext()) {
            count++;
            if (count == index) {
                return p;
            }
        }
        return null;
    }

    public void getDeletedElement(int index) {
        printCheckListEmpty();
        printCheckPresenceListItem(index);

        int count = -1;
        for (ListElement<T> p = head, prev = null; p != null; prev = p, p = p.getNext()) {
            count++;
            if (count == index) {
                if (index == 0) {
                    getDeletedFirstElement();
                } else {
                    assert prev != null;
                    prev.setNext(prev.getNext().getNext());
                }
                size--;
            }
        }
    }

    public void addFirst(T element) {
        head = new ListElement<>(element, head);
        size++;
    }

    public void addElement(int index, T element) {

        printCheckPresenceListItem(index);

        int count = -1;
        for (ListElement<T> p = head, prev = null; p != null; prev = p, p = p.getNext()) {
            count++;
            if (index == 0) {
                addFirst(element);
                return;
            }
            if (count == index) {
                assert prev != null;
                prev.setNext(new ListElement<>(element, p));
                size++;
            }
        }
    }

    public void removeNodeByValue(T value) {
        printCheckListEmpty();

        for (ListElement<T> p = head, prev = null; p != null; prev = p, p = p.getNext()) {
            if (p.getData().equals(value)) {
                assert prev != null;
                prev.setNext(prev.getNext().getNext());
                size--;
            }
        }
    }

    public boolean removeNode(ListElement<T> p1) {

        ListElement<T> p;
        for (p = head; p != null; p = p.getNext()) {
            if (p.getData().equals(p1.getData())) {
                p.setNext(p.getNext().getNext());
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean addNode(ListElement<T> p1, ListElement<T> p2) {
        for (ListElement<T> p = head, prev = null; p != null; prev = p, p = p.getNext()) {
            if (p1.getData().equals(0)) {
                addElement(1, p2.getData());
                return true;
            }
            if (p.getData().equals(p1.getData())) {
                assert prev != null;
                p.setNext(new ListElement<>(p2.getData(), p.getNext()));
                size++;
                return true;
            }
        }
        return false;
    }

    public void getDeletedFirstElement() {
        printCheckListEmpty();
        head = head.getNext();
        size--;
    }

    public void invertList() {
        ListElement<T> p = head;
        ListElement<T> prev = null;
        while (p != null) {
            ListElement<T> temp = p.getNext();
            p.setNext(prev);
            prev = p;
            head = p;
            p = temp;
        }
    }

    public void copyList(SinglyLinkedList<T> list) {
        for (ListElement<T> p = list.head; p != null; p = p.getNext()) {
            head = new ListElement<>(p.getData(), head);
        }
        list.invertList();
    }
}