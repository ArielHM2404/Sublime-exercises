//10.15: PayableInterfaceTest.java
//Payable interface test program processing Invoice and
//Employees polymorphically.
public class PayableInterfaceTest {
	
	public static void main(String[] args) {

		//Create four-element Payable array
		Payable[] payableObjects = new Payable[4];

		//Populate array with objects that implement Payable
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = 
			new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		payableObjects[3] =
			new SalariedEmployee("Lisa", "Barnes", "222-22-2222", 1200.00);

			System.out.printf(
				"Invoice and Employees processed polymorphically:");

			//Generically process eacj element in array payableObject
			for (Payable currentPayable : payableObjects) {

				//Output currentPayable and its appropriate payment amount
				System.out.printf("%n%s %n%s: $2%.2f%n",
					currentPayable.toString(), //could invoke implicity
					"Payment due", currentPayable.getPaymentAmount());
			}

	}
}