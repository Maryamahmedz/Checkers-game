package ui;
import javax.swing.UIManager;


class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}




public class Start {
    public static void main(String[] args) {
    //Set the look and feel to the OS look and feel

	MultithreadingDemo object= new MultithreadingDemo();
	object.start();

		try {
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Create a window to display the checkers game
		CheckersWindow window = new CheckersWindow();
		window.setDefaultCloseOperation(CheckersWindow.EXIT_ON_CLOSE);
		window.setVisible(true);
        
}
}
