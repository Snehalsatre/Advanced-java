package TasksOfAnudeep;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {

    public SimpleCalculator() {
       
        setTitle("Simple Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1, 5, 5)); 

      
        JLabel lblNum1 = new JLabel("Enter Number 1:");
        JTextField txtNum1 = new JTextField();
        
        JLabel lblNum2 = new JLabel("Enter Number 2:");
        JTextField txtNum2 = new JTextField();
        
        JButton btnCalculate = new JButton("Calculate");
        JLabel lblResult = new JLabel("Result: ", SwingConstants.CENTER);

     
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   
                    double n1 = Double.parseDouble(txtNum1.getText());
                    double n2 = Double.parseDouble(txtNum2.getText());
                    double sum = n1 + n2;
                    
                    lblResult.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers!");
                }
            }
        });

       
        add(lblNum1);
        add(txtNum1);
        add(lblNum2);
        add(txtNum2);
        add(btnCalculate);
        add(lblResult);

       
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            new SimpleCalculator().setVisible(true);
        });
    }
}