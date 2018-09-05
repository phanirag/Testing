package Json.test;

import org.codehaus.jackson.annotate.JsonIgnore;

public class EmpModelClass {

	public int empId;
	public String empName;
	public double empSal;
	@JsonIgnore
	public String empPwd;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	@Override
	public String toString() {
		return "EmpModelClass [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + ", empPwd=" + empPwd + "]";
	}
	
	
}
