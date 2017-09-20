package malykh.internetProducts;

public class ProgrammingBook extends Book {
    private String programmingLanguage;

    private String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public ProgrammingBook(String name, int price, String barcode, int pagesCount, String programmingLanguage) {
        super(name, price, barcode, pagesCount);
        this.programmingLanguage = programmingLanguage;
        setNumber("2.3");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Язык программирования: " + getProgrammingLanguage());
    }

    @Override
    public String toString() {
        return "Книга по программированию";
    }
}