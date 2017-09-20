package malykh.internetProducts;

public class Book extends InternetProducts {
    private int pagesCount;

    private int getPagesCount() {
        return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    Book(String name, int price, String barcode, int pagesCount) {
        super(name, price, barcode);
        this.pagesCount = pagesCount;
        setNumber("2");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Количество страниц:" + getPagesCount());
    }
}