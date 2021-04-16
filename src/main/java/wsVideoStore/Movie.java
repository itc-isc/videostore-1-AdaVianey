package wsVideoStore;

public abstract class Movie
{
	private String title;
	public static final int REGULAR = 1;
	public static final int NEW_RELEASE = 2;
	public static final int CHILDRENS = 3;
	public int priceCode;

	public Movie(String title, int priceCode) {
		this.title 		= title;
		this.priceCode 	= priceCode;
	}
		
	public String getTitle () {
		return title;
	}

	public int getPriceCode () {
		return priceCode;
	}
  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);
}