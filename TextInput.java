package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class TextInput extends JPanel {
     private JTextField createText;

     public TextInput(int x, int y, int width, int height){
         createText = new JTextField("Enter Here");
         createText.setLocation(20,100);
         createText.setSize(300, 300);
         setBackground(Color.BLACK);

     }
}
