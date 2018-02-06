package model;
import java.util.*;

public class Customer
{
    private String _name;
    private Vector<Rental> _rentals = new Vector<Rental>();
    public Customer(String name)
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
    	
    	for(Rental each : _rentals) {
    		frequentRentalPoints += each.getFrequentRentalPoints();
    	}

    	return frequentRentalPoints;
    }
    
    //calcul le montant totale de tous les locations (ici)
    private double getTotalAmount() {
    	double totalAmount = 0;
    	
    	for(Rental each : _rentals) {
    		totalAmount += each.getPricing();
    	}
    	
    	return totalAmount ;
    }
    
    public String statement()
    {
	String result = "Rental Record for "+getName()+"\n";
	
	for(Rental each : _rentals) {
		result +="\t" + each.getMovie().getTitle()+"\t"+
			    String.valueOf(each.getPricing()) +" \n";
	}

	result += "Amount owned is " + String.valueOf(getTotalAmount()) +
	    "\n";
	result += "You earned " + String.valueOf(getFreqPointTotal()) +
	    " frequent renter points";
	
	return result;
	 
    }
}
 