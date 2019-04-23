//9.7: BasePlusCommissionEmployeeTest.java
//BasePlusCommissionEmployee test program.

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {

		//Instantiate BasePlusCommissionEmployee object
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
			"Bob", "Lewis", "333-33-333", 5000, .04, 300);

		//Get base-salaried commission employee data
		System.out.println(
			"Employee information obtained by get methods:%n");
		System.out.printf("%s %s%n", "first name is",
			employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is:",
			employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is:",
			employee.getSocialSecurityNumber());
		System.out.printf("%s %s%n", "Gross sale is:", 
			employee.getGrossSales());
		System.out.printf("%s %s%n", "Commission rate is:",
			employee.getCommissionRate());
		System.out.printf("%s %s%n", "Base salary is:",
			employee.getBaseSalary());

		employee.setBaseSalary(1000);

		System.out.printf("%n%s:%n%n%s%n",
			"Updated employee information obtained by toString",
			employee.toString());

	}

}