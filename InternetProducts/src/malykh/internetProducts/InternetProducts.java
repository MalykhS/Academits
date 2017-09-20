package malykh.internetProducts;

import java.util.List;

public class InternetProducts implements View {
    private String title;
    private int price;
    private String barcode;
    private String number;

    public enum diskType {CD, DVD}

    public String getNumber() {
        return number;
    }

    void setNumber(String number) {
        this.number = number;
    }

    private String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    InternetProducts(String name, int price, String barcode) {
        this.title = name;
        this.price = price;
        this.barcode = barcode;
    }

    public static void display(List<InternetProducts> list) {
        for (InternetProducts e : list) {
            System.out.println(e);
            e.print();
            System.out.println();
        }
    }

    @Override
    public void print() {
        System.out.println("Название: " + getTitle());
        System.out.println("Цена: " + getPrice());
        System.out.println("Штрихкод: " + getBarcode());
    }
}