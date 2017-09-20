package malykh.internetProducts;

public class musicDisk extends Disk {

    public musicDisk(String name, int price, String barcode, InternetProducts.diskType type) {
        super(name, price, barcode, type);
        setNumber("1.3");
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public String toString() {
        return "Музыкальный диск";
    }
}