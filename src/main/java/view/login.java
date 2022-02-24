package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JPanel panel1;
    private JTextField username;
    private JPasswordField password;
    private JButton loginButton;

    public login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(verifyLogin(username.getText(), String.valueOf(password.getPassword()))) {
                    JOptionPane.showMessageDialog(null, "Bem vindo, "+username.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Seu username ou senha está errado!");
                }
            }
        });
    }

    public static void showScreen() {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(350, 250);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(51, 54, 77));
        frame.setVisible(true);
    }

    public boolean verifyLogin(String username, String password) {
        return username.equals("Thiago") && password.equals("12345");
    }

}
