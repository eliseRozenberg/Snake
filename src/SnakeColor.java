import java.util.ArrayList;
import java.awt.Color;

public class SnakeColor {

	// ArrayList that'll contain the colors
	ArrayList<Color> C = new ArrayList<Color>();
	int color; // 2: snake , 1: food, 0:empty
	SnakePanel square;

	public SnakeColor(int col) {

		// Lets add the color to the arrayList
		C.add(Color.white);// 0
		C.add(Color.red); // 1
		C.add(Color.black); // 2
		color = col;
		square = new SnakePanel(C.get(color));
	}

	public void lightMeUp(int c) {
		square.ChangeColor(C.get(c));
	}
}
