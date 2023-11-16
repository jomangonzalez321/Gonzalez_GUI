package LeapYear;
import javax.swing.*;

public class LeapYear extends JFrame {

    private JTextField inputYear;
    private JLabel text_field;
    private JPanel jpanel;
    private JButton checkYear;

    public LeapYear(){
        checkYear.addActionListener(e ->{

            String Year2 = inputYear.getText();
            int year = Integer.parseInt(Year2);
            if(year%4==0 && year%100!=0 || year%400==0){
                JOptionPane.showMessageDialog(this, "Leap year");
            }else{
                JOptionPane.showMessageDialog(this, "Not a leap year");
            }

        });
    }



    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.jpanel);
        app.setSize(1000,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year");

    }
}
