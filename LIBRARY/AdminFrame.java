import javax.swing.*;

public class AdminFrame extends JFrame {
    public AdminFrame() {
        setTitle("NU Library System - Admin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel welcomeLabel = new JLabel("Welcome to NU Library System");
        welcomeLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        add(welcomeLabel);

        JPanel buttonPanel = new JPanel();
        JButton addBookButton = new JButton("Add Book");
        JButton removeBookButton = new JButton("Remove Book");
        buttonPanel.add(addBookButton);
        buttonPanel.add(removeBookButton);
        add(buttonPanel);
    }
}
