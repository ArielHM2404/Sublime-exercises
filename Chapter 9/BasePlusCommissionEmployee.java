// 9.6: BasePlusCommissionEmployee.java
//BasePlusCommissionEmployee class represents an employee who receives
//a base salary in addition to commission.

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	protected final String firstName;
	protected final String lastName;
	protected final String socialSecurityNumber;
	protected double grossSales; //gross weekly sales
	protected double commissionRate; //commission percentage
	protected double baseSalary; //base salary per week

	//Six-argument constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, 
		String socialSecurityNumber, double grossSales, 
		double commissionRate, double baseSalary) {

		super(firstName, lastName, socialSecurityNumber,
			grossSales, commissionRate);

		//If grossSales is invalid throw exception
		if (grossSales < 0.0)
			throw new IllegalArgumentException(
				"Gross sales must be >= 0.0");

		//If commissionRate is invalid throw exception
		if (commissionRate <= 0.0 || commissionRate > 1.0)
			throw new IllegalArgumentException(
				"CommissionRate must be > 0.0 and < 1.0");

		//If baseSalary is invalid throw exception
		if (baseSalary <= 0.0)
			throw new IllegalArgumentException(
				"Base salary must be > 0.0");

		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
	}// End of constructor

	//Return first name
	public String getFirstName() {

		return firstName;
	}

	//Return last name
	public String getLastName() {

		return lastName;
	}

	//Return socialSecurityNumber
	public String getSocialSecurityNumber() {

		return socialSecurityNumber;
	}

	//Set gross sales amaount
	public void setGrossSalesAmount(double grossSales) {

		if (grossSales < 0.0 || grossSales > 1.0) 
			throw new IllegalArgumentException(
				"Gross sales must be > 0.0 and < 1.0");

		this.grossSales = grossSales;
	}

	//Return gross sales
	double getGrossSales() {

		return grossSales;
	}

	//Set commission rate
	public void setCommissionRate(double commissionRate) {

		if (commissionRate < 0.0 || commissionRate >=1.0)
			throw new IllegalArgumentException(
				"Commission rate must be > 0.0 and < 1.0");

		this.commissionRate = commissionRate;
	}

	//Return commission rate
	public double getCommissionRate() {

		return commissionRate;
	}

	//Set base salary
	public void setBaseSalary(double baseSalary) {

		if (baseSalary < 0.0)
			throw new IllegalArgumentException(
				"Base salary must be >= 0.0");

		this.baseSalary = baseSalary;
	}

	//Return base salary
	public double getBaseSalary() {

		return baseSalary;
	}

	//Calculate earnings
	@Override //indicates that this method overrides a superclass method
	public double earning() {

		return baseSalary + (commissionRate * grossSales);
	}

	//Return String representation og BasePlusCommissionEmployee
	@Override
	public String toString() {

		return String.format(
			"%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
			"Base-slaried commission employee", firstName, lastName,
			"Social security number", socialSecurityNumber,
			"gross sales", grossSales, "commission rate", commissionRate,
			"base salary", baseSalary);
	}

}