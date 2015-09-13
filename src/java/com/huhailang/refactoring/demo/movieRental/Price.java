package com.huhailang.refactoring.demo.movieRental;
/**
 * ¼Û¸ñ×´Ì¬
 * @author yxm
 *
 */
public abstract class Price {
	abstract int getPriceCode();
	abstract double getCharge (int daysRented);
	abstract int getFrequentRenterPoints(int daysRented);
	/*double getCharge (int daysRented) {
		double thisAmount = 0;
		switch (getPriceCode()){
			case Movie.REGULAR:
				thisAmount += 2;
				if (daysRented>2) {
					thisAmount += (daysRented-2)*1.5;
				}
			break;
			case Movie.NEW_RELEASE:
				thisAmount += daysRented*3;
			break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (daysRented>3) {
					thisAmount += (daysRented-3)*1.5;
				}
			break;
		}
		return thisAmount;
	}*/
}
class ChildrensPrice extends Price{
	@Override
	int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.CHILDRENS;
	}

	@Override
	double getCharge(int daysRented) {
		double thisAmount = 0;
		thisAmount += 1.5;
		if (daysRented>3) {
			thisAmount += (daysRented-3)*1.5;
		}
		// TODO Auto-generated method stub
		return thisAmount;
	}

	@Override
	int getFrequentRenterPoints(int daysRented) {
		// TODO Auto-generated method stub
		return 1;
	}
}
class NewReleasePrice extends Price{

	@Override
	int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.NEW_RELEASE;
	}

	@Override
	double getCharge(int daysRented) {
		double thisAmount = 0;
		thisAmount += daysRented*3;
		// TODO Auto-generated method stub
		return thisAmount;
	}

	@Override
	int getFrequentRenterPoints(int daysRented) {
		// TODO Auto-generated method stub
		return 1;
	}
}
class RegularPrice extends Price{
	@Override
	int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.REGULAR;
	}

	@Override
	double getCharge(int daysRented) {
		// TODO Auto-generated method stub
		double thisAmount = 0;
		thisAmount += 1.5;
		if (daysRented>3) {
			thisAmount += (daysRented-3)*1.5;
		}
		return thisAmount;
	}
	@Override
	int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1) {
			return 2;
		} else {
			return 1;
		}
	}
	
}