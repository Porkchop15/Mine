import javax.swing.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {
    JLabel userLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("Login");

    public LoginFrame() {
        setTitle("NU Library System - Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(null);

        userLabel.setBounds(50, 30, 80, 30);
        passwordLabel.setBounds(50, 70, 80, 30);
        userTextField.setBounds(150, 30, 150, 30);
        passwordField.setBounds(150, 70, 150, 30);
        loginButton.setBounds(150, 110, 80, 30);

        add(userLabel);
        add(passwordLabel);
        add(userTextField);
        add(passwordField);
        add(loginButton);

        loginButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userTextField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("Admin_01") && password.equals("AdminOne") || 
            username.equals("Admin_02") && password.equals("AdminTwo") || 
            username.equals("Admin_03") && password.equals("AdminThree")) {
            JOptionPane.showMessageDialog(null, "Successfully logged in as admin!");
            // Redirect to Admin welcome frame
            AdminFrame adminFrame = new AdminFrame();
            adminFrame.setVisible(true);
            this.setVisible(false);
        } else if (username.equals("Librarian_01") && password.equals("LibOne") || 
                   username.equals("Librarian_02") && password.equals("LibTwo") || 
                   username.equals("Librarian_03") && password.equals("LibThree")) {
            JOptionPane.showMessageDialog(null, "Successfully logged in as librarian!");
            // Redirect to Librarian book list frame
            LibrarianFrame librarianFrame = new LibrarianFrame();
            librarianFrame.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
        }
    }

    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }
}
