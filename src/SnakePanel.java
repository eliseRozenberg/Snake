import java.awt.Color;
import javax.swing.JPanel;

public class SnakePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public SnakePanel(Color d){
		this.setBackground(d);
	}
	
	public void ChangeColor(Color d){
		this.setBackground(d);
		this.repaint();
		//changed code
	}
	
}

