

public class LargestEvenNumber {

	public static void main(String[] args) {
		
		String s = "This is an awsome place";
		int temp = 0;
		int index = 0;
		String arr[]= s.split(" ");
		
		for(int i = 0; i < arr.length;i++ ){
			if(arr[i].length() % 2 == 0){
				if(arr[i].length() > temp){
					temp = arr[i].length();
					index = i;
				}
			}
		}
		System.out.println("The largest even String is : " +arr[index] + "and its length is " + temp  );
	}
}
