import org.apache.commons.codec.binary.Base64;



public class DecodeEncode {

	public static void main(String[] args) {
		String s=decoding();
		encoding(s);
	}

	private static  void encoding(String s) {
		byte[] r=Base64.encodeBase64(s.getBytes());
		System.out.println(new String(r));
	}

	private static  String decoding() {
		String hi="35b2808d";
		byte[] b=Base64.decodeBase64(hi.getBytes());
		String s=new String(b);
		System.out.println(s);
		return s;
	}
	
}
