//10.6: HourlyEmployee.java
//HourlyEmployee class extends Employee

public class HourlyEmployee extends Employee {
	
	private double wage; //wage per hour
	private double hours; //hours worked for week

	//Constructor
	public HourlyEmployee( String firstName, String lastName, 
		String socialSecurityNumber, double wage, double hours) {
		 
		 super(firstName, lastName, socialSecurityNumber);

		 if (wage < 0.0) //validate wage
		 throw new IllegalArgumentException(
		 	"Hourly wage must be >= 0.0");

		 if ((hours < 0.0) || (hours > 168.0)) // validate hours
		 throw new IllegalArgumentException(
		 	"Hours worked must be >= 0.0 and <= 168");

		 this.wage = wage;
		 this.hours = hours;
	}

	//Set wage
	public void setWage(double wage) {

		if (wage < 0.0) //Validate wage
		throw new IllegalArgumentException(
			"Hourly wage must be >= 0.0");

		this.wage = wage;
	}

	//Return wage
	public double getWage() {

		return wage;
	}

	//Set hours worked
	public void setHours(double hours) {

		if ((hours < 0.0) || (hours > 168.0))
			throw new IllegalArgumentException(
				"Hours worked must be >= 0.0 and <= 168.0");

		this.hours = hours;
	}

	//Return hours
	public double getHours() {

		return hours;
	}

	//Calculate earnings; override abstract method eanings in Employee
	@Override
	public double earnings() {

		if (getHours() <=40) //no overtime
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}

	//Return String representation of HourlyEmployee object
	@Override
	public String toString() {

		return String.format("Hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
			super.toString(), "hourly wage", getWage(),
			"hours worked", getHours());

	}



}