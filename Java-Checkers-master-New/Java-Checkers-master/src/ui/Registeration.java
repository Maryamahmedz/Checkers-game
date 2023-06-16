package ui;
import java.io.*;


public class Registeration {
	
	
public static <Mysql> void main(String[] args) throws IOException, InterruptedException 
  {
	
		//create array
		String[][] Data = new String[5][5]; // create 3 columns, 10 rows
			
		BufferedReader bfn= new BufferedReader(new InputStreamReader(System.in));
	
		for (int row = 0; row < Data.length; row++) 
	{
		System.out.println("\n\t\tThis is entry number "+(row+1)+"/"+Data.length);
		System.out.println("\n\n\t\tPlayer  "+(row+1));

		Data[row][0]= "Player "+(row+1);
		System.out.print("Full Name: ");
		Data[row][1] = bfn.readLine();
	
		int won;
		int played;
		
		do{
			System.out.print("Make sure values are correct.\n");
			System.out.print("Games Played: ");
			Data[row][2] = bfn.readLine();

			System.out.print("Games Won: ");
			Data[row][3] = bfn.readLine();
		
			won = Integer.parseInt(Data[row][3]);
			played = Integer.parseInt(Data[row][2]);
		
		}while(won > played);

		int win_per = (won*100/played);
		System.out.print("Winning Percentage "+win_per);
		Data[row][4] = String.valueOf(win_per);	

		
		Mysqlcon sql = new Mysqlcon(Data) ;	
		sql.main(args);

		JTableExamples Table = new JTableExamples(Data);
		Table.main(Data);

		System.out.print("\n\t\tRegiseration Completed\n\n");

		Main mai = new Main();
		mai.main(args);
		
	}	

  }
}
