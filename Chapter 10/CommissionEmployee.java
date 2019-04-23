//10.7: CommissionEmployee.java
//CommissionEmployee class extends Employee

public class CommissionEmployee extends Employee {

	private double grossSales; //gross weekly sales
	private double commissionRate; //commission percentage

	//Constructor
	public CommissionEmployee(String firstName, String lastName,
		String socialSecurityNumber, double grossSales,
		double commissionRate) {

		super(firstName, lastName, socialSecurityNumber);

		if (commissionRate <= 0.0) //validate
		throw new IllegalArgumentException(
			"Commission rate must be > 0.0 and <1.0");

		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");

		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}

	//Set gross sales amount
	public void setGrossSales(double grossSales) {

		if (grossSales < 0.0) //validate
		throw new IllegalArgumentException("Gross sales must be >= 0.0");

		this.grossSales = grossSales;
	}

	//Return gross sales amount
	public double getGrossSales() {

		return grossSales;
	}

	//Set commission rate
	public void setCommissionRate(double commissionRate) {

		if ((commissionRate) <= 0.0 || (commissionRate >= 1.0))// validate
		throw new IllegalArgumentException(
			"Commission rate must be > 0.0 and < 1.0");

		this.commissionRate = commissionRate;
	}

	//Return commission rate
	public double getCommissionRate() {

		return commissionRate;
	}

	//Calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings() {

		return getCommissionRate() * getGrossSales();
	}

	//Return String representation of CommissionEmployee object
	@Override
	public String toString() {

		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
			"Commission employee", super.toString(),
			"gross sales", getGrossSales(),
			"Commission rate", getCommissionRate());
	}


	

}