import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    public CustomButton(String name){
        this.setText(name);
        this.setSize(75,30);
        this.setFont(new Font("Arial", Font.BOLD, 10));
        this.setBorder(null);
        this.setForeground(Color.white);
        this.setBackground(Color.DARK_GRAY);
    }
}
