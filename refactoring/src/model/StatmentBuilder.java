package model;

public interface StatmentBuilder {
	public void buildStatment();
	public void addUserName(String userName);
	public void addRentalStatment(String movieTitle, double pricing);
	public void addAmountOwned(double totalAmount);
	public void addFreqTotalPoints(double freqTotalPoints);
	public void finishStatment();
}