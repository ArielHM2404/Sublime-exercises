//10.13: Employee.java
//Employee abstract superclass that implements Payable

public abstract class Employee implements Payable {
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

	//Constructor
	public Employee(String firstName, String lastName,
		String socialSecurityNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	//Return first name
	public String getFirstName() {

		return firstName;
	}

	//Return last name
	public String getLastName() {

		return lastName;
	}

	//Return social security number
	public String getSocialSecurityNumber() {

		return socialSecurityNumber;
	}

	//Return a String representation of Employee object
	@Override
	public String toString() {

		return String.format("%s %s%nsocial security number: %s",
			getFirstName(), getLastName(), getSocialSecurityNumber());
	}

	//Note: We do not implement Payable method getPaymentAmount here so
	//thos class must be declared abstract to avoid compilation error.
}