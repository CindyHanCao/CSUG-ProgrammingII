/**
 * 
 */
package ModuleOne;

public class test {

	/**
	 * this program is to test the Employee superclass and Manager subclass
	 */
	public static void main(String[] args) {
		// test Employee superclass
		Employee emp = new Employee("Cindy", "Cao", 123);
		emp.setSalary(60000.00);
		emp.employeeSummary();
		
		//test Manager subclass
		Manager mgr = new Manager("Abi","Er", 13, "Data Engineering");
		mgr.setSalary(130000.00);
		mgr.employeeSummary();

	}

}
