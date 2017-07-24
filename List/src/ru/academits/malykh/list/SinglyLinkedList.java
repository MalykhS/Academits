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

        T oldValue;
        if (index == 0) {
            return getDeletedFirstElement();
        } else {
            ListElement<T> temp = getNode(index - 1);
            oldValue = temp.getNext().getData();
            removeAfterNode(temp);
        }

        return oldValue;
    }

    public void addFirst(T element) {
        head = new ListElement<>(element, head);
        size++;
    }

    public void addElement(int index, T element) {

        if (index == 0 || head == null) {
            addFirst(element);
        } else {
            ListElement<T> temp = getNode(index - 1);
            addAfterNode(temp, element);
        }
    }

    public boolean removeNodeByValue(T value) {
        checkListIsEmpty();

        if (value.equals(head.getData())) {
            getDeletedFirstElement();
            return true;
        }

        for (ListElement<T> p = head, prev = null; p != null; prev = p, p = p.getNext()) {

            if (p.getData() == null) {
                continue;
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

    public void removeAfterNode(ListElement<T> p) {
        if (p.getNext() == null) {
            return;
        }
        p.setNext(p.getNext().getNext());
        size--;
    }

    public void addAfterNode(ListElement<T> p, T value) {
        p.setNext(new ListElement<>(value, p.getNext()));
        size++;
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

    public SinglyLinkedList<T> copyList() {
        SinglyLinkedList<T> list1 = new SinglyLinkedList<>();
        ListElement<T> p1;

        for (ListElement<T> p = head; p != null; p = p.getNext()) {
            p1 = new ListElement<>(p.getData());
            list1.addElement(list1.getSize(), p1.getData());
        }

        return list1;
    }
}