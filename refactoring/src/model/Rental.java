package model;

public class Rental {
    private Movie _movie;
    private int _daysRented;
    private Price _pricing;
    
    public Rental(Movie movie, int daysRented)
    {
	_movie=movie;
	_daysRented=daysRented;
	_pricing = (Price)_movie.getPrice().clone();
    }
    public int getDaysRented()
    {
	return _daysRented; 
    }
    public Movie getMovie()
    {
	return _movie;
    }
    
    public double getPricing() {
    	return _pricing.price(_daysRented);
    }
    
    //calculer les points fidelites
    public int getFrequentRentalPoints() {
		if( (this.getMovie().getPrice()== Movie.NEW_RELEASE) && (this.getDaysRented()>1)) 
		    return 2 ;
		
		return 1 ;
    }
}
