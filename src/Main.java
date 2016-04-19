import java.io.IOException;

import javax.swing.JPanel;

public class Main extends JPanel{
	
	public static void main(String[] args) throws IOException {
		Move move = new Move();
		while(true) {
			move.update();
			
			System.out.println(move);
			
//			System.in.read();
			
			
		}
	}
}