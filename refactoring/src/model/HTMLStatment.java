package model;

public class HTMLStatment extends StringBuilder {
	public HTMLStatment() {
		str = new StringBuffer();
	}
	
	public void beginStatment() {
    	str.append("<html><body>");
	}
	
	public void addUserName(String userName) {
		str.append("<H1>Rental Record for " + userName+ "<BR>");
	}
	
	public void addRentalStatment(String movieTitle, double pricing) {
		str.append("<EM>" + "<P>" + movieTitle +"\t"+ pricing + "</P>" + "<BR>");
	}
	
	public void addAmountOwned(double totalAmount) {
		str.append("<P>Amount owned is " + totalAmount + "</P>" + "<BR>");
	}
	
	public void addFreqTotalPoints(double freqTotalPoints) {
		str.append("<P>You earned " + freqTotalPoints + " frequent renter points" + "</P>" + "<BR>");
	}
	
	public void endStatment() {
		str.append("</body></html>");
	}
	
	public String getResult() {
		return str.toString();
	}
}
