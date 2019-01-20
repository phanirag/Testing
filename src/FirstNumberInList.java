import java.util.ArrayList;
import java.util.List;


public class FirstNumberInList {

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<Integer>();
		String flag = null;
		for(int i = 1;i<=10;i++){
			arr.add(i);
		}
		
		int o = 1;
		
		for(int p = 0; p < arr.size(); p++){
			if(arr.get(p) == o)
				flag = "YES";
		}	
		System.out.println(flag);
	}
}
