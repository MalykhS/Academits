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

        ListElement<T> p = new ListElement<>();
        //p.setData(getNode(index).getData());



        getNode(index).setData(element);
        return getNode(index).getData();
        //return p.getData();
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

    public T deletedElement(int index) {
        printCheckListEmpty();
        printCheckPresenceListItem(index);

        if (index == 0) {
            getDeletedFirstElement();

        } else {
            getNode(index - 1).setNext(getNode(index).getNext());
        }
        size--;

        return getNode(index).getData();
    }

    public void addFirst(T element) {
        head = new ListElement<>(element, head);
        size++;
    }

    public void addElement(int index, T element) {

        printCheckPresenceListItem(index);
        getNode(index);
        if (index == 0) {
            addFirst(element);
        } else {
            getNode(index - 1).setNext(new ListElement<>(element, getNode(index)));
        }
        size++;
    }

    public boolean removeNodeByValue(T value) {
        printCheckListEmpty();

        for (ListElement<T> p = head, prev = null; p != null; prev = p, p = p.getNext()) {
            if (value.equals(0)) {
                getDeletedFirstElement();
                return true;
            }
            if (p.getData().equals(value)) {
                assert prev != null;
                prev.setNext(prev.getNext().getNext());
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean removeAfterNode(ListElement<T> p1) {

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

    public boolean addAfterNode(ListElement<T> p1, T value) {
        printCheckListEmpty();
        for (ListElement<T> p = head; p != null; p = p.getNext()) {
            if (p.getData().equals(p1.getData())) {
                p.setNext(new ListElement<>(value, p.getNext()));
                return true;
            }
        }
        return false;
    }

    public T getDeletedFirstElement() {
        printCheckListEmpty();
        ListElement<T> p = head;
        head = head.getNext();
        size--;
        return p.getData();
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

    public SinglyLinkedList<T> copyList() {
        SinglyLinkedList<T> list1 = new SinglyLinkedList<>();
        ListElement<T> p1;
        for (ListElement<T> p = head; p != null; p = p.getNext()) {
            p1 = new ListElement<>(p.getData());
            list1.addFirst(p1.getData());
        }
        list1.invertList();

        return list1;
    }
}