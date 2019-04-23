//10.1: PolymorphismTest.java
//Assigning superclass and subclass references to superclass and
//Subclass variable.

public class PolymorphismTest {
	
	public static void main(String[] args) {

		//Assign superclass reference to superclass variable
		CommissionEmployee commissionEmployee = new CommissionEmployee(
			"Sue", "Jones", "222-22-2222", 10000, .06);

		//Assign subclass reference ti subclass variable
		BasePlusCommissionEmployee basePlusCommissionEmployee = 
		new BasePlusCommissionEmployee(
			"Bob", "Lewis", "333-33-333", 5000, .04, 300);

		//Invoke toString in superclass object using superclass variable
		System.out.printf("%s %s:%n%n%s%n%n", 
			"Call CommissionEmployee's toString with superclass reference ",
			"to superclass object", commissionEmployee.toString());

		//Invoke toString on Subclass object using subclass variable
		System.out.printf("%s %s:%n%n%s%n%n",
			"Call BasePlusCommissionEmployee's toString with subclass",
			"Reference to subclass object",
			basePlusCommissionEmployee.toString());

		//Invoke toString on subsclass object using superclass variable
		CommissionEmployee commissionEmployee2 =
		basePlusCommissionEmployee;
		System.out.printf("%s %s:%n%n%s%n%n",
			"Call BasePlusCommissionEmploye's toString with superclass",
			"reference to subclass object", commissionEmployee2.toString());
	}
}