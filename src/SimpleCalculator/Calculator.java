package SimpleCalculator;

import javax.swing.*;

public class Calculator extends JFrame{
    private JTextField firstNum;
    private JComboBox opBox;
    private JTextField secondNum;
    private JTextField resultDisplay;
    private JButton computeButton;
    private JPanel jpanel;

    public Calculator() {
        computeButton.addActionListener(e ->{
            String numOne = firstNum.getText();
            String numTwo = secondNum.getText();
            int num = Integer.parseInt(numOne);
            int num2 = Integer.parseInt(numTwo);
            int result;
            if(opBox.getSelectedIndex() == 0){
                    result = num + num2;
                    resultDisplay.setText(String.valueOf(result));
            }else if(opBox.getSelectedIndex() == 1){
                    result = num - num2;
                     resultDisplay.setText(String.valueOf(result));
            }else if(opBox.getSelectedIndex() == 2){
                    result = num * num2;
                     resultDisplay.setText(String.valueOf(result));
            }else if(opBox.getSelectedIndex() == 3){
                    result = num / num2;
                    resultDisplay.setText(String.valueOf(result));
            }

        });
    }
    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setContentPane(app.jpanel);
        app.setSize(1000,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year");

    }
}
