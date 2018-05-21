package denny;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String name;
	private Vector _rentals = new Vector();

	public Customer(String newname) {
		name = newname;
	};

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	};

	public String getName() {
		return name;
	};

	public String statement() {
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + this.getName() + "\n";
		result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + "\t" + each.getDaysRented() + "\t"
					+ String.valueOf(each.getCharge()) + "\n";
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentrenterPoints();
		}
		return result;
	}
}
