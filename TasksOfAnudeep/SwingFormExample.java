package TasksOfAnudeep;
import javax.swing.*;

public class SwingFormExample {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Swing Controls Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); 

       
        JMenuBar menuBar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Open"));
        
        JMenu editMenu = new JMenu("Edit");
        editMenu.add(new JMenuItem("Cut"));
        editMenu.add(new JMenuItem("Copy"));
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        frame.setJMenuBar(menuBar);

        
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 80, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 30, 200, 25);
        frame.add(nameField);

       
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(30, 70, 80, 25);
        frame.add(ageLabel);

        JTextField ageField = new JTextField();
        ageField.setBounds(120, 70, 50, 25);
        frame.add(ageField);

        
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(160, 110, 100, 30);
        frame.add(submitButton);

        
        JCheckBox newsletterBox = new JCheckBox("Subscribe to Newsletter");
        newsletterBox.setBounds(30, 160, 200, 25);
        frame.add(newsletterBox);

        
        frame.setVisible(true);
    }
}