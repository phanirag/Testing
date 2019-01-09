class a1{
 
	public void a1() {
		System.out.println("in a");
	}
}

public class Const extends a1 {

	Const(){
		System.out.println("in Const");
	}
	public static void main(String[] args) {
		
		((a1) new Const()).a1();  
	}

}
