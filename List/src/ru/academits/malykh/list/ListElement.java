package ru.academits.malykh.list;

public class ListElement<T> {
    private ListElement<T> next;
    private T data;

    ListElement() {}

    ListElement(T data) {
        this.data = data;
    }

    ListElement(T data, ListElement<T> next) {
        this.data = data;
        this.next = next;
    }

    ListElement<T> getNext() {
        return next;
    }

    void setData(T data) {
        this.data = data;
    }

    void setNext(ListElement<T> next) {
        this.next = next;
    }

    T getData() {
        return this.data;
    }

}