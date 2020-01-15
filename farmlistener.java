import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class farmlistener implements ActionListener {
    private JTextField field;
    private JTextField n;
         public JPanel fbankk;

    public farmlistener(JTextField field,JTextField n,JPanel fbankk){
        this.field=field;
        this.n=n;
        this.fbankk=fbankk;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.fbankk.add(new JLabel(field.getText())).setBackground(Color.black);


    }





}
