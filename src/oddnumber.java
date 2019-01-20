import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class oddnumber {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: " );
		int i = s.nextInt();
		System.out.println("Enter the Second number: " );
		int j = s.nextInt();
		
		for(int k = i; k <= j ; k++){
			if( k % 2 != 0)
			list.add(k);
		}
		
		System.out.println(list.toString());
	}
}
