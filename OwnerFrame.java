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
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OwnerFrame extends JFrame {

    private ArrayList<Integer> day = new ArrayList<>();
    private ArrayList<Integer> mont = new ArrayList<>();
    private ArrayList<Integer> yea = new ArrayList<>();

    private JFrame win;

    String[] Course_M = {" Course 1 200EGP/month ", "  Course 2 400EGP /month", "  Course 3 500EGP/month,"};
    String[] Course_C = {" Course 1 ", "  Course 2 ", "  Course 3"};

    private String NumberOfMonths[]
            = {"1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12"};

    private JLabel label_1;
    private JLabel label_2;
    private JLabel label_3;

    private JRadioButton r1;
    private JRadioButton r2;
    private JRadioButton r3;
    private JRadioButton r4;

    private JComboBox date;
    private JComboBox month;
    private JComboBox year;

    private JComboBox date2;
    private JComboBox month2;
    private JComboBox year2;

    private JButton B_AddCoaches;
    private JButton B_AddMember;

    private JComboBox CBMembers;
    private JComboBox CBCoaches;
    private JComboBox Courses_M;
    private JComboBox Courses_C;
    private JComboBox CBdeleteCourse;

    private JTextField TFAddCoachName;

    private JTextField TFAddCourse;

//private JPanel
    private String dates[]
            = {"1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30",
                "31"};

    private String months[]
            = {"Jan", "feb", "Mar", "Apr",
                "May", "Jun", "July", "Aug",
                "Sup", "Oct", "Nov", "Dec"};

    private String years[]
            = {"1995", "1996", "1997", "1998",
                "1999", "2000", "2001", "2002",
                "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018",
                "2019"};
    private JPanel pl;

    public OwnerFrame() throws IOException {

        win = new JFrame();
        ImageIcon image = new ImageIcon("C:\\Users\\User\\Pictures\\project\\mariam1.jpg");
        win.setIconImage(image.getImage());

        win.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\User\\Pictures\\project\\mariam5.jpg")))));

        //BOUNDS
        label_1 = new JLabel("Coach name");
        label_2 = new JLabel("Course name");
        label_3 = new JLabel("Coach Course");

        r3 = new JRadioButton("A) Male");
        r4 = new JRadioButton("B) Female");

        B_AddCoaches = new JButton("Add coaches");
        B_AddMember = new JButton("Add course");

        CBMembers = new JComboBox();//courses
        CBCoaches = new JComboBox();//coaches

        Courses_M = new JComboBox(Course_M);
        Courses_C = new JComboBox(Course_C);

        TFAddCoachName = new JTextField(10);

        TFAddCourse = new JTextField(10);
        TFAddCourse.setBounds(20, 400, 150, 25);

        TFAddCoachName.setBounds(20, 50, 150, 25);

        CBCoaches.setBounds(550, 50, 130, 30);

        B_AddMember.setBounds(20, 450, 170, 25);  //course  

        TFAddCourse.setBounds(20, 330, 150, 25);
        CBMembers.setBounds(550, 330, 130, 30);

        B_AddCoaches.setBounds(170, 170, 130, 35);

        label_1.setBounds(50, 25, 100, 25);
        label_3.setBounds(50, 75, 100, 25);
        label_2.setBounds(50, 300, 100, 25);

        r3.setBounds(230, 10, 100, 50);
        r4.setBounds(230, 50, 100, 50);

        Courses_C.setBounds(20, 105, 100, 30);

        date2 = new JComboBox(dates);
        date2.setBounds(230, 110, 60, 20);
        win.add(date2);

        month2 = new JComboBox(months);
        month2.setBounds(300, 110, 60, 20);
        win.add(month2);

        year2 = new JComboBox(years);
        year2.setBounds(370, 110, 60, 20);
        win.add(year2);

        //ADDS
//    add(B_AddCoach);   //textfield
        win.add(B_AddCoaches);
        win.add(B_AddMember);  //Textfield

        win.add(CBMembers);
        win.add(CBCoaches);

        win.add(TFAddCoachName);

        win.add(TFAddCourse);

        win.add(label_1);
        win.add(label_2);
        win.add(label_3);

        win.add(r3);
        win.add(r4);

        win.add(Courses_C);
        Watcher w = new Watcher();
        B_AddCoaches.addActionListener(w);
        B_AddMember.addActionListener(w);
        //DEFAULT
        win.setSize(800, 600);
        win.setLayout(null);
        win.setLocationRelativeTo(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);

    }

    class Watcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == B_AddMember) {

                try {

                    DataOutputStream writeCourse = new DataOutputStream(new FileOutputStream("Member12.dat", true));

                    writeCourse.writeUTF(TFAddCourse.getText()); // tazbeeeetaaaaaaaaaa

                    writeCourse.close();

                } catch (IOException ex) {
                }

                try {

                    DataInputStream readCourse = new DataInputStream(new FileInputStream("Member12.dat"));
                    String line;

                    if (readCourse.available() == 0) {
                        System.out.print("file is empty");

                    }
                    while (readCourse.available() != 0) {
                        line = readCourse.readUTF();
                        CBMembers.addItem(line);
                    }
                    readCourse.close();
                } catch (IOException ex) {
                }
            } else if (e.getSource() == B_AddCoaches) {

                try {

                    DataOutputStream writeCoach = new DataOutputStream(new FileOutputStream("coach12.dat", true));
                    writeCoach.writeUTF(TFAddCoachName.getText());

                    writeCoach.close();

                } catch (IOException ex) {

                }

                try {

                    DataInputStream readCoach = new DataInputStream(new FileInputStream("coach12.dat"));
                    String line;
                    if (readCoach.available() == 0) {
                        System.out.print("file is empty");

                        return;
                    }
                    while (readCoach.available() != 0) {
                        line = readCoach.readUTF();
                        CBCoaches.addItem(line);
                    }
                    readCoach.close();
                } catch (FileNotFoundException ex) {

                } catch (IOException ex) {
                }
            }

        }
    }
}
