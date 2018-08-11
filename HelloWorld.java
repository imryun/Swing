package src;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HelloWorld {

	/**
	 * main method loads Swing window with Hello World Title.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Hello World");
		JFrame frame = new JFrame("Hello World");
		frame.setSize(600, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/* Needed for multi threaded apps post Java 1.4 */
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				System.out.println("Hello Swing!");
			}
		});
	}

}
