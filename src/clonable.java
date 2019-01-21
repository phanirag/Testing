
public class clonable implements Cloneable {
	int a = 10;
	int b = 20;
	public static void main(String[] args) throws CloneNotSupportedException {
		clonable c = new clonable();
		clonable c1 = (clonable)c.clone();
		c1.a = 50;
		c1.b = 90;
		
		System.out.println(c.a+" .............. "+c.b);
		System.out.println(c1.a+" .............. "+c1.b);
	}

}
