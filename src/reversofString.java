import java.util.Scanner;


public class reversofString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any word:");
		String str = s.nextLine();
		String rev = "";
		for(int i = str.length()-1;i>=0;i--){
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}

}
