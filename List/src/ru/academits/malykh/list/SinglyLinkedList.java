package ru.academits.malykh.list;

public class SinglyLinkedList<T> {
    private ListElement<T> head;
    private int size;

    public void printList() {
        for (ListElement<T> p = head; p != null; p = p.getNext()) {
            System.out.println(p.getData());
        }
    }

    private void checkListIsEmpty() {
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }
    }

    private void checkListItemIsPresence(int index) {
        if (index >= getSize() || index < 0) {
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
        checkListIsEmpty();
        checkListItemIsPresence(index);

        ListElement<T> temp = getNode(index);
        T valueOld = temp.getData();
        temp.setData(element);
        return valueOld;
    }

    public ListElement<T> getNode(int index) {
        checkListIsEmpty();
        checkListItemIsPresence(index);

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

    public T deleteElement(int index) {
        checkListIsEmpty();
        checkListItemIsPresence(index);

        ListElement<T> temp1 = new ListElement<>();
        if (index == 0) {
            return getDeletedFirstElement();
        } else {
            ListElement<T> temp = getNode(index - 1);
            temp1 = temp.getNext();
            temp.setNext(temp.getNext().getNext());
            size--;
        }

        return temp1.getData();
    }

    public void addFirst(T element) {
        head = new ListElement<>(element, head);
        size++;
    }

    public void addElement(int index, T element) {

        checkListItemIsPresence(index);
        getNode(index);
        if (index == 0) {
            addFirst(element);
        } else {
            ListElement<T> temp = getNode(index - 1);
            temp.setNext(new ListElement<>(element, temp.getNext()));
            size++;
        }
    }

    public boolean removeNodeByValue(T value) {
        checkListIsEmpty();

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

        //System.out.println(p1.getData());
        //System.out.println(p1.getData());
            p1.setNext(p1.getNext());
        //p1.setNext(p1.getNext());
        /*ListElement<T> p;
        p1.setNext(p1.getNext().getNext()); */
        return true;
        /*for (p = head; p != null; p = p.getNext()) {
            if (p.getData().equals(p1.getData())) {
                p.setNext(p.getNext().getNext());
                size--;
                return true;
            }
        } */
        //return false;
    }

    public boolean addAfterNode(ListElement<T> p1, T value) {
        checkListIsEmpty();
        for (ListElement<T> p = head; p != null; p = p.getNext()) {
            if (p.getData().equals(p1.getData())) {
                p.setNext(new ListElement<>(value, p.getNext()));
                return true;
            }
        }
        return false;
    }

    public T getDeletedFirstElement() {
        checkListIsEmpty();
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

    public void addLast(T element) {
        if (head == null) {
            addFirst(element);
            return;
        }
        for (ListElement<T> p = head; p != null; p = p.getNext()) {
            if (p.getNext() == null) {
                addAfterNode(p, element);
                size++;
                return;
            }
        }
    }

    public SinglyLinkedList<T> copyList() {
        SinglyLinkedList<T> list1 = new SinglyLinkedList<>();
        ListElement<T> p1;
        for (ListElement<T> p = head; p != null; p = p.getNext()) {
            p1 = new ListElement<>(p.getData());
            list1.addLast(p1.getData());
        }

        return list1;
    }
}