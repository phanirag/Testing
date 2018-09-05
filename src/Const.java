
class a{

	public void a() {
		System.out.println("in a");
	}
}

public class Const extends a {

	Const(){
		System.out.println("in Const");
	}
	public static void main(String[] args) {
		
		((a) new Const()).a();  
	}

}
