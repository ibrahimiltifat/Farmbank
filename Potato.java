public class Potato extends Products {

    private static String Name = "Artichoke";
    private String Unit;
    private Double Price;

    public Potato(String Unit, Double Price, double qty){
        super(qty);
        this.Unit= "Per KG";
        this.Price = Price;
    }

    public Double getPrice() {
        return Price;
    }

    public String getUnit() {
        return Unit;
    }

    public void setPrice(Double price) {
        this.Price = price;
    }

    public void setUnit(String unit) {
        this.Unit = unit;
    }
}
