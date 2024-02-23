import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cal extends JFrame {

    private JTextField firstNumberField;
    private JTextField secondNumberField;
    private JTextField thirdNumberField;
    private JTextField fourNumberField;
    private JTextField fiveNumberField;
    private JLabel resultLabel;
    private JLabel resultLabel1;

    public cal() {
        setTitle("Calculator");
        setSize(25, 25);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(new JLabel("Python:"));
        firstNumberField = new JTextField();
        panel.add(firstNumberField);

        panel.add(new JLabel("Java:"));
        secondNumberField = new JTextField();
        panel.add(secondNumberField);

        panel.add(new JLabel("C++:"));
        thirdNumberField = new JTextField();
        panel.add(thirdNumberField);

        panel.add(new JLabel("Javascript:"));
        fourNumberField = new JTextField();
        panel.add(fourNumberField);
        
        panel.add(new JLabel("Information security:"));
        fiveNumberField = new JTextField();
        panel.add(fiveNumberField);

        JPanel panel1 = new JPanel();
        panel.setLayout(new GridLayout(6, 4));

        panel1.add(new JLabel("Python:"));
        firstNumberField = new JTextField();
        panel1.add(firstNumberField);

        panel1.add(new JLabel("Java:"));
        secondNumberField = new JTextField();
        panel1.add(secondNumberField);

        panel1.add(new JLabel("C++:"));
        thirdNumberField = new JTextField();
        panel1.add(thirdNumberField);

        panel1.add(new JLabel("Javascript:"));
        fourNumberField = new JTextField();
        panel1.add(fourNumberField);
        
        panel1.add(new JLabel("Information security:"));
        fiveNumberField = new JTextField();
        panel1.add(fiveNumberField);

        JButton calculateButton = new JButton("average");
        calculateButton.addActionListener(new ActionListener()
         {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                double thirdNumber = Double.parseDouble(thirdNumberField.getText());
                double fourNumber = Double.parseDouble(fourNumberField.getText());
                double fiveNumber = Double.parseDouble(fiveNumberField.getText());
                double result1 = (firstNumber + secondNumber +thirdNumber+fourNumber+fiveNumber)/5 ;
                resultLabel1.setText("Average: " + result1);
                
            }

            

            
            
        });

        JButton calculateButton1 = new JButton("addition");
        calculateButton.addActionListener(new ActionListener()
         {
            @Override
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(firstNumberField.getText());
                double secondNumber = Double.parseDouble(secondNumberField.getText());
                double thirdNumber = Double.parseDouble(thirdNumberField.getText());
                double fourNumber = Double.parseDouble(fourNumberField.getText());
                double fiveNumber = Double.parseDouble(fiveNumberField.getText());
                double result1 = (firstNumber + secondNumber +thirdNumber+fourNumber+fiveNumber) ;
                resultLabel1.setText("addition: " + result1);
                
            }






        });

        panel.add(calculateButton);
        panel1.add(calculateButton1);

        

        resultLabel = new JLabel("");
        panel.add(resultLabel);
        
        resultLabel1 = new JLabel("");
        panel.add(resultLabel1);

        add(panel);
        add(panel1);
    }

    public static void main(String[] args) {
        cal cal = new cal();
        cal.setVisible(true);
}
}
