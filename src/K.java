interface I{
	 void add();
}
interface E{
	void add();
}
public class K implements I,E {

	@Override
	public void add() {
	}

	public static void main(String[] args) {
		K a=new K();
		I b=new K();
		E c=new K();
		if(a instanceof K && a instanceof I){
			System.out.println("b");
		}
		if(a instanceof K && a instanceof E){
			System.out.println("c");
		}
	}
}
