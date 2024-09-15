/**
 * 
 */
package ModuleOne;

/**
 * 
 */
public class Employee {

	/**
	 * @param args
	 */
	protected String firstName;
	protected String lastName;
	protected int employeeID;
	protected double salary;
	
	public Employee(String firstName, String lastName, int employeeID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.salary = 0.00;
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setSalary(double salary) {
		this.salary= salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	public void employeeSummary() {
		System.out.println("Employee first name: " + firstName);
		System.out.println("Employee last name: " + lastName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Employee salary: " + salary);
	}
	

}
