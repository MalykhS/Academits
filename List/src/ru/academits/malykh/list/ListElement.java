package ru.academits.malykh.list;

public class ListElement<T> {
    ListElement next;
    T data;

    ListElement(T data) {
        this.data = data;
    }

    ListElement(T data, ListElement next) {
        this.data = data;
        this.next = next;
    }

    ListElement getNext() {
        return next;
    }

    ListElement() {

    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    T getData() {
        return this.data;
    }

}