package model;

public abstract class StringBuilder implements StatmentBuilder {
	protected StringBuffer str;
	
	public void beginStatment() {
		str.append("");
	}
	
	public void endStatment() {
		str.append("");
	}
	
	public abstract void addUserName(String userName, String message);
	public abstract void addRentalStatment(String movieTitle, double pricing);
	public abstract void addAmountOwned(double totalAmount, String message);
	public abstract void addFreqTotalPoints(double freqTotalPoints, String message);
}
