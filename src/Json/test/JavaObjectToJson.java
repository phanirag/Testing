package Json.test;

import org.codehaus.jackson.map.ObjectMapper;

public class JavaObjectToJson {

	public static void main(String[] args) {
	EmpModelClass em=new EmpModelClass();
	em.setEmpId(10);
	em.setEmpName("Hari");
	em.setEmpSal(33.4);
	em.setEmpPwd("xxxx");
		
	
	try {
		ObjectMapper om=new ObjectMapper();
		String json=om.writeValueAsString(em);
		System.out.println(json);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
