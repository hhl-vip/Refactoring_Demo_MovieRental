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
	
	
}
