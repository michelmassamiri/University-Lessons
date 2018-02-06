package model;

public class DefaultPrice implements Price {
	private double _dayFees;
	private int _dayLimits;
	private double _fees;
	
	public DefaultPrice(double dayFees, int dayLimits, double fees) {
		_dayFees = dayFees;
		_dayLimits = dayLimits;
		_fees = fees;
	}
	
	@Override
	public Object clone() {
	  Object defaultPrice = null ;

      try {
          defaultPrice = super.clone();
      }

      catch(CloneNotSupportedException e) {
              e.printStackTrace();
      }

      return defaultPrice ;
	}
	
	public double get_dayFees() {
		return _dayFees;
	}

	public void set_dayFees(double _dayFees) {
		this._dayFees = _dayFees;
	}

	public int get_dayLimits() {
		return _dayLimits;
	}

	public void set_dayLimits(int _dayLimits) {
		this._dayLimits = _dayLimits;
	}

	public double get_fees() {
		return _fees;
	}

	public void set_fees(double _fees) {
		this._fees = _fees;
	}

	public double price(int daysRented) {
		double thisAmount = 0 ;
		//New_RELASE has daysLimit = 0, fees = 0, dayFees = 3
		//CHILDREN has daysLimit = 3, fees = 1.5, dayFees = 1.5
		//REGULAR has daysLimit = 2, fees = 2, dayFees = 1.5
		thisAmount += _fees; 
		if(daysRented > _dayLimits) {
			thisAmount += (daysRented - _dayLimits) * _dayFees;
		}
		
		return thisAmount;
	}
	
}
