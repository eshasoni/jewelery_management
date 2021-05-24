
package jewelleryshop;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class db {
     Connection conn=null;
    static  public String empfname;
    static  public String empsname;
    static  public String empid;
    public static Connection java_db(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/jshop","root","1234");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
