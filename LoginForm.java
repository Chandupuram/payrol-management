/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.payrol;

/**
 *
 * @author chand
 */
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

class DemoLoginfrom extends JFrame implements ActionListener{
    //initialize button, panel, label, and text field
    JButton b;
    JPanel newpannel;
    JLabel userlabel,passlabel;
    JTextField textField1;
    JTextField passfield;
    DemoLoginfrom(){
        //creating the labels and textfields
        userlabel=new JLabel();
        userlabel.setText("USERNAME:");
        textField1=new JTextField(15);
        passlabel=new JLabel("PASSWORD");
        passfield=new JPasswordField(15);
        b=new JButton("SUBMIT");


        //create panel to put elements
        newpannel=new JPanel();
        //adding elements
        newpannel.add(userlabel);
        newpannel.add(textField1);
        newpannel.add(passlabel);
        newpannel.add(passfield);
        newpannel.add(b);

        //set border to panel
        add(newpannel,BorderLayout.CENTER);

        //perform action on button
        b.addActionListener(this);

        //set title
        setTitle("LOGIN FORM");

        //add background
        b.setBackground(Color.gray);
        newpannel.setBackground(Color.lightGray);


    }
    public void actionPerformed(ActionEvent e){
        //getting and setting the values from user
        String userValue=textField1.getText();
        String passValue=passfield.getText();

        // get the database and confirm user and password.
        if (userValue.equals("test1@gmail.com") && passValue.equals("test")) {  //if authentic, navigate user to a new page

            //create instance of the NewPage
            HomePage page = new HomePage();

            //make page visible to the user
            page.setVisible(true);

            //create a welcome label and set it to the new page
            JLabel wel_label = new JLabel("Welcome: "+userValue);
            page.getContentPane().add(wel_label);
        }
        else{
            //show error message
            System.out.println("Please enter valid username and password");
        }
    }
}
//create main class
class Loginfrom
{
    public static void main(String arg[])
    {
        // use Exceptions
        try
        {
            DemoLoginfrom form=new DemoLoginfrom();
            form.setSize(300,300);
            form.setLocationRelativeTo(null); 
            form.setVisible(true);
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","9491911759")) {
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from holding");
                while(rs.next())
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            } 
        }
        catch (ClassNotFoundException | SQLException e)
        {
            //handling exeception
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    
}
