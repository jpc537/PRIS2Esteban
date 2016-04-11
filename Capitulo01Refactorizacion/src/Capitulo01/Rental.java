package Capitulo01;

public class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	public double getCharge(int daysRented) {
		 double result = 0;
		 switch (getPriceCode()) {
		 case Movie.REGULAR:
		 result += 2;
		 if (daysRented > 2)
		 result += (daysRented - 2) * 1.5;
		 break;
		 case Movie.NEW_RELEASE:
		 result += daysRented * 3;
		 break;
		 case Movie.CHILDRENS:
		 result += 1.5;
		 if (daysRented > 3)
		 result += (daysRented - 3) * 1.5;
		 break;
		 }
		 return result;
		 }


	 
	 int getFrequentRenterPoints() {
		 return _movie.getFrequentRenterPoints(_daysRented);
		 }
	

}
