package ru.academits.malykh.list;

public class ListElement {
    ListElement next; //ссылка на элемент
    int data; //данные в узле

    public ListElement(int data) {
        this.data = data;
    }

    ListElement(int data, ListElement next) {
        this.data = data;
        this.next = next;
    }

    public ListElement getNext() {
        return next;
    }

    public ListElement() {

    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public int getData() {
        return this.data;
    }

}