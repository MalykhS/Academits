package ru.academits.malykh.list;

public class SinglyLinkedList<T> {
    private ListElement head;

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

    public int getListElement(int index) {
        nullPointerException();

        int count = -1;
        for (ListElement p = head; p != null; p = p.next) {
            count++;
            if (count == index) {
                return (int) p.data;
            }
        }

        arrayIndexOutOfBoundsException(index, count);
        return 0;
    }

    public void setValue(T element, int index) { //изменить значение по указанному индексу
        nullPointerException();
        int count = -1;

        for (ListElement p = head; p != null; p = p.next) {
            count++;

            if (count == index) {
                ListElement p1 = new ListElement();
                p1.data = p.data;
                p.data = element;
                // return p1.data;
            }
        }

        arrayIndexOutOfBoundsException(index, count);
        //return 0;
    }

    public ListElement getNode(int index) {//получение узла по индексу
        nullPointerException();

        int count = -1;
        ListElement p;
        for (p = head; p != null; p = p.next) {
            count++;
            if (count == index) {
                return p;
            }
        }

        arrayIndexOutOfBoundsException(index, count);
        return null;
    }

    public void getDeletedElement(int index) { //удаление элемента по индексу
        nullPointerException();

        int count = -1;
        for (ListElement p = head, prev = null; p != null; prev = p, p = p.next) {
            count++;
            if (count == index) {
                if (index == 0) {
                    ListElement p1 = head;
                    getDeletedFirstElement();
                    //return p1.getData();
                } else {
                    assert prev != null;
                    prev.next = prev.next.next;
                    //return p.data;
                }
            }
        }

        arrayIndexOutOfBoundsException(index, count);
        //return 0;
    }

    public void addFirst(T element) {
        head = new ListElement<>(element, head);
    }

    private void addElement(T element, int index) {
        int count = -1;
        for (ListElement p = head, prev = null; p != null; prev = p, p = p.next) {
            count++;
            if (index == 0) {
                addFirst(element);
                return;
            }
            if (count == index) {
                assert prev != null;
                prev.next = new ListElement<>(element, p);
            }
        }

        arrayIndexOutOfBoundsException(index, count);
    }

    public void removeNodeByValue(T value) { //удаление узла по значению ??????
        nullPointerException();

        for (ListElement p = head, prev = null; p != null; prev = p, p = p.next) {
            if (p.data == value) {
                assert prev != null;
                prev.next = prev.next.next;
            }
        }
    }

    public boolean removeNode(ListElement p1) {

        ListElement p;
        for (p = head; p != null; p = p.next) {
            if (p.data == p1.data) {
                p.next = p.next.next;
                return true;
            }
        }
        return false;
    }

    public boolean addNode(ListElement<T> p1, ListElement<T> p2) {
        for (ListElement p = head, prev = null; p != null; prev = p, p = p.next) {
            if (p1.data.equals(0)) {
                addElement(p2.data, 1);
                return true;
            }
            if (p.data == p1.data) {
                assert prev != null;
                prev.next.next = new ListElement<>(p2.data, p.next);
                return true;
            }
        }
        return false;
    }

    private void getDeletedFirstElement() {
        nullPointerException();
        head = head.getNext();
    }

    private void invertList() {
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

    public void copyList(SinglyLinkedList<T> list) {
        SinglyLinkedList<T> list1 = new SinglyLinkedList<>();
        ListElement p1 = new ListElement<>();
        for (ListElement p = head; p != null; p = p.next) {
            p1.data = p.data;
            list1.addFirst((T) p1.data);
            /*p1 = new ListElement<>();
            p1.data = p.data;
            list1.addFirst((T) p.data);
            /*p1 = new ListElement(p.data);
            list1.addFirst(p1.data);*/
        }
        //list.invertList();
    }
}