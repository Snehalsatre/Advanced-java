package TasksOfAnudeep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatClient {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Basic Chat Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

       
        JTextArea chatHistory = new JTextArea();
        chatHistory.setEditable(false); 
        JScrollPane scrollPane = new JScrollPane(chatHistory);

       
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        JTextField messageField = new JTextField();
        JButton sendButton = new JButton("Send");

        inputPanel.add(messageField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        
        ActionListener sendAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = messageField.getText();
                if (!text.trim().isEmpty()) {
                    chatHistory.append("You: " + text + "\n");
                    messageField.setText(""); 
                }
            }
        };

        
        sendButton.addActionListener(sendAction);
        messageField.addActionListener(sendAction);

        
        frame.getContentPane().add(BorderLayout.CENTER, scrollPane);
        frame.getContentPane().add(BorderLayout.SOUTH, inputPanel);

        frame.setVisible(true);
    }
}
