package FoodSystem;

import javax.swing.*;

public class FoodSystem extends JFrame{

    private JPanel jpanel;
    private JCheckBox pizzaCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox sundaeCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox burgerCheckBox;
    private JRadioButton noneRB;
    private JRadioButton a5OffRadioButton;
    private JRadioButton a10OffRadioButton;
    private JRadioButton a15OffRadioButton;
    private JButton orderButton;

    public FoodSystem(){
        orderButton.addActionListener(e ->{
//            int pizza = 100;
//            int burger = 80;
//            int fries = 65;
//            int softdrinks = 55;
//            int tea = 50;
//            int sundae = 40;
            float sum = 0;

            if(pizzaCheckBox.isSelected()){
                sum = sum + 100;
            }
            if(burgerCheckBox.isSelected()){
                sum = sum + 80;
            }
            if(friesCheckBox.isSelected()){
                sum = sum + 65;
            }
            if(softDrinksCheckBox.isSelected()){
                sum = sum + 55;
            }
            if(teaCheckBox.isSelected()){
                sum = sum + 50;
            }
            if(sundaeCheckBox.isSelected()){
                sum = sum + 40;
            }
            float newSum = sum;

            if(a5OffRadioButton.isSelected()){
                newSum = (float) (sum*0.05);
                sum = sum - newSum;
            }else if(a10OffRadioButton.isSelected()){
                newSum = (float) (sum*0.1);
                sum = sum - newSum;
            }else if(a15OffRadioButton.isSelected()){
                newSum = (float) (sum*0.15);
                sum = sum - newSum;
            }

            JOptionPane.showMessageDialog(this, "The total price is Php " + sum);
        });
    }
    public static void main(String[] args) {
        FoodSystem app = new FoodSystem();
        app.setContentPane(app.jpanel);
        app.setSize(1000,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year");

    }
}
