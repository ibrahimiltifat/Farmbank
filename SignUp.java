import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class SignUp implements ActionListener {
    private JTextField Name;
    private ArrayList<Product> AllProducts;
    private ArrayList<Location1> AllLocations;
    private ArrayList<Farmers> AllFarmers;

    public SignUp(JTextField Name, ArrayList<Product> AllProducts, ArrayList<Location1> AllLocations, ArrayList<Farmers> AllFarmers){
        this.Name=Name;
        this.AllProducts=AllProducts;
        this.AllLocations=AllLocations;
        this.AllFarmers = AllFarmers;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String nm = Name.getText().toString();

        AllFarmers.add(new Farmers(nm,AllProducts,AllLocations));
        PrintAllFarmers(AllFarmers);


    }


    public void PrintAllFarmers(ArrayList<Farmers> p){
        for (Farmers i :p){


            System.out.println(i.getName().toString());


        }

    }

}
