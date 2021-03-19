
public class Specialvalues {

	public static boolean constains (int[] arr,int item) {
		// TODO Auto-generated method stub
		for (int n : arr) {
			if (item == n) {
				return true;
			}
			}
		return false;
		
		}
	public static void main(String[] args) {
		int [] my_arr1 = {
				1971,1976,1995,1998,0101,
				1605,2507,1909,2006,2512,
				2000,2002,2007,2050};
		System.out.println(constains(my_arr1, 2032));
		System.out.println(constains(my_arr1, 2058));
				
		}

	}


