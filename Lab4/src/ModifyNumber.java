import java.util.Scanner;

public class ModifyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println("the modified number is "+modifyNumber(number));
	}
    private static int modifyNumber(int pNumber)
    {
    	String str=Integer.toString(pNumber);
    	int output=0;
    	for(int i=0;i<str.length()-1;i++)
    	{
    		int diff=str.charAt(i)-str.charAt(i+1);
    		output=output*10+Math.abs(diff);
    	}
    	output=output*10+(str.charAt(str.length()-1))-48;
    	return output;
	}

}
