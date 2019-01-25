// Newcapacity=(currentcapacity+1)*2.

package StringBuffer;

public class StringBufferE {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("vijayabhaskarreddy");
		//Capacity();
		//System.out.println(sb.length());//18
		//System.out.println(sb.charAt(14));//e
		//sb.setCharAt(6,'A');//vijayaAhaskarreddy
		//append(sb);
		//sb.insert(6,"kkaksk");
		//sb.deleteCharAt(5);
		//sb.delete(2,5);
		//System.out.println(sb.reverse());
		
	}

	private static void append(StringBuffer sb) {
		sb.append("PI value is :");
		sb.append(3.14); 
		sb.append(" this is exactly ");
		sb.append(true);
		System.out.println(sb);//vijayaAhaskarreddyPI value is :3.14 this is exactly true
	}

	private static void Capacity() {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//16
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());//16
		sb.append("q");
		System.out.println(sb.capacity());//34
	}
}
