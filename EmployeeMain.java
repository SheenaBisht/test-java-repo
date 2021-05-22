package assignment;
class Employee{
	int id;
	String firstName;
	String lastName;
	int salary;
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
		
	}
	public String getFirstname() {
		return firstName;
		
	}
	public String getLastName() {
		return lastName;
		
	}
	public String getName() {
		return firstName + lastName;
		
	}
	public int getSalary() {
		return salary;
		
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary() {
		return salary * 12;
		
	}
	public int raiseSalary(int percent) {
		return salary + (percent*salary)/100;
		
	}
	public String toString() {
		return "Employee[id = " + id + ", name = " + firstName +" "+ lastName + ", salary = " + salary + "]";
	}

}
public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee(38, "Sheena","Bisht", 30000);
			System.out.println(emp.toString());
			emp.setSalary(40000);
			System.out.println(emp.toString());
			System.out.println(emp.getAnnualSalary());
			System.out.println(emp.raiseSalary(20));
	}

}
