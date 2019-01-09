
public class Vector {

	public static void main(String[] args) {
		java.util.Vector n=new java.util.Vector(3,4);
		n.removeAll(n);
		System.out.println(n.isEmpty());
	}
}
