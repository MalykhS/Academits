package malykh.internetProducts;

public class CookBook extends Book {
    private String ingredient;

    private String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public CookBook(String name, int price, String barcode, int pagesCount, String ingredient) {
        super(name, price, barcode, pagesCount);
        this.ingredient = ingredient;
        setNumber("2.2");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Основной ингредиент: " + getIngredient());
    }

    @Override
    public String toString() {
        return "Книга по кулинарии";
    }
}