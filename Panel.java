import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private JPanel createPanel;

    public Panel(int x, int y, int width, int height){
        createPanel = new JPanel();
        createPanel.setSize(width,height);
        createPanel.setLocation(x,y);
        setLayout(null);

    }
}
