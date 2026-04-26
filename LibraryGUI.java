import javax.swing.*;

public class LibraryGUI {
    public static void main(String[] args) {

        LibraryManager lm = new LibraryManager();

        JFrame f = new JFrame("Library System");

        JTextField title = new JTextField();
        title.setBounds(50, 50, 150, 30);

        JTextField author = new JTextField();
        author.setBounds(50, 90, 150, 30);

        JButton add = new JButton("Add Book");
        add.setBounds(50, 130, 150, 30);

        JButton view = new JButton("View Books");
        view.setBounds(50, 170, 150, 30);

        add.addActionListener(e -> lm.addBook(title.getText(), author.getText()));
        view.addActionListener(e -> lm.viewBooks());

        f.add(title);
        f.add(author);
        f.add(add);
        f.add(view);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}