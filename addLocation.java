import javax.swing.*;
import javax.xml.stream.Location;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class addLocation implements ActionListener {
    private JTextField zipcode;
    private JTextField LocationName;
    private ArrayList<Location1> AllLocations;
    private Location location;
    private JTextArea printhere;


    public addLocation(JTextField zipcode, ArrayList<Location1> AllLocations, JTextArea printhere, JTextField LocationName){
        this.zipcode=zipcode;
        this.AllLocations=AllLocations;
        this.printhere=printhere;
        this.LocationName=LocationName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String zip = zipcode.getText().toString();
        String name = LocationName.getText().toString();
        printhere.append(name + " " + zip + "\n");
        AllLocations.add(createNew(name,zip));

    }

    public Location1 createNew(String name, String Zipcode){
        return new Location1(name,Zipcode);
    }
}
