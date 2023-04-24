import javax.swing.*;

public class LibrarianFrame extends JFrame {
    public LibrarianFrame() {
        setTitle("NU Library System - Librarian");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("List of Books");
        titleLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        add(titleLabel);

        JPanel bookPanel1 = new JPanel();
        bookPanel1.add(new JLabel("Author Name: John Doe"));
        bookPanel1.add(new JLabel("Title of the Book: The Adventures of Tom Sawyer"));
        bookPanel1.add(new JLabel("Number of Copies: 3"));
        add(bookPanel1);

        JPanel bookPanel2 = new JPanel();
        bookPanel2.add(new JLabel("Author Name: Jane Austen"));
        bookPanel2.add(new JLabel("Title of the Book: Pride and Prejudice"));
        bookPanel2.add(new JLabel("Number of Copies: 5"));
        add(bookPanel2);

        JPanel bookPanel3 = new JPanel();
        bookPanel3.add(new JLabel("Author Name: J.K. Rowling"));
        bookPanel3.add(new JLabel("Title of the Book: Harry Potter and the Philosopher's Stone"));
        bookPanel3.add(new JLabel("Number of Copies: 7"));
        add(bookPanel3);
    }
}
