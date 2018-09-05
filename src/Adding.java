import java.util.Scanner;

public class Adding {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1st value:");
		int i=s.nextInt();
		System.out.println("enetr 2nd value:");
		int j=s.nextInt();
		for(int k=1;k<=i;k++){
			j++;
		}
		System.out.println(j);
	}
}
