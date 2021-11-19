/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author devis
 */
import java.sql.*;
public class Connector {
    public Connection conn;
    public Statement s ;
    public Connector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","9491911759");
             s=conn.createStatement();
            //ResultSet rs =s.executeQuery("select * from user");
            
                }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}