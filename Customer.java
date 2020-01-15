import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Customer {
    private String name;
    private int balance;
    private String LocationName;

    public Customer (String name,int balance, String LocationName ){
        this.name=name;
        this.balance=balance;
        this.LocationName=LocationName;

    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}

class cuslistner implements ActionListener {
    private JTextArea carea;
    private int balance;
    private String name;
    private String locationName;
    private ArrayList<Customer> cusarray;

    public cuslistner(JTextField locationName, JTextField cusbal,JTextField cusname,JTextArea carea,ArrayList<Customer>cusarray){
        //this.balance=Integer.parseInt(cusbal.getText().toString());
        this.name=cusname.getText().toString();
        this.carea=carea;
        this.locationName=locationName.getText().toString();
        this.cusarray=cusarray;
        this.balance=Integer.parseInt(cusbal.getText().toString());
        this.balance=5;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        cusarray.add(new Customer(name,balance,locationName));
        this.carea.append(this.name );

    }
}

