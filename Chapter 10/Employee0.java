//10.4: Employee.java
//Employee abstract superclass.

public abstract class Employee {
	
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

	//Return String representation of employee object
	@Override
	public String toString() {

		return String.format("%s %s%nsocial security number: %s",
			getFirstName(), getLastName(), getSocialSecurityNumber());
	}

	//Abstract method must be overridden by concrete subclassess
	public abstract double earnings(); //no implementation here
}//End of abstract class employee