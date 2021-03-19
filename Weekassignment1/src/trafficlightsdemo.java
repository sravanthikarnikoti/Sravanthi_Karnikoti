
public class trafficlightsdemo {
	private static int RED = 1;
	private static int GREEN = 2;
	private static int YELLOW = 3;
public static void main(String[] args) {
		int color;
	color = 2;
		switch(color) {
		case 1:
			System.out.println("stop");
			break;
		case 2:
			System.out.println("go");
			break;
		case 3:
			System.out.println("ready");
			break;
			default:
				System.out.println("Invalid");
				break;
			
		}

	}

}