import javax.swing.*;
import java.awt.*;

public class TemperatureConverter extends JFrame {
    private double temp;
    public void temperatureConverter(){
        // Variables
        CustomButton jButton1 = new CustomButton("Convert");
        CustomButton jButton2 = new CustomButton("Clear");
        CustomButton jButton3 = new CustomButton("Exit");
        JTextField jTextField1 = new JTextField("0"); JTextField jTextField2 = new JTextField("32");
        JComboBox<String> jComboBox1 = new JComboBox<>();
        JLabel jLabel1 = new JLabel("Temperature Converter");
        JLabel jLabel2 = new JLabel("To:");
        JPanel jPanel2 = new JPanel();
        //Frame Setting
        jButton1.setLocation(300,180);
        jButton2.setLocation(380,180);
        jButton3.setLocation(300,220);
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"Celsius", "Fahrenheit"}));
        jComboBox1.setBounds(50,180,100,40);
        jLabel1.setBounds(125,25,400,50);
        jLabel1.setFont(new Font("Arial", Font.PLAIN, 24));
        jLabel1.setForeground(Color.white);
        jLabel2.setFont(new Font("Arial", Font.BOLD, 16));
        jLabel2.setForeground(Color.black);
        jLabel2.setBounds(20,175,50,50);
        jPanel2.setBackground(Color.darkGray);
        jPanel2.setBounds(0,0,500,100);
        jPanel2.setLayout(null);
        jPanel2.add(jLabel1);
        jTextField1.setBounds(300,140,75,30);jTextField1.setEditable(true);
        jTextField2.setBounds(300,260,75,30);jTextField2.setEditable(false);
        this.setSize(500,400);
        this.setVisible(true);this.setLayout(null);
        this.setTitle("Temperature Converter");
        this.setBackground(Color.gray);
        this.add(jPanel2);this.add(jComboBox1);this.add(jButton1);
        this.add(jButton2);this.add(jButton3);
        this.add(jTextField1);this.add(jTextField2);this.add(jLabel2);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/4158502.png"));
        //Event driven functions
        jButton1.addActionListener(e -> {
            temp = Double.parseDouble(jTextField1.getText());
            if (jComboBox1.getSelectedItem() == "Celsius"){
                temp = toCelsius(temp);
                jTextField2.setText(String.format("%.2f", temp));
            }else {
                temp = toFahrenheit(temp);
                jTextField2.setText(String.format("%.2f", temp));
            }
        });//Convert temperature to selected temperature
        jButton2.addActionListener(e -> {jTextField1.setText("");jTextField2.setText("");});//Clear Texts
        jButton3.addActionListener(e -> System.exit(0));//Leave the application
    }
    public static double toCelsius(double temp){return (temp - 32) * ((double)5/9);}
    public  static double toFahrenheit(double temp){
        return temp * (double)9/5 + 32;
}
}