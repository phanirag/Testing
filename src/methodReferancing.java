interface n{
	public int add(int x,int g);
	// public void nas();
}

class math{
	public int dosum(int s,int m){
		return s+m;
	}
}
/*class math{
	static int dosum(int s,int m){
		return s+m;
	}
}*/
public class methodReferancing {

	public static void main(String[] args) {
		math m=new math();
		n n=m::dosum;
		//for static syntax= n n=math::dosum;
		n adding= (int s,int k) -> s+k ;
		//int c=n.add(10, 20);
		int c=adding.add(10, 20);
		System.out.println(c);
	}

}
