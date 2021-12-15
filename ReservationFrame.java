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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

public class ReservationFrame extends JFrame {

    private ButtonGroup g = new ButtonGroup();
    private JLabel[] label = new JLabel[14];

    private JButton btn;
    private JTextField[] txt = new JTextField[8];
    private JRadioButton rbtn1;
    private JRadioButton rbtn2;
    private JComboBox box = new JComboBox();
    private JComboBox day = new JComboBox();
    private JComboBox month = new JComboBox();
    private JComboBox year = new JComboBox();
    private JPanel p;
    private JPanel p1;
    private boolean test = false;
    private JPasswordField[] pass = new JPasswordField[2];
    ReservationFrame frame;
    public boolean isOpen = true;
    private JComboBox coachbox = new JComboBox();
    private JComboBox membershipbox = new JComboBox();
    private JLabel label13;

    public ReservationFrame() throws IOException {

        super("GYM");
        this.setIconImage(new ImageIcon("C:\\Users\\User\\Pictures\\project\\mariam1.jpg").getImage());

        setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\User\\Pictures\\project\\mariam3.jpg")))));

        JLabel l3 = new JLabel("Application Form");

        l3.setFont(new Font("Courier", Font.BOLD, 20));
        add(l3);
        add(new JLabel(""));

        setLayout(new GridLayout(19, 2, 10, 10));
        label[0] = new JLabel("First name ");
        label[0].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[0]);
        add(txt[0] = new JTextField());

        label[1] = new JLabel("Last name ");
        label[1].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[1]);
        add(txt[1] = new JTextField());

        label[2] = new JLabel("ID number ");
        label[2].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[2]);
        add(txt[2] = new JTextField());

        label[3] = new JLabel("phone ");
        label[3].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[3]);
        add(txt[3] = new JTextField());

        label[4] = new JLabel("Email ");
        label[4].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[4]);
        add(txt[4] = new JTextField(""));

        label[5] = new JLabel("Password ");
        label[5].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[5]);

        add(pass[0] = new JPasswordField());//password

        label[6] = new JLabel("Re-enter Password ");
        label[6].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[6]);
        add(pass[1] = new JPasswordField());

        label[7] = new JLabel("Weight(KG) ");
        label[7].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[7]);
        add(txt[5] = new JTextField());

        label[8] = new JLabel("Height(M) ");
        label[8].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[8]);
        add(txt[6] = new JTextField());

        label[9] = new JLabel("Credit Card ");
        label[9].setFont(new Font("Times New Roman", Font.BOLD, 15));

        add(label[9]);
        box.addItem("Visa");
        box.addItem("Master card");
        box.addItem("American Express");
        box.addItem("Discover Network ");
        add(box);

        label[10] = new JLabel("Credit card number ");
        label[10].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[10]);
        add(txt[7] = new JTextField());

        label[11] = new JLabel("Day of Birth ");
        label[11].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[11]);
        for (int x = 1; x <= 31; x++) {
            day.addItem((x + ""));
        }
        add(day);

        label[12] = new JLabel("Month of birth ");
        label[12].setFont(new Font("Times New Roman", Font.BOLD, 15));

        add(label[12]);
        for (int x = 1; x <= 12; x++) {
            month.addItem(x + "");
        }
        add(month);

        label[13] = new JLabel("Year of birth ");
        label[13].setFont(new Font("Times New Roman", Font.BOLD, 15));

        add(label[13]);
        
        for (int x = 1970; x <= 2017; x++)
        {
            year.addItem(x + "");
        }
        add(year);

        rbtn1 = new JRadioButton("Male");
        rbtn1.setOpaque(false);
        rbtn2 = new JRadioButton("Female");
        rbtn2.setOpaque(false);
        g.add(rbtn1);
        g.add(rbtn2);
        add(rbtn1);
        add(rbtn2);

//        getContentPane().setBackground(Color.WHITE);

        JLabel label2;
        label2 = new JLabel("Choose Coach");
        label2.setFont(new Font("Courier", Font.BOLD, 13));
        add(label2);
 
DataInputStream readd=new DataInputStream(new FileInputStream("coach12.dat"));

while(readd.available()!=0)
{
    coachbox.addItem(readd.readUTF());
}
 add(coachbox);       
 readd.close();
        label13 = new JLabel("Choose your membership plan");
        add(label13);
        DataInputStream r = new DataInputStream(new FileInputStream("Member12.dat"));
      
        while (r.available() != 0) 
        {
            membershipbox.addItem(r.readUTF());
        }
        add(membershipbox);
        r.close();

        add(new JLabel(""));

        btn = new JButton("Submit");
        add(btn);

        Watcher w = new Watcher();
JPanel p=new JPanel();
p.setLayout(new BorderLayout());
p.add(btn,"West");
btn.setOpaque(false);
        add(p);

        btn.addActionListener(w);

        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    class Watcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            char[] password1 = pass[0].getPassword();
            char[] password2 = pass[1].getPassword();

            if (e.getSource() == btn) {

                try {

                    if (password1.length < 3) {
                        JOptionPane.showMessageDialog(null, "Password is too short", "", INFORMATION_MESSAGE);
                        test = false;
                    }

                    if (!Arrays.equals(password1, password2)) {
                        JOptionPane.showMessageDialog(null, "incorrect password", "", ERROR_MESSAGE);
                        test = false;
                    } else {
                        test = true;

                    }

                    if (test == true) {
                        JOptionPane.showMessageDialog(null, "you have submitted succesfully" + +PLAIN_MESSAGE);

                        for (int x = 0; x < txt.length; x++) {

                            String title = txt[x].getText();
                            DataOutputStream write = new DataOutputStream(new FileOutputStream("info project.dat", true));
                            write.writeUTF(title);
                            if (x == 0) 
                            {
                                write.writeChar(password1[x]);
                            }
                            if (x == 1) 
                            {
                                write.writeChar(password2[x]);
                            }
                            write.close();
//                            System.exit(0);

                        }

                    }
                } catch (FileNotFoundException ex) {
                } catch (IOException ex) {
                }

            }

        }
    }
}