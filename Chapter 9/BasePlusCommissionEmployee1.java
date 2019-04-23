//9.8: BasePlusCommissionEmployee1.java
// Private superclass member cannot be accessed in a subclass

public class BasePlusCommissionEmployee1 extends CommissionEmployee {
	
	private double baseSalary; //base salary per week

	//Six-argument constructor
	public BasePlusCommissionEmployee1(String firstName, String lastName,
		String socialSecurityNumber, double grossSales,
		double commissionRate, double baseSalary) {

		//Explicit call to superclass CommissionEmployee constructor
		super(firstName, lastName, socialSecurityNumber,
			grossSales, commissionRate);

		//If base salary in invalid throw exception
		if (baseSalary <= 0.0) 
			throw new IllegalArgumentException(
				"Base salary must be > 0.0");

		this.baseSalary = baseSalary;
	}

	//Set base salary
	public void setBaseSalary(double baseSalary) {

		if (baseSalary <= 0.0)
			throw new IllegalArgumentException(
				"Base salary must be > 0.0");

		this.baseSalary = baseSalary;
	}

	//Return base salary
	public double getBaseSalary() {

		return baseSalary;
	}

	//Calculate earnings
	@Override
	public double earning() {

		//Not allowed: commissionRate and grossSales private in superclass
		return getBaseSalary() + super.earnings();
	}

	//Return String representation of BasePlusCommissionEmployee
	@Override
	public String toString() {

		//Not Allowed: attempts to access private superclass members
		return String.format(
			"%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
			"base-salaried commission employee", firstName, lastName,
			"social security number", socialSecurityNumber,
			"gross sales", grossSales, "Commission rate", commissionRate,
			"base salary", baseSalary);
	}



}