import java.util.ArrayList;



public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> languages=new ArrayList();
		languages.add("Peral");
		languages.add("Php");
		languages.add("Ruby");
		
		
		System.out.println("ArrayList:"+languages);
		
		String[] arr=new String[languages.size()];
		
		languages.toArray(arr);
		
		System.out.println("Array: ");
		for(String item: arr) {
			System.out.println("item, ");
		}

	}

}
