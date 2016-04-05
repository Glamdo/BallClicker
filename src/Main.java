import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Move move = new Move();
		while(true) {
			move.geradeBewegen(10, 10);
			
			System.out.println(move);
			
			System.in.read();
		}
	}
}