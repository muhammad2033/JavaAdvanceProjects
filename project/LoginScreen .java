import javax.swing.*;
import java.awt.*;

public class LoginScreen extends JFrame {
  private JLabel usernameLabel;
  private JTextField usernameField;
  private JLabel passwordLabel;
  private JPasswordField passwordField;
  private JButton loginButton;

  public LoginScreen() {
    super("Login Screen");
    setLayout(new GridLayout(3, 2));
    usernameLabel = new JLabel("Username:");
    add(usernameLabel);
    usernameField = new JTextField();
    add(usernameField);
    passwordLabel = new JLabel("Password:");
    add(passwordLabel);
    passwordField = new JPasswordField();
    add(passwordField);
    loginButton = new JButton("Login");
    add(loginButton);
  }
}
// Implement the back-end: Create a back-end system using a database management system (DBM