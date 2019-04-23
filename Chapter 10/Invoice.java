//10.12: Invoice.java
//Invoice class that implements Payable

public class Invoice implements Payable {
	
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;

	//Constructor
	public Invoice(String partNumber, String partDescription, int quantity,
		double pricePerItem) {

		if (quantity < 0) //validate quantity
		throw new IllegalArgumentException("Quantity must be >=0");

		if (pricePerItem < 0.0)
			throw new IllegalArgumentException(
				"Price per item must be >=0");

		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	} //End constructor

	//get part number
	public String getPartNumber() {

		return partNumber;
	}

	//get description
	public String getPartDescription() {

		return partDescription;
	}

	//Set quantity
	public void setQuantity(int quantity) {

		if (quantity < 0)
			throw new IllegalArgumentException("Quantity must be >= 0");

		this.quantity = quantity;
	}

	//Get quantity
	public int getQuantity() {

		return quantity;
	}

	//Set price per item
	public void setPricePerItem(double pricePerItem) {

		if (pricePerItem < 0.0)
			throw new IllegalArgumentException(
				"Price must be >= 0.0");

		this.pricePerItem = pricePerItem;
	}

	//Get price per item
	public double getPricePerItem() {

		return pricePerItem;
	}

	//Return String representation of invoice object
	@Override
	public String toString() {

		return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
			"invoice", "part number", getPartNumber(), getPartDescription(),
			"quantity", getQuantity(), "price per item", getPricePerItem());
	}

	//Method required to carry out contract with interface Payable
	@Override
	public double getPaymentAmount() {

		return getQuantity() * getPricePerItem(); //calculate total cost
	}

}