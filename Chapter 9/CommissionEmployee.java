//9.4: CommissionEmployee.java
//CommissionEmployee calss represents an employee paid a
//percentage of gross sales.
public class CommissionEmployee extends Object {
	
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales; //gross weekly sales
	private double commissionRate; // commission percentage

	//Five-argument constructor
	public CommissionEmployee(String firstName, String lastName,
		String socialSecurityNumber, double grossSales,
		double commissionRate) {

		//Implicit call to Object's default default constructor occurs here

		//If grossSales is invalid throw exception
		if (grossSales < 0.0)
			throw new IllegalArgumentException(
				"Gross sales must be >= 0.0");

		//If commissionRate is invalid throw exception
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
				"Commission rate must be > 0.0 and <1.0");

		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} //End constructor

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

	//Return gross sales amount
	public void setGrossSales(double grossSales) {

		if (grossSales < 0.0)
			throw new IllegalArgumentException(
				"Gross sales must be >= 0.0");

		this.grossSales = grossSales;
	}

	//Return grossSales amount
	public double getGrossSales() {

		return grossSales;
	}

	//Set commission rate
	public void setCommissionRate(double commissionRate) {

		if (commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
				"Commission rate must be > 0.0 and < 1.0");

		this.commissionRate = commissionRate;
	}

	//Return commission rate
	public double getCommissionRate() {

		return commissionRate;
	}

	//Calculate earnings
	public double earnings() {

		return getCommissionRate() * getGrossSales();
	}

	//Return String representation of CommissionEmployee object
	@Override //indicates that this method overrides a superclass method
	public String toString() {

		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
			"Commission employee", getFirstName(), getLastName(),
			"social security number", getSocialSecurityNumber(),
			"gross sales", getGrossSales(),
			"Commission rate", getCommissionRate());
	}




}