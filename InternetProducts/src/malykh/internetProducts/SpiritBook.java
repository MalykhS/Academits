package malykh.internetProducts;

public class SpiritBook extends Book {
    private int age;

    private int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SpiritBook(String name, int price, String barcode, int pagesCount, int age) {
        super(name, price, barcode, pagesCount);
        this.age = age;
        setNumber("2.1");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Минимальный возраст: " + getAge());
    }

    @Override
    public String toString() {
        return "Книга по эзотерике";
    }
}