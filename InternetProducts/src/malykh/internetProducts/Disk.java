package malykh.internetProducts;

public class Disk extends InternetProducts {
    private InternetProducts.diskType diskType;

    private InternetProducts.diskType getDiskType() {
        return diskType;
    }

    public void setDiskType(InternetProducts.diskType diskType) {
        this.diskType = diskType;
    }

    Disk(String name, int price, String barcode, InternetProducts.diskType type) {
        super(name, price, barcode);
        this.diskType = type;
        setNumber("1");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Тип носителя: " + getDiskType());
    }
}