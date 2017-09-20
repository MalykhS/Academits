package malykh.internetProducts;

public class videoDisk extends Disk {

    public videoDisk(String name, int price, String barcode, InternetProducts.diskType type) {
        super(name, price, barcode, type);
        setNumber("1.2");
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public String toString() {
        return "Диск с видеозаписью";
    }
}