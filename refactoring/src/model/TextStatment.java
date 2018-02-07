package model;

public class TextStatment implements StatmentBuilder {
	private StringBuffer str;
	
	public TextStatment() {
		str = new StringBuffer();
	}
	
	public void buildStatment() {
		
	}
		
	public void addUserName(String userName) {
		str.append("Rental Record for " + userName +"\n");
	}
	
	public void addRentalStatment(String movieTitle, double pricing) {
		str.append("\t" + movieTitle + "\t" + pricing + "\n");	
	}
	
	public void addAmountOwned(double totalAmount) {
		str.append("Amount owned is " + totalAmount + "\n");
	}
	
	public void addFreqTotalPoints(double freqTotalPoints) {
		str.append("You earned " + freqTotalPoints + " frequent renter points");
	}
	
	public void finishStatment() {
	}
}
