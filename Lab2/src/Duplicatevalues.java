
public class Duplicatevalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr = new int [] {6,9,10,12,9,8,8,10,3};
		
		System.out.println("Duplicate Numbers in given array: ");
		
		for (int i =0; i<arr.length; i++) {
			
			for (int j = i+1; j<arr.length;j++) {
				
				if (arr[i] ==arr [j])
					
					System.out.println(arr[j]);
			}
		}

	}

}
