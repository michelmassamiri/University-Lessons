package model;

public class TextStatment extends StringBuilder {
	
	public TextStatment() {
		str = new StringBuffer();
	}
		
	public void addUserName(String userName, String message) {
		str.append(message + userName +"\n");
	}
	
	public void addRentalStatment(String movieTitle, double pricing) {
		str.append("\t" + movieTitle + "\t" + pricing + "\n");	
	}
	
	public void addAmountOwned(double totalAmount, String message) {
		str.append(message + totalAmount + "\n");
	}
	
	public void addFreqTotalPoints(double freqTotalPoints, String message) {
		str.append("You earned " + freqTotalPoints + " frequent renter points");
	}
	
	public String getResult() {
		return str.toString();
	}
}
