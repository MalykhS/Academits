package ru.academits.malykh.list;

public class SinglyLinkedList<T> {
    private ListElement<T> head;
    private int size;

    public void printList() {
        for (ListElement p = head; p != null; p = p.getNext()) {
            System.out.println(p.getData());
        }
    }

    private void nullPointerException() {
        if (head == null) {
            throw new NullPointerException("List is empty!");
        }
    }

    private void arrayIndexOutOfBoundsException(int index, int count) {
        if (index > count || index < 0) {
            throw new ArrayIndexOutOfBoundsException("There is no such index in the list!");
        }
    }

    public int getSize() {
        return size;
    }

    public ListElement getHead() {
        return head;
    }

    public int getListElement(int index) {
        nullPointerException();

        int count = -1;
        for (ListElement p = head; p != null; p = p.getNext()) {
            count++;
            if (count == index) {
                return (int) p.getData();
            }
        }

        arrayIndexOutOfBoundsException(index, count);
        return 0;
    }

    public void setValue(T element, int index) {
        nullPointerException();
        int count = -1;

        for (ListElement<T> p = head; p != null; p = p.getNext()) {
            count++;

            if (count == index) {
                p.setData(element);
            }
        }

        arrayIndexOutOfBoundsException(index, count);
    }

    public ListElement getNode(int index) {
        nullPointerException();

        int count = -1;
        ListElement p;
        for (p = head; p != null; p = p.getNext()) {
            count++;
            if (count == index) {
                return p;
            }
        }

        arrayIndexOutOfBoundsException(index, count);
        return null;
    }

    public void getDeletedElement(int index) {
        nullPointerException();

        int count = -1;
        for (ListElement<T> p = head, prev = null; p != null; prev = p, p = p.getNext()) {
            count++;
            if (count == index) {
                if (index == 0) {
                    ListElement p1 = head;
                    getDeletedFirstElement();
                } else {
                    assert prev != null;
                    prev.setNext(prev.getNext().getNext());
                }
                size--;
            }
        }

        arrayIndexOutOfBoundsException(index, count);
    }

    public void addFirst(T element) {
        head = new ListElement<>(element, head);
        size++;
    }

    public void addElement(T element, int index) {
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

        arrayIndexOutOfBoundsException(index, count);
    }

    public void removeNodeByValue(T value) {
        nullPointerException();

        for (ListElement<T> p = head, prev = null; p != null; prev = p, p = p.getNext()) {
            if (p.getData() == value) {
                assert prev != null;
                prev.setNext(prev.getNext().getNext());
                size--;
            }
        }
    }

    public boolean removeNode(ListElement p1) {

        ListElement<T> p;
        for (p = head; p != null; p = p.getNext()) {
            if (p.getData() == p1.getData()) {
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
                addElement(p2.getData(), 1);
                return true;
            }
            if (p.getData() == p1.getData()) {
                assert prev != null;
                p.setNext(new ListElement<>(p2.getData(), p.getNext()));
                size++;
                return true;
            }
        }
        return false;
    }

    public void getDeletedFirstElement() {
        nullPointerException();
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