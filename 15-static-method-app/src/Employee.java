
public class Employee {
	private int id;
	private String name;
	private int salary;

	private static int count;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	// since instance variables are not static so static printEmpDetails cannot
	// access it.
//	public static void printEmpDetail() {
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(salary);
//	}

	public void printEmpDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}
