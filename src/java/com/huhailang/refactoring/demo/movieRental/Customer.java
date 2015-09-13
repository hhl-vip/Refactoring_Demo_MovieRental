package com.huhailang.refactoring.demo.movieRental;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	
	private String _name;
	private Vector _rentals = new Vector();
	
	public Customer(String _name) {
		super();
		this._name = _name;
	}

	public String getName() {
		return _name;
	}
	
	public void addRental(Rental rental){
		_rentals.addElement(rental);
	}
	
	public String statement(){
		
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for * "+getName()+"\n";
		while (rentals.hasMoreElements()) {
			//double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();
			//thisAmount = each.getCharge();
			/*switch (each.get_movie().get_priceCode()){
				case Movie.REGULAR:
					thisAmount += 2;
					if (each.get_daysRented()>2) {
						thisAmount += (each.get_daysRented()-2)*1.5;
					}
					break;
				case Movie.NEW_RELEASE:
					thisAmount += each.get_daysRented()*3;
					break;
				case Movie.CHILDRENS:
					thisAmount += 1.5;
					if (each.get_daysRented()>3) {
						thisAmount += (each.get_daysRented()-3)*1.5;
					}
					break;
			}*/		
			/*// add frequent rental points 
			frequentRenterPoints++;
			//add bonus for a two day new release rental
			if (each.get_movie().get_priceCode()==Movie.NEW_RELEASE&&each.get_daysRented()>1) {
				frequentRenterPoints++;
			}*/
			frequentRenterPoints += each.getFrequentRenterPoints();
			//show figures for this rental
			result += "\t"+each.get_movie().get_title()+"/t"+String.valueOf(each.getCharge());
			totalAmount += each.getCharge();
		}
		// add footer lines
		result += "Amount owed is "+String.valueOf(totalAmount)+"\n";
		result += "Your earned "+String.valueOf(frequentRenterPoints)+" frequent rental points";
		return result;
	}
	
	/*private double amountFor (Rental aRental) {
		double thisAmount = 0;
		switch (aRental.get_movie().get_priceCode()){
			case Movie.REGULAR:
				thisAmount += 2;
				if (aRental.get_daysRented()>2) {
					thisAmount += (aRental.get_daysRented()-2)*1.5;
				}
			break;
			case Movie.NEW_RELEASE:
				thisAmount += aRental.get_daysRented()*3;
			break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (aRental.get_daysRented()>3) {
					thisAmount += (aRental.get_daysRented()-3)*1.5;
				}
			break;
		}
		return thisAmount;
	}*/
}
