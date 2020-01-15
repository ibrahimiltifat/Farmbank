import java.util.ArrayList;

 public class Farmers {
    private  String name;
    private ArrayList<Location1> Locations;
    private ArrayList<Product> Product;



     public Farmers(String FarmeersName,  ArrayList<Product> Product, ArrayList<Location1> Locations){
       this.name = FarmeersName;
       this.Product= Product;
       this.Locations= Locations;


   }


     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public ArrayList<Location1> getLocations() {
         return Locations;
     }

     public ArrayList<Product> getProduct() {
         return Product;
     }



     @Override
     public String toString() {
         return super.toString();
     }
 }
