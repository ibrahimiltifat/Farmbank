public class OliveOil  extends Products{
    private static String Name = "Milk";
    private String Unit;
    private Double Price;

    public OliveOil(String Unit, Double Price, double qty){
        super(qty);
        this.Unit= "Per Liter";
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
