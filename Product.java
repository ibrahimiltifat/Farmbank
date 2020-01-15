public class Product {

    private String Name;
    private String Unit;
    private int Price;

    public Product(String nme, String Un, int price){
        this.Name=nme;
        this.Unit=Un;
        this.Price=price;
    }

    public Product(String name){
        this.Name=name;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return Name + " " + Unit +" "+ Price;
    }

}
