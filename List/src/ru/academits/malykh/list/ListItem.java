package ru.academits.malykh.list;

class ListItem {
    private ListItem next; //ссылка на элемент
    private int data; //данные в узле

    public ListItem(int data) {
        this.data = data;
    }

    public ListItem(int data, ListItem next) {
        this.data = data;
        this.next = next;
    }

    public int getData(int data) {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }
}
