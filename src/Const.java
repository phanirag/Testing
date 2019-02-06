class a1s{
 
	public void a1s() {
		System.out.println("in a");
	}
}

public class Const extends a1s {

	Const(){
		System.out.println("in Const");
	}
	public static void main(String[] args) {
		
		((a1s) new Const()).a1s();  
	}

}
