
package hotel.management.system;




import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
           // Class.forName("com.mysql.jdbc.Driver");  
           Class.forName("com.mysql.cj.jdbc.Driver");

           
            c =DriverManager.getConnection("jdbc:mysql:///hotelsystemmanagement","root","1234"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

