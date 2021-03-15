
public class cubesumdemo {
	private static int number = 567;
	public static void main(String[]args) {
		number();
		
	}
	private static int number() {
		int a=number % 10;
		int result1 = a  *a * a;
		int dividedvalue1 = number/10;
		int b =dividedvalue1 % 10;
		int result2 = b * b * b;
		int dividevalue2 = dividedvalue1 / 10;
		int c= dividevalue2 % 10;
		int result3 = c * c * c;
		int result= result1 + result2 + result3;
		System.out.println(result);
		return 0;
		
	
		
		
	}

	
	
}


   