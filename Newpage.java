package chandu;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;

public class Newpage extends JFrame implements ActionListener {
    JLabel heading;
    JButton module1,module2,module3,module4,logout;
    JPanel panel,panel1,panel2;
    Image icon;
    Border blackline,raisedbevel,loweredbevel;
    JToolBar toolbar;
    Newpage(String uservalue) {
        //intializing panels
        panel=new JPanel();
        panel1=new JPanel();
        panel2=new JPanel();
        //declaring images for this page
        ImageIcon profile = new ImageIcon(new ImageIcon("C:\\Users\\chand\\Downloads\\profile.png").getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
        ImageIcon search = new ImageIcon(new ImageIcon("C:\\Users\\chand\\Downloads\\search-module.jpg").getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
        ImageIcon add = new ImageIcon(new ImageIcon("C:\\Users\\chand\\Downloads\\add-module.png").getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
        ImageIcon delete = new ImageIcon(new ImageIcon("C:\\Users\\chand\\Downloads\\delete-module.png").getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
        Icon logoutimg = new ImageIcon(new ImageIcon("C:\\Users\\chand\\Downloads\\logout.png").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT));
        //declaring labels for storing images
        module1 = new JButton(profile);
        module2 = new JButton(search);
        module3 = new JButton(add);
        module4 = new JButton(delete);
        //JScrollPane jsp = new JScrollPane(lable);
        //adding panels to the containerpane
        this.getContentPane().add(panel,BorderLayout.PAGE_START);
        this.getContentPane().add(panel1,BorderLayout.CENTER);
        this.getContentPane().add(panel2,BorderLayout.PAGE_END);
        //setting up for the border for panels
        blackline= BorderFactory.createLineBorder(Color.BLACK);
        raisedbevel = BorderFactory.createRaisedBevelBorder();
        loweredbevel = BorderFactory.createLoweredBevelBorder();
        panel1.setBorder(blackline);
        panel.setBorder(raisedbevel);
        panel.setBorder(loweredbevel);
        //intializing remaining vaiables
        toolbar=new JToolBar();
        heading = new JLabel("Welcome Admin");
        logout = new JButton(logoutimg);
        logout.setText("Logout");
        //adding tooltip to all the buttons in the page
        logout.setToolTipText("Loging out of the page");
        module1.setToolTipText("PROFILE");
        module2.setToolTipText("SEARCH FOR EMPLOYEE DATA");
        module3.setToolTipText("ADDING NEW EMPLOYEE");
        module4.setToolTipText("DELETING EMPLOYEE");
        //adding background clor to the middle panel buttons
        module1.setBackground(Color.lightGray);
        module2.setBackground(Color.lightGray);
        module3.setBackground(Color.lightGray);
        module4.setBackground(Color.lightGray);
        //panel.setLayout(new BorderLayout(20,15));
        //adding all the fields to the respective panels
        panel1.add(module1);//,BorderLayout.EAST
        panel1.add(module2);//,BorderLayout.WEST
        panel1.add(module3);
        panel1.add(module4);
        panel.add(toolbar);//,BorderLayout.NORTH
        toolbar.add(heading);
        toolbar.addSeparator();
        toolbar.add(logout);
        //panel2.add(logout,BorderLayout.AFTER_LINE_ENDS);
        //creating empty border between fields for sufficient spacing
        heading.setBorder(BorderFactory.createEmptyBorder(5,20,5,20));
        module1.setBorder(BorderFactory.createEmptyBorder(100,100,50,50));
        module2.setBorder(BorderFactory.createEmptyBorder(100,100,50,50));
        module3.setBorder(BorderFactory.createEmptyBorder(100,100,50,50));
        module4.setBorder(BorderFactory.createEmptyBorder(100,100,50,50));
        logout.setBorder(BorderFactory.createEmptyBorder(5,20,5,20));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //adding all the action listeners
        logout.addActionListener(this);
        module1.addActionListener(this);
        module2.addActionListener(this);
        module3.addActionListener(this);
        module4.addActionListener(this);





    }
    public void actionPerformed(ActionEvent e){
        try{
            icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\chand\\OneDrive\\Pictures\\cat.png");
            Login l = new Login();
            l.setTitle("LOGIN FORM");
            l.setIconImage(icon);
            l.setExtendedState(JFrame.MAXIMIZED_BOTH);
            l.setVisible(true);

        }
        catch (Exception we){
            System.out.println(we);
        }
    }
    public static void main(String[] args){
        String uservalue;
        uservalue="Chandu";
        Newpage page = new Newpage(uservalue);
        page.setTitle("HOME PAGE");
        page.setExtendedState(JFrame.MAXIMIZED_BOTH);
        page.setVisible(true);

    }
}
