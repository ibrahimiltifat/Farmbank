import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class MyListener implements ActionListener {
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JTextArea printhere;
    private ArrayList<Product> AllProducts;



    Product product;

    public MyListener(JTextField formtext, JTextField formtext1 , JTextField formtext2 , ArrayList<Product> AllProducts, JTextArea printhere ){
        this.text1 = formtext;
        this.text2 = formtext1;
        this.text3 = formtext2;
        this.AllProducts =AllProducts;
        this.printhere =printhere;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String dum = text1.getText().toString();
        int p = Integer.parseInt(text2.getText().toString());
        String c = text3.getText().toString();
        if (dum.isEmpty() || p <=0 || c.isEmpty()){

        }
        Product po = createNew(dum,c,p);
        addInList(po);
        printhere.append(po.toString() + "\n" );

        PrintAllProducts(AllProducts);





    }

    public Product createNew(String n, String U, int P){
        return new Product(n,U,P);
    }

    public void addInList(Product p){
        AllProducts.add(p);

    }

    public void PrintAllProducts(ArrayList<Product> p){
        for (Product i :p){
            System.out.println(i);


        }

    }
}
