package logicsqustions;

import java.util.ArrayList;
import java.util.List;

public class progsasd {

	public static void main(String[] args) {
		/*String lines="hello how r you doing..!";
		String sw="",lw="";
		String words[]=lines.split(" ");
		int sl=lines.length(),ll=0;
		for (String word : words) {
			
			if(word.length()<sl) {
				sw=word;
				sl=word.length();
			}
			
			if(word.length()>ll) {
				lw=word;
				ll=word.length();
			}
			
		}
		System.out.println("s::"+sw);
		System.out.println("l::"+lw);*/
		String line="avinashdabahdeisverys";
		List<String> list=new ArrayList<>();
		
		char ch[]=line.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					list.add(line.substring(i, j));
				}
					
			}
			
		}
		System.out.println("list :"+list);
	}
		
}
