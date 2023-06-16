package ui;
import java.sql.*;  
public class Mysqlcon{
  Registeration r=new Registeration();
  
     Mysqlcon(String Data[][] ){
      
    
      try{

      Class.forName("com.mysql.jdbc.Driver");  
      Connection con=DriverManager.getConnection(  
      "jdbc:mysql://localhost:3306/Mysql","admin","abc123");  
      //here sonoo is database name, root is username and password  

  
        String query =("insert into Data (Player_id, Full_name, Game_played, Game_won, Win_percentage)"+ " values (?, ?, ?, ?, ?)");  
// create the mysql insert preparedstatement
      PreparedStatement preparedStmt = con.prepareStatement(query);
      int i=0;
      int j =0;

      preparedStmt.setString(1, Data[i][j]);j++; 
      preparedStmt.setString (2,Data[i][j] );j++;
      preparedStmt.setString(3,Data[i][j]);j++;
      preparedStmt.setString(4,Data[i][j]);j++;
      preparedStmt.setString (5,Data[i][j]);
      i++; 

      // execute the preparedstatement
      preparedStmt.execute();
      
      con.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
    
}
   public static void main(String[] args) {
     
   }

      
    

/*while(rs.next())  
	
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();

}catch(Exception e){ System.out.println(e);}  
*/

}  

/*
String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
+ " values (?, ?, ?, ?, ?)";

// create the mysql insert preparedstatement
PreparedStatement preparedStmt = conn.prepareStatement(query);
preparedStmt.setString (1, "Barney");
preparedStmt.setString (2, "Rubble");
preparedStmt.setDate   (3, startDate);
preparedStmt.setBoolean(4, false);
preparedStmt.setInt    (5, 5000);




for (int i = 0; i < multiarray.length; i++) {
    stmt.setInt(1, Data[i][0]);
    stmt.setInt(2, Data[i][1]);
    stmt.addBatch();
  }
  */