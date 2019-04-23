//9.11: BasePlusCommissionEmployee.java
//BasePlusCommissionEmployee class inherits from CommissionEmployee
//and accesses the superclass's private data via inherited
//public method

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary; //base salary per week

	//Six-argument constructor
	public BasePlusCommissionEmployee(String firstName, String lastName,
		String socialSecurityNumber, double grossSales, 
		double commissionRate, double baseSalary) {

		super(firstName, lastName, socialSecurityNumber,
			grossSales, commissionRate);

		//If baseSalary is invalid throw exception
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
	public double earnings() {

		return getBaseSalary() + super.earnings();
	}

	//Return String representation of BasePlusCommissionEmployee
	@Override
	public String toString() {

		return String.format("%s %s%n%s: %.2f", "base-salaried",
			super.toString(), "base salary", getBaseSalary());
	}


}