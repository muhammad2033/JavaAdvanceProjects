import java.awt.*;
import javax.swing.*;

public class currency {

public class currency1 extends JPanel{
private JPanel panel;
private JLabel messageLabel;
private JTextField USDTextField;
private JPanel CurrencyPanel;         
private JComboBox CurrencyBox;       
private String[] Currency  = { "USD - United States Dollar",
                 "GBP - Great Britain Pound", "AUD - Australian Dollar",
                 "EUR- Euro"};
/**
 * 
 */
public void currency1()
{
  setLayout(new BorderLayout(4,1));
  buildCurrencyPanel();
  add(CurrencyPanel, BorderLayout.CENTER);
  setVisible(true);
  setBorder(BorderFactory.createTitledBorder("Select currency"));

}
private void buildCurrencyPanel()
{
  CurrencyPanel = new JPanel();
  CurrencyBox = new JComboBox(Currency);
  CurrencyPanel.add(CurrencyBox);
}
 public static void main(String[] args)
{

    currency n = new currency1();
    n.clone();
    n.equals(n);
}
}
    
}
