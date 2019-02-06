import java.util.TreeMap;


public class mapss {

	public static void main(String[] args) {
		
	TreeMap<Integer,String> m = new TreeMap<Integer,String>();
	m.put(1, "Hello"+1);
	m.put(2, "Hello"+2);
	m.put(3, "Hello"+3);
	m.put(4, "Hello"+4);
	m.put(5, "Hello"+5);
	m.forEach((l,x) -> System.out.println("Keys : "+l+" || Values : "+x));
	}
	
}
