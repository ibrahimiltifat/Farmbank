import org.w3c.dom.Text;
import gui.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FARMBANK {

       public static void main(String[] args){
        JFrame MainFrame = new JFrame("MO FarmBank"); // Main Frame
        MainFrame.setSize(600,800);
        MainFrame.setLayout(new BorderLayout());


       JPanel Main = new JPanel(); //Main Panel
        Main.setLayout(new BorderLayout());
        Main.setSize(600,800);
        Main.setLocation(0,0);
        MainFrame.add(Main);




        JTabbedPane NavBar =new JTabbedPane(); // Navbar

        Main.add(NavBar); // NavBar Added to Main Panel

        //--------------------------------------------------Main Page--------------------------------------

        JPanel WelcomePage = new JPanel();
        WelcomePage.setLayout(null);
        WelcomePage.setLocation(0,0);
        WelcomePage.setSize(600,800);
        NavBar.add("Welcome Page",WelcomePage);


        JLabel WelcomeText = new JLabel("WELCOME TO \n MO FARM BANK" );
        WelcomeText.setLocation(200,200);
        WelcomeText.setSize(600,200);
        WelcomeText.setForeground(Color.RED);

        WelcomePage.add(WelcomeText);



        //--------------------------------END------------------------------------------------------------

           //--------------------------------------farmpage----------------------------------------//

           JPanel fpanel=new JPanel();
           fpanel.setLayout(null);
           fpanel.setLayout(null);
           JLabel farmerl=new JLabel("FARMERS");
           farmerl.setBounds(270,0,100,30);
           fpanel.add(farmerl);
           JTextArea farea=new JTextArea();
           farea.setBounds(150,30,300,270);
           fpanel.add(farea);
           JLabel clabel=new JLabel("CUSTOMERS");
           clabel.setBounds(270,300,100,30);
           fpanel.add(clabel);
           JTextArea carea=new JTextArea();
           carea.setBounds(150,330,300,270);
           fpanel.add(carea);
           JLabel bal=new JLabel("BALANCE");
           bal.setBounds(200,600,100,200);
           fpanel.add(bal);
           JTextArea balarea=new JTextArea();
           balarea.setBounds(300,685,100,30);
           fpanel.add(balarea);

           NavBar.addTab("farm page,",fpanel);

           //---------------------------------orderlogin----------------------------------------//


        //---------------------------------------------------------------------Farmer Sign Up Page-------------------------------------------------

        JPanel farmersignup = new JPanel();


        farmersignup.setSize(600,800);
        farmersignup.setLayout(null);

        JLabel FarmerNameLabel = new JLabel("Farmer Name:");
        FarmerNameLabel.setSize(300,20);
        FarmerNameLabel.setLocation(60,10);

        JTextField FarmerName = new JTextField("Enter Name Here");
        FarmerName.setSize(250,20);
        FarmerName.setLocation(220,10);


        JLabel ProductsLabel = new JLabel("Add Products");
        ProductsLabel.setSize(600,20);
        ProductsLabel.setLocation(60,50);


        JTextField PName = new JTextField("Name");
        JTextField Unit = new JTextField("Unit");
        JTextField Price = new JTextField("Price");

        PName.setLocation(60,70);
        PName.setSize(100,20);

        Unit.setLocation(180,70);
        Unit.setSize(100,20);

        Price.setLocation(300,70);
        Price.setSize(100,20);


        JButton Pbtn = new JButton("Add");
        Pbtn.setSize(100,20);
        Pbtn.setLocation(420,70);

        ArrayList<Product> PList = new ArrayList<>();






        JTextArea Allp = new JTextArea("Products Added" + "\n");
        Allp.setSize(460,200);
        Allp.setLocation(60,100);


        MyListener AddProduct = new MyListener(PName,Price,Unit,PList,Allp);
        Pbtn.addActionListener(AddProduct);


        JLabel LocationNameLabel = new JLabel("Name");
        LocationNameLabel.setSize(50,20);
        LocationNameLabel.setLocation(60,320);
        JTextField LacationName= new JTextField("Enter Location Here");
        LacationName.setSize(200,20);
        LacationName.setLocation(120,320);


        JLabel Location = new JLabel("Zip Code");
        Location.setSize(50,20);
        Location.setLocation(60,350);
        JTextField ZipCode = new JTextField("Enter Zip Code Here");
        ZipCode.setSize(200,20);
        ZipCode.setLocation(120,350);


        JButton AddLocationbtn = new JButton("Add Location");
        AddLocationbtn.setLocation(350,335);
        AddLocationbtn.setSize(150,20);

        JTextArea LocationsAdded = new JTextArea("Locations Added \n");
        LocationsAdded.setSize(460,200);
        LocationsAdded.setLocation(60,380);


        ArrayList<Location1> LocationList = new ArrayList<>();

        addLocation a = new addLocation(ZipCode,LocationList,LocationsAdded,LacationName );

        AddLocationbtn.addActionListener(a);
        ArrayList<Farmers> AllFarmers = new ArrayList<>();
        SignUp pas = new SignUp(FarmerName,PList,LocationList,AllFarmers);


        JButton SignUp = new JButton("Sign Up");
        SignUp.setSize(80,20);
        SignUp.setLocation(250,620);

        SignUp.addActionListener(pas);


        farmersignup.add(LacationName);
        farmersignup.add(LocationNameLabel);
        farmersignup.add(LocationsAdded);
        farmersignup.add(SignUp);
        farmersignup.add(AddLocationbtn);
        farmersignup.add(Location);
        farmersignup.add(ZipCode);
        farmersignup.add(Allp);
        farmersignup.add(Pbtn);
        farmersignup.add(PName);
        farmersignup.add(Unit);
        farmersignup.add(Price);
        farmersignup.add(FarmerNameLabel);
        farmersignup.add(FarmerName);
        farmersignup.add(ProductsLabel);

        NavBar.add("Farmer Sign Up",farmersignup);

        //--------------------------------------------Farmer Sign UP End-----------------------



        //-------------------------------------------Customer Sign Up-------------------------------

        Panel customertab = new Panel(0,0,600,800);

        JLabel CusNameLabel = new JLabel("Customer's Name:");
        CusNameLabel.setLocation(60,10);
        CusNameLabel.setSize(150,20);

        customertab.add(CusNameLabel);

        JTextField cusname=new JTextField("Enter Name Here");
        cusname.setSize(200,20);
        cusname.setLocation(250,10);

        JLabel CusbalLabel = new JLabel("Initial Balance:");
        CusbalLabel.setLocation(60,40);
        CusbalLabel.setSize(150,20);



        JTextField cusbal=new JTextField("Enter balance Here");
        cusbal.setSize(200,20);
        cusbal.setLocation(250,40);

        customertab.add(CusbalLabel);

        JLabel CusLocationLabel = new JLabel("Location:");
        CusLocationLabel.setSize(200,20);
        CusLocationLabel.setLocation(60,70);

        customertab.add(CusLocationLabel);

        JTextField CusLocation = new JTextField("Enter Location here");
        CusLocation.setSize(200,20);
        CusLocation.setLocation(250,70);
        ArrayList<Customer> cusarray= new ArrayList<Customer>();

            customertab.add(CusLocation);


            customertab.add(cusbal);
            customertab.add(cusname);


           JButton cussubmit=new JButton("Sign Up");
           customertab.add(cussubmit);
           cuslistner cuslistener=new cuslistner(CusLocation,cusbal,cusname,carea,cusarray);
           cussubmit.addActionListener(cuslistener);
           cussubmit.setSize(100,20);
           cussubmit.setLocation(200,150);



        NavBar.addTab("Customer Sign Up",customertab);
        //--------------------------products----------------------------------------------------//
           Product milk=new Product("milk");
           Product chease=new Product("chease");
           Product meat=new Product("meat");
           Product egg=new Product("egg");
           Product tomato=new Product("tomato");
           Product potato=new Product("potato");
           Product apple=new Product("apple");
           Product oliveOil=new Product("olive oil");
           Product artichoke=new Product("artichoke");

        //-------------------------------------End-----------------------------------------------



           JPanel order=new JPanel();
           JTextField login=new JTextField("login");
           JTextField groc=new JTextField("select product");
           JTextField amount=new JTextField("select amount");
           order.add(login);
           order.add(groc);
           order.add(amount);
           JButton done=new JButton("order");
           NavBar.addTab("order placement",order);




        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setVisible(true);




    }
}
