import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class clock{

public class Calculator implements ActionListener {
  private JFrame frame;
  private JPanel panel;
  private JTextField display;
  private JButton[] buttons;
  private String[] labels = {
    "7", "8", "9", "/",
    "4", "5", "6", "*",
    "1", "2", "3", "-",
    "0", ".", "=", "+"
  };

  public Calculator() {
    frame = new JFrame("Calculator");
    panel = new JPanel();
    panel.setLayout(new GridLayout(4, 4, 4, 4));
    display = new JTextField();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    buttons = new JButton[labels.length];
    for (int i = 0; i < labels.length; i++) {
      buttons[i] = new JButton(labels[i]);
      panel.add(buttons[i]);
      buttons[i].addActionListener(this);
    }

    frame.add(display, "North");
    frame.add(panel, "Center");
    frame.setSize(400, 400);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String cmd = e.getActionCommand();
    if (cmd.charAt(0) == 'C') {
      display.setText("");
    } else if (cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9' || cmd.equals(".")) {
      display.setText(display.getText() + cmd);
    }
}
}}