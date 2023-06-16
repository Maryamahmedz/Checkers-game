package ui;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Tournament {
    public static void main(String[] args) throws InterruptedException {
        int i=4;
        int j=1;
        int value=4;
        Scanner scan= new Scanner(System.in);

       System.out.println("Welcome to Tournament\n\t ");
       System.out.println("What is your Player number?");
       for (i=1;i<5;i++)
       { 
           System.out.println("("+(i)+") Player "+i);
       }
       int num = scan.nextInt();
       int tour = 4;
    
       for(i=1;i<tour;i+=2)
        {      
            
            for(i=1;i<tour;i++)
            {
                if (num == i||num==(i+1))
                {
                 Sql_Display display = new Sql_Display();
                 display.main(args);

                  System.out.println("\t\t\tGame "+j+"\n\n\n\t\tPlayer "+i+" vs Player "+(i+1));
                  j++;
                  int port = 1234;
                  System.out.println("Your Port Ip "+port);
                  port++;
                  TimeUnit.SECONDS.sleep(3);
                  Start st = new Start();
                  st.main(args);

                  System.out.println("Which Player won?");
                  System.out.println("("+(i)+") Player "+i);
                  System.out.println("("+(i+1)+") Player "+(i+1));
                  
            }
            
          

        };



    }
}
}