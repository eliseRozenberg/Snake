import javax.swing.JFrame;

public class SnakeMain {

	public static void main(String[] args) {

		//Creating the window with all its awesome snaky features
		SnakeFrame snakeFrame= new SnakeFrame();
		
		// Setting up the window settings
		snakeFrame.setTitle("Snake");
		snakeFrame.setSize(300,300);
		snakeFrame.setVisible(true);
		snakeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	}
}
