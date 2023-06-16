package ui;
import java.sql.*;  
public class Sql_Display
{
  
 
 public String[][] Data = new String[10][10]; // create 3 columns, 10 rows
      
     Sql_Display()
  {
        
          try{    

                Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/Mysql","admin","abc123");  
                //here sonoo is database name, root is username and password  

                 // our SQL SELECT query. 
                // if you only need a few columns, specify them by name instead of using "*"
                String query = "SELECT * FROM Data";

                 // create the java statement
                Statement st = con.createStatement();

                // execute the query, and get a java resultset
                 ResultSet rs = st.executeQuery(query);
      
                 int row =0;
                 
                 while (rs.next())
                 {
                  

                      Data[row][0] = rs.getString("Player_Id");  
                      Data[row][1] = rs.getString("Full_name");                      Data[row][2] = rs.getString("Game_played");
                      Data[row][3] = rs.getString("Game_won");
                      Data[row][4] = rs.getString("Win_percentage");
                      row++;          

                  }

                 
                 JTableExamples Table = new JTableExamples(Data);
                 Table.main(Data);
          
              }    
    

            catch (Exception e)
              {
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
              }
          

            
  }  
                    public static void main(String[] args) {
                    new Sql_Display();
                 
    
                  }
      
    
}







