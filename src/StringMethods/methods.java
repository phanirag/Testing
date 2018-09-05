package StringMethods;

public class methods {

	public static void main(String[] args) {

		InternMethod();
		StringConsrtObject();
		CharAtMethod();
		concatmethod();
		equalsMethod();
		subStringMethod();
		lengthMethod();
		replaceMethod();
		UpperAndLowerCase();
		trimMethod();
		indexOfMethod();
		lastindexOfMethod();
		compareToMethod();
		contentEqualsMethod();
		copyvalueofMethod();
		endsWithMethod();
		replaceFirstMethod();
		regionMatchesMethod();
		matchesMethod();
		valueOfMethod();
		startswithMethod();
		splitMethod();
	}

	private static void splitMethod() {
		System.out.println("================");
		System.out.println("From split() :");

		String Str = new String("Welcome-to-Tutorialspoint.com");
		System.out.println("Return Value :" );      

		for (String retval: Str.split("-")) {
			System.out.println(retval);
			
			/*output:
			Welcome
			to
			Tutorialspoint.com*/
		}
	}

	private static void startswithMethod() {
		System.out.println("================");
		System.out.println("From startWith() :");

		String Str = new String("Welcome to Tutorialspoint.com");

		System.out.print("Return Value :" );
		System.out.println(Str.startsWith("Welcome") );// true 

		System.out.print("Return Value :" );
		System.out.println(Str.startsWith("Tutorials") );// false
	}

	private static void valueOfMethod() {
		System.out.println("================");
		System.out.println("From valueOf() :");

		double d = 102939939.939;
		boolean b = true;
		long l = 1232874;
		char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };

		System.out.println("Return Value : " + String.valueOf(d) );
		System.out.println("Return Value : " + String.valueOf(b) );
		System.out.println("Return Value : " + String.valueOf(l) );
		System.out.println("Return Value : " + String.valueOf(arr) );
		
		/*output:
		Return Value : 1.02939939939E8
		Return Value : true
		Return Value : 1232874
		Return Value : abcdefg
		 */	
		}

	private static void matchesMethod() {
		System.out.println("================");
		System.out.println("From matches() :");
		String Str = new String("Welcome to Tutorialspoint.com");

		System.out.print("Return Value :" );
		System.out.println(Str.matches("(.*)Tutorials(.*)")); //true

		System.out.print("Return Value :" );
		System.out.println(Str.matches("Tutorials")); //false

		System.out.print("Return Value :" );
		System.out.println(Str.matches("Welcome(.*)")); //true
	}

	private static void regionMatchesMethod() {
		System.out.println("================");
		System.out.println("From regionMatches() :");
		String Str1 = new String("Welcome to Tutorialspoint.com");
		String Str2 = new String("Tutorials");
		String Str3 = new String("TUTORIALS");

		System.out.print("Return Value :" );
		System.out.println(Str1.regionMatches(11, Str2, 0, 9)); //true

		System.out.print("Return Value :" );
		System.out.println(Str1.regionMatches(11, Str3, 0, 9)); //false
	}

	private static void replaceFirstMethod() {
		System.out.println("================");
		System.out.println("From replaceFirst() :");
		String Str = new String("Welcome to Tutorialspoint.com");
		System.out.print("Return Value :" );
		System.out.println(Str.replaceFirst("Tutorials", "AMROOD"));
		//output : Return Value :Welcome to AMROODpoint.com
	}

	private static void endsWithMethod() {
		String Str = new String("This is really not immutable!!");
		boolean retVal;

		System.out.println("==========");
		System.out.println("From endsWith() :");
		retVal = Str.endsWith( "immutable!!" );
		System.out.println("Returned Value = " + retVal ); // true

		retVal = Str.endsWith( "immu" );
		System.out.println("Returned Value = " + retVal ); // false
	}

	@SuppressWarnings("static-access")
	private static void copyvalueofMethod() {
		char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
		String Str2 = "";
		Str2 = Str2.copyValueOf( Str1 );
		System.out.println("Returned String: " + Str2); //hello world

		String str3 ="";
		str3 =str3.copyValueOf(Str1, 3, 8);
		System.out.println("From copyValueOf() :"+str3); // lo world

	}

	private static void contentEqualsMethod() {
		String str1 = "Not immutable";
		String str2 = "Strings are immutable";
		StringBuffer str3 = new StringBuffer( "Not immutable");

		boolean  result = str1.contentEquals( str3 );
		System.out.println("From contentEquls() :"+result); //true

		result = str2.contentEquals( str3 );
		System.out.println("From contentEquls() :"+result); // false
	}

	private static void compareToMethod() {
		String s="Phani";
		//positive when compareTo parameter value less or vise varsa 
		System.out.println("From compareTo() :"+s.compareTo("Phanis")); // -1
		System.out.println("From compareTo() :"+s.compareTo("Phani")); // 0
		System.out.println("From compareTo() :"+s.compareTo("Phan")); // 1
	}

	private static void lastindexOfMethod() {
		String s="PhaniRaghava";
		System.out.println("From lastIndexOf() :"+s.lastIndexOf("a")); // 11
	}

	private static void indexOfMethod() {
		String s="Phani";
		System.out.println("From indexOf() :"+s.indexOf("a")); // 2
	}

	private static void trimMethod() {
		String s=" A B C ";
		System.out.println("From trim() :"+s.trim()); // "A B C"
	}

	private static void UpperAndLowerCase() {
		String s="Hello";
		System.out.println("From UpperCase() :"+s.toUpperCase()); //HELLO
		System.out.println("From LowerCase() :"+s.toLowerCase()); //hello
	}

	private static void replaceMethod() {
		String s="abababa";
		System.out.println("From replace() :"+s.replace("b", "a")); // aaaaaaa
	}

	private static void lengthMethod() {
		String s="PhaniRaghava";
		System.out.println("From length() :"+s.length()); // 12
	}

	private static void subStringMethod() {
		String s="HelloWorld";
		System.out.println("From substring() :"+s.substring(5)); //World
		System.out.println("From substring() :"+s.substring(2, 7)); //lloWo
	}

	private static void equalsMethod() {
		String s="hello";
		System.out.print("From equals{} :");
		System.out.println(s.equals("hello")); // true
		System.out.print("From equals{} :");
		System.out.println(s.equalsIgnoreCase("HELLO")); // true
	}

	private static void concatmethod() {
		String s="From concat(): ";
		String m=s.concat("Phani Raghava");
		System.out.println(m); // From concat(): Phani Raghava
	}

	private static void CharAtMethod() {
		String s="HelloWorld";
		System.out.println("From chatAt(): "+s.charAt(5)); // W
	}

	private static void StringConsrtObject() {
		char[] ch={'a','b','x'};
		String s1=new String(ch);
		System.out.println("passing object :"+s1); // abx

		byte[] b={101,(byte) 212,(byte) 332};
		String w=new String(b);
		System.out.println("passing object :"+w);
	}

	private static void InternMethod() {
		String s1="basker";
		String s2=s1.concat("1");
		String s3=s2.intern();
		String s4="basker1";
		System.out.print("From intern() :");
		System.out.println(s3==s4); // true
	}

}
