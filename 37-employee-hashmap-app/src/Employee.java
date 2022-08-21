

public abstract class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	
	public Employee(int employeeId, String employeeName, double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}
	
	public void printDetails() {
		System.out.println("Id :"+employeeId);
		System.out.println("Name :"+employeeName);
		System.out.println("Basic Salary :"+basicSalary);
	}
	//In abstract class we can also have static methods and which can be called by classname.staticmethod()
//	public static void printStatic() {
//		System.out.println("bgiuwwowongow");
//	}
	
	public abstract double calculateAnnualCTC();
	
	public abstract void printEmployeeSalaryDetails();
	
}
