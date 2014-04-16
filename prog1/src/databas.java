import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import com.mysql.jdbc.Driver; 

public class databas  {

public static void main (String[] arg )throws java.lang.IllegalAccessException, java.lang.InstantiationException,java.sql.SQLException{
DriverManager.registerDriver (new Driver()); 
try {
// The newInstance() call is a work around for some
// broken Java implementations
Class.forName("com.mysql.jdbc.Driver").newInstance();
} catch (Exception ex) {
// handle the error
}


//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars,root"); 
  Connection conn = null;

try {

	
conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/Blubb","root","");
// Do something with the Connection
} catch (SQLException ex) {
// handle any errors
System.out.println("SQLException: " + ex.getMessage());
System.out.println("SQLState: " + ex.getSQLState());
System.out.println("VendorError: " + ex.getErrorCode());
}
/*
   try{ 
   Class.forName("com.mysql.jdbc.Driver").newInstance();  
  } catch (ClassNotFoundException cnfe) {  
      System.out.println("Couldn’t load database driver: " 
      + cnfe.getMessage()); 
  }
*/

  
   Statement stmt = conn.createStatement();
    ResultSet resultSet = stmt.executeQuery( "SELECT * FROM Bubblor");
   
      while ( resultSet.next() ){ 
   	System.out.println(""+resultSet.getString("radie")+" "+resultSet.getString("tjocklek"));
   }
 
   }
   }