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
import static java.awt.Color.WHITE;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame {

    private JButton b1 = new JButton("Shop");
    private JButton b2 = new JButton("Regester");
    private JButton b3 = new JButton("Login in");
    private ReservationFrame frame;
//    private Shop shop;
    private Menu menu;
    private JLabel label;
    private Login login;

    public Menu() throws IOException
    {
        super("GYM's menue");
        label = new JLabel("   Gym's Menu                 ");

        label.setFont(new Font("Courier", Font.BOLD, 50));
        label.setForeground(Color.black);
        setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\User\\Pictures\\menue.png")))));
        add(label);

        setLayout(new FlowLayout());
        JPanel p = new JPanel();

        b1.setOpaque(false);
        b2.setOpaque(false);
        b3.setOpaque(false);
//        p.setLayout(new GridLayout(3,1,10,10));
        add(b1);
        add(b2);
        add(b3);

        Watcher w = new Watcher();

//        add(p,"Center");
        b1.addActionListener(w);
        b2.addActionListener(w);
        b3.addActionListener(w);
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    class Watcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == b1) {
                try {
                    menu.setContentPane(new shopp().getContentPane());
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (e.getSource() == b2) {
                try
                {
                    menu.setContentPane(new ReservationFrame().getContentPane());
                } catch (IOException ex)
                {
                }
            }
            if (e.getSource() == b3) {
                try {
                    menu.setContentPane(new Login().getContentPane());
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }
}
