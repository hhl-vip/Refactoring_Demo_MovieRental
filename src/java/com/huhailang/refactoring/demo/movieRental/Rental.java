package com.huhailang.refactoring.demo.movieRental;
/**
 * ����
 * @author yxm
 *
 */
public class Rental {
	
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie _movie, int _daysRented) {
		super();
		this._movie = _movie;
		this._daysRented = _daysRented;
	}
	
	public Movie get_movie() {
		return _movie;
	}
	
	public int get_daysRented() {
		return _daysRented;
	}
	/**
	 * ���ü���
	 * @return
	 */
	double getCharge () {
		/*double thisAmount = 0;
		switch (get_movie().get_priceCode()){
			case Movie.REGULAR:
				thisAmount += 2;
				if (get_daysRented()>2) {
					thisAmount += (get_daysRented()-2)*1.5;
				}
			break;
			case Movie.NEW_RELEASE:
				thisAmount += get_daysRented()*3;
			break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (get_daysRented()>3) {
					thisAmount += (get_daysRented()-3)*1.5;
				}
			break;
		}
		return thisAmount;*/return _movie.getCharge(_daysRented);
	}
	/**
	 * �e���\��Ҏ�t
	 * @return
	 */
	int getFrequentRenterPoints() {
		// add bonus for a two day new release rental
		/*if (get_movie().get_priceCode() == Movie.NEW_RELEASE && get_daysRented() > 1) {
			return 2;
		} else {
			return 1;
		}*/
		return _movie.getFrequentRenterPoints(_daysRented);
	}
}
