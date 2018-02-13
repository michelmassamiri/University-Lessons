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
    
    public void statement(StatmentBuilder builder)
    {
    	builder.beginStatment();
    	builder.addUserName(getName());
    	
    	for(Rental each: _rentals) {
    		builder.addRentalStatment(each.getMovie().getTitle(), each.getPricing());
    	}
    	
    	builder.addAmountOwned(getTotalAmount());
    	builder.addFreqTotalPoints(getFreqPointTotal());
    	
    	builder.endStatment();
    }
    
    public String statementHTML() {
    	StringBuffer str = new StringBuffer();
    	
    	str.append("<html><body>");
    	str.append("<H1>Rental Record for " + getName()+ "<BR>\n");
    	
    	for(Rental each : _rentals)
    		str.append("\t" + "<P>" + each.getMovie().getTitle()+"\t"+ each.getPricing() + "</P>" + "<BR>\n");    	
    	
    	str.append("<P>Amount owned is " + getTotalAmount() + "</P>" + "<BR>\n");
    	str.append("<P>You earned " + getFreqPointTotal() + " frequent renter points" + "</P>" + "<BR>\n");
    	
    	str.append("</body></html>");
    	return str.toString();
    }
}
 