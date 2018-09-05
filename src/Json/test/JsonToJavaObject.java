package Json.test;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonToJavaObject {

	public static void main(String[] args) {
		String json="{\"empId\":10,\"empName\":\"Hari\",\"empSal\":33.4}";
		
		try {
			ObjectMapper om=new ObjectMapper();
			EmpModelClass em=om.readValue(json, EmpModelClass.class);
			System.out.println(em);
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}
	}
}
