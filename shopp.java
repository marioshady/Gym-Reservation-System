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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

public class shopp extends JFrame
{

    private ButtonGroup g = new ButtonGroup();
    private JLabel[] label = new JLabel[14];

    private JCheckBox lrgcaramelprtbr = new JCheckBox("largcaramelprtbr(30 LE)"); //done
    private JCheckBox smlcaramelprtbr = new JCheckBox("smlcaramelprtbr (10 LE)");//done
    private JCheckBox lrgpstrawberryrtbr = new JCheckBox("lrgpstrawberryrtbr (50 LE)");//done
    private JCheckBox smlpstrawberryrtbr = new JCheckBox("smlpstrawberryrtbr (45 LE)");//done
    private JCheckBox lrgchocolateprtbr = new JCheckBox("lrgchocolateprtbr (20 LE)");//done
    private JCheckBox smlchocolateprtbr = new JCheckBox("smlchocolateprtbr (15 LE)");//done
    private JCheckBox lrgvanillaprtbr = new JCheckBox("lrgvanillaprtbr (40 LE)");
    private JCheckBox smlvanillaprtbr = new JCheckBox("smlvanillaprtbr (20 LE) ");
    private JCheckBox musclegainer = new JCheckBox("musclegainer (500 LE)");
    private JCheckBox muscleinfusion = new JCheckBox("muscleinfusion (600 LE)");
    private JCheckBox aminoacid = new JCheckBox("aminoacid (1200 LE)");
    private JCheckBox micronizedcreatine = new JCheckBox("micronizedcreatine (1500 LE)");
    private JCheckBox lipo6120 = new JCheckBox("lipo6120 (600 LE)");
    private JCheckBox lipo6240 = new JCheckBox("lipo6240 (800 LE)");

    private int sum = 0;

    private String MoneyFromClient;
    private JButton ok = new JButton("ok");
    private JLabel fees = new JLabel("Fees is " + sum);
    private TextField tf = new TextField();

    private JButton btn;

    private JPanel p;
    private JPanel p1;

    public boolean isOpen = true;

 

    public shopp() throws IOException {

        super("GYM");
        this.setIconImage(new ImageIcon("C:\\Users\\User\\Pictures\\project\\mariam1.jpg").getImage());

        setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\User\\Pictures\\project\\mariam4.jpg")))));

        JLabel l3 = new JLabel("Supplies ");
        l3.setFont(new Font("Courier", Font.BOLD, 20));
        add(l3);
        add(new JLabel(""));

        setLayout(new GridLayout(18, 2, 10, 10));
       
        
        label[0] = new JLabel("Large Caramel Protein Bar");
        label[0].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[0]);

        lrgcaramelprtbr.setOpaque(false);
        add(lrgcaramelprtbr);

        label[1] = new JLabel("Small Caramel Protein Bar");
        label[1].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[0]);

        smlcaramelprtbr.setOpaque(false);
        add(smlcaramelprtbr);

        label[2] = new JLabel("Large Stawberry Protein Bar");
        label[2].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[2]);

        lrgpstrawberryrtbr.setOpaque(false);
        add(lrgpstrawberryrtbr);

        label[3] = new JLabel("Small Stawberry Protein Bar");
        label[3].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[3]);

        smlpstrawberryrtbr.setOpaque(false);
        add(smlpstrawberryrtbr);

        label[4] = new JLabel("Large Chocolate Protein Bar");
        label[4].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[4]);

        lrgchocolateprtbr.setOpaque(false);
        add(lrgchocolateprtbr);

        label[5] = new JLabel("Small Chocolate Protein Bar");
        label[5].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[5]);

        smlchocolateprtbr.setOpaque(false);
        add(smlchocolateprtbr);

        label[6] = new JLabel("Large Vanilla Protein Bar");
        label[6].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[6]);

        lrgvanillaprtbr.setOpaque(false);
        add(lrgvanillaprtbr);

        label[7] = new JLabel("Small Vanilla Protein Bar");
        label[7].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[7]);

        smlvanillaprtbr.setOpaque(false);
        add(smlvanillaprtbr);

        label[8] = new JLabel("Muscle Gainer Supplement");
        label[8].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[8]);

        musclegainer.setOpaque(false);
        add(musclegainer);

        label[9] = new JLabel("Muscle Infusion Supplement");
        label[9].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[9]);

        muscleinfusion.setOpaque(false);
        add(muscleinfusion);

        label[10] = new JLabel("Amino Acid Supplement");
        label[10].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[10]);

        aminoacid.setOpaque(false);
        add(aminoacid);

        label[11] = new JLabel("Micronized Creatine Supplement");
        label[11].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[11]);

        micronizedcreatine.setOpaque(false);
        add(micronizedcreatine);

        label[12] = new JLabel("Lipo 6 120 Capsule Supplement");
        label[12].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[12]);

        lipo6120.setOpaque(false);
        add(lipo6120);

        label[13] = new JLabel("Lipo 6 240 Capsule Supplement");
        label[13].setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(label[13]);

        lipo6240.setOpaque(false);
        add(lipo6240);

        getContentPane().setBackground(Color.WHITE);

        JLabel label2;
        label2 = new JLabel("Choose your cart");
        label2.setFont(new Font("Courier", Font.BOLD, 13));
        add(label2);

        add(new JLabel(""));

        Watcher w = new Watcher();
        add(new JLabel(""));


        tf.setText("0");
     fees.setFont(new Font("Courier", Font.BOLD, 20));
        add(fees);
        add(tf);
        add(new JLabel(""));
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        ok.setOpaque(false);
        p.add(ok, "West");
        add(p);
        ok.addActionListener(new Watcher());

        lrgcaramelprtbr.addActionListener(new Watcher());
        smlcaramelprtbr.addActionListener(new Watcher());
        lrgpstrawberryrtbr.addActionListener(new Watcher());
        smlpstrawberryrtbr.addActionListener(new Watcher());
        lrgchocolateprtbr.addActionListener(new Watcher());
        smlchocolateprtbr.addActionListener(new Watcher());
        lrgvanillaprtbr.addActionListener(new Watcher());
        smlvanillaprtbr.addActionListener(new Watcher());
        musclegainer.addActionListener(new Watcher());
        muscleinfusion.addActionListener(new Watcher());
        aminoacid.addActionListener(new Watcher());
        micronizedcreatine.addActionListener(new Watcher());
        lipo6120.addActionListener(new Watcher());
        lipo6240.addActionListener(new Watcher());
        tf.addActionListener(w);
        setSize(900, 500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    class Watcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == lrgcaramelprtbr) {
                if (lrgcaramelprtbr.isSelected() == false) {
                    sum -= 30;
                    fees.setText("you fees is " + sum + " LE");

                } else {
                    sum += 30;
                    fees.setText("you fees is " + sum + " LE");
                }
            } 
            else if (e.getSource() == smlcaramelprtbr) {
                if (smlcaramelprtbr.isSelected() == false) {
                    sum -= 10;
                    fees.setText("you fees is " + sum + " LE");

                }
                {
                    sum += 10;
                    fees.setText("you fees is " + sum + " LE");
                }
            }
            else if (e.getSource() == lrgpstrawberryrtbr) {
                if (lrgpstrawberryrtbr.isSelected() == false) {
                    sum -= 50;
                    fees.setText("you fees is " + sum + " LE");

                } else {
                    sum += 50;
                    fees.setText("you fees is " + sum + " LE");
                }
            }
            else if (e.getSource() == smlpstrawberryrtbr) {
                if (smlpstrawberryrtbr.isSelected() == false) {
                    sum -= 45;
                    fees.setText("you fees is " + sum + " LE");

                } else {
                    sum += 45;
                    fees.setText("you fees is " + sum + " LE");
                }
            } 
            else if (e.getSource() == lrgchocolateprtbr) {
                if (lrgchocolateprtbr.isSelected() == false) {
                    sum -= 20;
                    fees.setText("you fees is " + sum + " LE");

                } else {
                    sum += 20;
                    fees.setText("you fees is " + sum + " LE");
                }
            } 
            else if (e.getSource() == smlchocolateprtbr) {
                if (smlchocolateprtbr.isSelected() == false) {
                    sum -= 15;
                    fees.setText("you fees is " + sum + " LE");

                } else {
                    sum += 15;
                    fees.setText("you fees is " + sum + " LE");
                }
            } 
            else if (e.getSource() == lrgvanillaprtbr) {
                if (lrgvanillaprtbr.isSelected() == false) {
                    sum -= 40;
                    fees.setText("you fees is " + sum + "LE");

                } else {
                    sum += 40;
                    fees.setText("you fees is " + sum + "LE");
                }
            } 
            else if (e.getSource() == smlvanillaprtbr) {
                if (smlvanillaprtbr.isSelected() == false) {
                    sum -= 20;
                    fees.setText("you fees is " + sum + " LE");

                }
                sum += 20;
                fees.setText("you fees is " + sum + " LE");

            } 
            else if (e.getSource() == musclegainer) {
                if (musclegainer.isSelected() == false) {
                    sum -= 500;
                    fees.setText("you fees is " + sum + " LE");

                } else {
                    sum += 500;
                    fees.setText("you fees is " + sum + " LE");
                }
            }
            else if (e.getSource() == muscleinfusion) {
                if (muscleinfusion.isSelected() == false) {
                    sum -= 600;
                    fees.setText("you fees is " + sum + " LE");

                } else {
                    sum += 600;
                    fees.setText("you fees is " + sum + " LE");
                }
            } 
            else if (e.getSource() == aminoacid) {
                if (aminoacid.isSelected() == false) {
                    sum -= (1200);
                    fees.setText("you fees is " + sum + " LE");

                } else {
                    sum += 1200;
                    fees.setText("you fees is " + sum + " LE");
                }
            } 
            else if (e.getSource() == micronizedcreatine) {
                if (micronizedcreatine.isSelected() == false) {
                    sum -= 1500;
                    fees.setText("you fees is " + sum + " LE");

                } else {
                    sum += 1500;
                    fees.setText("you fees is " + sum + " LE");
                }
            }
            else if (e.getSource() == lipo6120) {
                if (lipo6120.isSelected() == false) {
                    sum -= 60;
                    fees.setText("you fees is " + sum + " LE");

                } else {
                    sum += 600;
                    fees.setText("you fees is " + sum + " LE");
                }
            } else if (e.getSource() == lipo6240) {
                if (lipo6240.isSelected() == false) {
                    sum -= 800;
                    fees.setText("you fees is " + sum + " LE");

                } else {
                    sum += 800;
                    fees.setText("you fees is " + sum + " LE");
                }

                
            } else if (e.getSource() == ok) {

                System.out.println("my sum " + sum + " " + "money from client: " + MoneyFromClient);
                if (sum == Integer.parseInt(tf.getText()))
                {
                  JOptionPane.showMessageDialog(null, "Success", "", PLAIN_MESSAGE);
                } else if (sum >Integer.parseInt(tf.getText())) {
                    JOptionPane.showMessageDialog(null, "Purchase failed", "", PLAIN_MESSAGE);

                } 
                else
                {
                    JOptionPane.showMessageDialog(null, "Success and your change is " + (Integer.parseInt(tf.getText()) - sum), "", PLAIN_MESSAGE);

                }
               
            }

        }
    }
}
