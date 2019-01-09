package fileRead;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;


public class fileRead {

	public static void main(String[] args) throws Exception   {
		
		try {
			String name = "C:"+File.separator+"Users"+File.separator+"raghav"+File.separator+"Desktop"+
					       File.separator+"access.log";
			FileInputStream fis = new FileInputStream(name);
			DataInputStream dis = new DataInputStream(fis);
			String data = dis.readUTF();
			String arr[] = data.split("\\|");
			
			System.out.println(Arrays.toString(arr));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
