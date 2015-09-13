package com.huhailang.refactoring.demo.movieRental;
/**
 * ӰƬ
 * @author yxm
 *
 */
public class Movie {
	
	public static final int CHILDRENS = 2;
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;
	
	private String _title;
	private int _priceCode;
	private Price _price;
	
	
	public Movie(String _title, int _priceCode) {
		super();
		this._title = _title;
		set_priceCode(_priceCode);
	}

	public int get_priceCode() {
		return _price.getPriceCode();
	}

	public void set_priceCode(int _priceCode) {
		//this._priceCode = _priceCode;
		switch (_priceCode){
			case REGULAR:
				_price = new RegularPrice();
			break;
			case NEW_RELEASE:
				_price = new NewReleasePrice();
			break;
			case CHILDRENS:
				_price = new ChildrensPrice();
			break;
		}
	}
	public String get_title() {
		return _title;
	}
	double getCharge (int daysRented) {
		return _price.getCharge(daysRented);
	}
	int getFrequentRenterPoints(int daysRented){
		/*if (get_priceCode() == Movie.NEW_RELEASE && daysRented > 1) {
			return 2;
		} else {
			return 1;
		}*/
		return _price.getFrequentRenterPoints(daysRented);
	}
	
}
