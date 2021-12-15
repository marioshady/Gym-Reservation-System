/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymreservation3;

/**
 *
 * @author mac
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

/**
 *
 * @author hp
 */

public class Login extends JFrame implements ActionListener, KeyListener {

    private JFrame frame_1;
    private JLabel title;
    private JPanel redPanel;
    private JPanel bluePanel;
    private JPanel yellowPanel;
    private JPanel greenPanel;
    private JLabel H;
    private JTextField text_1;
    private JLabel username;
    private JLabel password;
    private JPasswordField passwordField;
    private JButton button_1;
    private JCheckBox box;
    private String UName;
    private String Pass;

    public Login() throws FileNotFoundException, IOException {

        frame_1 = new JFrame();
        title = new JLabel("Login");
        redPanel = new JPanel();
        bluePanel = new JPanel();
        yellowPanel = new JPanel();
        greenPanel = new JPanel();
        H = new JLabel();
        text_1 = new JTextField();
        username = new JLabel();
        password = new JLabel("Password");
        passwordField = new JPasswordField();
        button_1 = new JButton("Login");
        passwordField.addActionListener(this);

        //picture
        frame_1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon gym = new ImageIcon("C:\\Users\\User\\Pictures\\project\\mariam2.jpg");

        //title 
        title.setFont(new Font("Broadway", Font.PLAIN, 100));

        H.setIcon(gym);
        //panels

        box = new JCheckBox("Show Passowrd");

        username.setText("Username");
        username.setFont(new Font("Calibri Light", Font.PLAIN, 30));

        password.setFont(new Font("Calibri Light", Font.PLAIN, 30));
        button_1.setBounds(700, 500, 90, 30);
        button_1.addActionListener(this);
        text_1.addActionListener(this);
        passwordField.addActionListener(this);
        box.setBounds(700, 440, 150, 50);

        //locations
        redPanel.setBounds(600, 90, 300, 100);
        bluePanel.setBounds(20, 100, 500, 550);
        yellowPanel.setBounds(550, 300, 150, 50);
        greenPanel.setBounds(550, 400, 150, 50);
        text_1.setBounds(730, 310, 200, 25);
        passwordField.setBounds(730, 410, 200, 25);
        box.addActionListener(this);
        redPanel.add(title);
        bluePanel.add(H);
        yellowPanel.add(username);
        greenPanel.add(password);

        button_1.setEnabled(false);

        frame_1.setSize(1100, 700);
        frame_1.setLayout(null);
        frame_1.setLocationRelativeTo(null);
        frame_1.setVisible(true);
        frame_1.add(redPanel);
        frame_1.add(bluePanel);
        frame_1.add(yellowPanel);
        frame_1.add(text_1);
        frame_1.add(greenPanel);
        frame_1.add(passwordField);
        frame_1.add(button_1);
        frame_1.add(box);

        //logo
        ImageIcon image = new ImageIcon("C:\\Users\\User\\Pictures\\project\\mariam1.jpg");
        frame_1.setIconImage(image.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FileWriter fout = null;
        try {
            if (box.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }

            if (text_1.getText() != null && passwordField.getText() != null) {
                button_1.setEnabled(true);
            }
            String enteredPassword;
            fout = new FileWriter("Test.txt");
            fout.write("Reem123 ");
            fout.write("reem");
            fout.close();
            try {
                FileReader fin = new FileReader("Test.txt");
                Scanner input = new Scanner(fin);

                while (input.hasNext()) {
                    UName = input.next();
                    Pass = input.next();

                }
                fin.close();


                String enteredUName = new String(text_1.getText());
                enteredPassword = new String(passwordField.getPassword());
                if (e.getSource() == button_1) {
                    if (UName.equals(enteredUName) && Pass.equals(enteredPassword)) {
                        frame_1.setContentPane(new OwnerFrame().getContentPane());
                    } 
                    else {
                        JOptionPane.showMessageDialog(this, "Error");
                    }
                }

            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
