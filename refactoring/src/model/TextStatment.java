package model;

public class TextStatment extends StringBuilder {
	
	public TextStatment() {
		str = new StringBuffer();
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
	
	public String getResult() {
		return str.toString();
	}
}
