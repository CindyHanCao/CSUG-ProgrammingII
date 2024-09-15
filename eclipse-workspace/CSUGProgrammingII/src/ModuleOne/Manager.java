/**
 * 
 */
package ModuleOne;

/**
 * 
 */
public class Manager extends Employee {

	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeID
	 * @param department
	 * */
	private String department;
	
	// constructor
	public Manager(String firstName, String lastName, int employeeID, String department) {
		super(firstName, lastName, employeeID);
		this.department = department;
		// TODO Auto-generated constructor stub
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	//Override
	public void employeeSummary() {
		// print out superclass attributes
		super.employeeSummary();
		
		// print Manager subclass specific attributes
		System.out.println("Employee department: " + department);
	}

}
