/**
 * 
 */
package ModuleOne;

public class Employee {

	/**
	 * @param firstname, lastname, employee id, and salary
	 * @author cindycao
	 * @version 2024.10.5
	 * Purpose: this program takes employee's first name, last name, id, and salary as input, and print thpse info out
	 * 
	 * */
	
	// Properties 
	protected String firstName;
	protected String lastName;
	protected int employeeID;
	protected double salary;
	
	// Constructor
	public Employee(String firstName, String lastName, int employeeID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.salary = 0.00;
		
	}
	
	// Setter function for first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	// Getter function for first name
	public String getFirstName() {
		return firstName;
	}
	
	// Setter function for last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// Getter function for last name
	public String getLastName() {
		return lastName;
	}
	
	// Setter function for ID 
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	// Getter function for ID 
	public int getEmployeeID() {
		return employeeID;
	}
	
	// Setter function for salary 
	public void setSalary(double salary) {
		this.salary= salary;
	}
	
	// Getter function for salary 
	public double getSalary() {
		return salary;
	}
	
    // Print out the info	
	public void employeeSummary() {
		System.out.println("Employee first name: " + firstName);
		System.out.println("Employee last name: " + lastName);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Employee salary: " + salary);
	}
	

}
