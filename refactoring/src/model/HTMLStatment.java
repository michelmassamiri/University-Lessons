package model;

public class HTMLStatment extends StringBuilder {
	public HTMLStatment() {
		str = new StringBuffer();
	}
	
	public void beginStatment() {
    	str.append("<html><body>");
	}
	
	public void addUserName(String userName, String message) {
		str.append("<H1>" + message + userName+ "<BR>");
	}
	
	public void addRentalStatment(String movieTitle, double pricing) {
		str.append("<EM>" + "<P>" + movieTitle +"\t"+ pricing + "</P>" + "<BR>");
	}
	
	public void addAmountOwned(double totalAmount, String message) {
		str.append("<P>" + message + totalAmount + "</P>" + "<BR>");
	}
	
	public void addFreqTotalPoints(double freqTotalPoints, String message) {
		str.append("<P>" + message + freqTotalPoints + " frequent renter points" + "</P>" + "<BR>");
	}
	
	public void endStatment() {
		str.append("</body></html>");
	}
	
	public String getResult() {
		return str.toString();
	}
}
