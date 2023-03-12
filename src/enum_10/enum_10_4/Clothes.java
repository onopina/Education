package enum_10.enum_10_4;

public class Clothes {
    private String item;
    private Sex sex;
    private Size size;
    private Color color;


    public Clothes(String item, Sex sex, Size size, Color color) {
        this.item = item;
        this.sex = sex;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Item " + item + ", Sex " + sex + ", Size " + size + ", Color " + color;
    }
}
