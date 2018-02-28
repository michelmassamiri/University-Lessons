package model;

public interface StatmentBuilder {
	public void beginStatment();
	public void addUserName(String userName, String message);
	public void addRentalStatment(String movieTitle, double pricing);
	public void addAmountOwned(double totalAmount, String message);
	public void addFreqTotalPoints(double freqTotalPoints, String message);
	public void endStatment();
}