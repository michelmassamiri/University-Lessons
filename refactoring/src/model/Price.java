package model;

public interface Price extends Cloneable{
	public double price(int daysRented);
	public Object clone();
}
