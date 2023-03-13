package trainReservation.entity;

// 비용 Entity class
public class Cost {
	private String departureStation;
	private String arrivalStation;
	private int amount;
	
	public Cost() {}
	
	public Cost(String departureStation, String arrivalStation, int amount ) {
		this.departureStation = departureStation;
		this.arrivalStation = arrivalStation;
		this.amount = amount;
	}
	
	public String getDepartureStation() {
	return this.departureStation;
	}

	public int getAmount() {
		return this.amount;
	}
	
	public String toString() {
		return "Cost [departureStation:" + this.departureStation + 
				", arrivalStation: " + this.arrivalStation + 
				",amount: " + this.amount+ "]";
	}

}
