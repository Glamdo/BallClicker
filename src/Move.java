
public class Move {
	
	private int x = 1;
	private int y = 1;
	private int richtung = 0;
	private int maxX = 100;
	private int maxY = 100;
	
	private final static int LINKS = 1;
	private final static int RECHTS = 0;
	
	public void update() {
		if(x == maxX) {
			richtung = LINKS;
		}
		if(x == 1) {
			richtung = RECHTS;
		}
		if(richtung == LINKS) {
			x--;
		} else {
			x++;
		}
		
	}
	
	public void geradeBewegen() {
		if(richtung == RECHTS) {
			x++;
		}
		if(richtung == LINKS) {
			x--;
		}
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Move [x=" + x + ", y=" + y + "]";
	}
	
//	public void geradeBewegen(int maxX, int maxY) {
//		int z = 0;
//		z = (int) (Math.random() * 4);
//		System.out.println("z = " + z);
//		if(z == 0) {												// nach rechts
//			for(;x <= maxX;x++) {
//				System.out.println("x = " + x + "; y = " + y);
//				System.out.println("\n");
//			}
//		}
//		if(z == 1) {												// nach unten
//			for(;y <= maxY;y++) {
//				System.out.println("x = " + x + "; y = " + y);
//				System.out.println("\n");
//			}
//		}
//		if(z == 2) {												// nach links
//			for(;x >= 1;x--) {
//				System.out.println("x = " + x + "; y = " + y);
//				System.out.println("\n");
//			}
//		}
//		if(z == 3) {												// nach oben
//			for(;y >= 1;y--) {
//				System.out.println("x = " + x + "; y = " + y);
//				System.out.println("\n");
//			}
//		}
//	}
//	
//	public void schraegBewegen(int maxX, int maxY) {
//		int z = 0;
//		z = (int) Math.random() * 4;
//		System.out.println("z = " + z);
//		if(z == 0) {
//			for(;x <= maxX && y <= maxY;) {
//				System.out.println("x = " + x + "; y = " + y);
//				System.out.println("\n");
//				x++;
//				y++;
//			}
//		}
//		if(z == 1) {
//			for(;x >= maxX && y >= maxY;) {
//				System.out.println("x = " + x + "; y = " + y);
//				System.out.println("\n");
//				x--;
//				y--;
//			}
//		}
//		if(z == 2) {
//			for(;x >= maxX && y <= maxY;) {
//				System.out.println("x = " + x + "; y = " + y);
//				System.out.println("\n");
//				x--;
//				y++;
//			}
//		}
//		if(z == 3) {
//			for(;x <= maxX && y >= maxY;) {
//				System.out.println("x = " + x + "; y = " + y);
//				System.out.println("\n");
//				x++;
//				y--;
//			}
//		}
//	}


}
