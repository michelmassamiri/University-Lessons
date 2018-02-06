package model;
import java.util.*;

public class Customers
{
    private String _name;
    private Vector _rentals = new Vector();
    public Customers(String name)
    {
	_name=name;
    }
    public void addRental(Rental rental)
    {
	_rentals.addElement(rental);
    }
    public String getName()
    {
	return _name;
    }
    
    
    //points de fidelite pour tous les films (ici)
    private int getFreqPointTotal() {
    	int frequentRentalPoints = 0;
    	Enumeration rentals=_rentals.elements();
    	
    	while (rentals.hasMoreElements()) {
    		Rental each=(Rental) rentals.nextElement();
    		frequentRentalPoints += each.getMovie().getFrequentRentalPoints(each.getDaysRented());
    	}
    	return frequentRentalPoints;
    }
    
    //calcul le montant totale de tous les locations (ici)
    private double getTotalAmount() {
    	double totalAmount = 0;
    	Enumeration rentals=_rentals.elements();
    	
    	while (rentals.hasMoreElements()) {
    		Rental each=(Rental) rentals.nextElement();
    		totalAmount += each.getMovie().getPrice().price(each.getDaysRented());
    	}
    	
    	return totalAmount ;
    }
    
    public String statement()
    {
	Enumeration rentals=_rentals.elements();
	String result = "Rental Record for "+getName()+"\n";
	
	while (rentals.hasMoreElements())
	    {
		Rental each=(Rental) rentals.nextElement();
		
		result +="\t" + each.getMovie().getTitle()+"\t"+
		    String.valueOf(each.getMovie().getPrice().price(each.getDaysRented())) +" \n";
	    }
	
	result += "Amount owned is " + String.valueOf(getTotalAmount()) +
	    "\n";
	result += "You earned " + String.valueOf(getFreqPointTotal()) +
	    " frequent renter points";
	
	return result;
	 
    }
}
 