package model;

public class Movie {
	//DefaultPrice has dayFees : 1, dayLimits = 1, fees = 2
	//private Price defaultPrice = new DefaultPrice(1, 1, 2);

    public final static Price CHILDRENS = new DefaultPrice(1.5, 3, 1.5); //change it to Price 
    public final static Price REGULAR = new DefaultPrice(1.5, 2, 2); // change it to price
    public final static Price NEW_RELEASE = new DefaultPrice(3, 0, 0); // change it to price
  
    private String _title;
    private Price _price; // Price _price;
  
    public Movie(String title,Price price) //Price price
    {
	_title=title;
	_price=price; //_price = price.clone();
    }
    public Price getPrice()
    {
	return _price; //return _price;
    }
    public void setPriceCode(Price price) //Price price
    {
	_price=price; //_price = price.clone();
    }
    public String getTitle()
    {
	return _title;
    }
    
}
