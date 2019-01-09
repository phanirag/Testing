package lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class nothing {


		public static void main(String[] args) {
			List<String> topic=new ArrayList<String>();
			topic=Arrays.asList("hari","nothing");
			List<String> top=new ArrayList<String>();
			topic.forEach(top::add); // lambda expression with method referencing
			top.forEach(n ->System.out.println(n)); // lambda expression
			
			Map<Integer,String> ma=new Hashtable<Integer, String>();
			for(int i=0;i<=10;i++){
			ma.put(i, "ram"+i);
			}
			
		}
}
