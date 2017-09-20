package malykh.internetProducts;

public class softwareDisk extends Disk {

    public softwareDisk(String name, int price, String barcode, InternetProducts.diskType type) {
        super(name, price, barcode, type);
        setNumber("1.1");
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public String toString() {
        return "Диск с ПО";
    }
}