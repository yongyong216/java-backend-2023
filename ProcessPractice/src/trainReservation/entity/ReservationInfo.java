package trainReservation.entity;

import java.util.List;
import java.util.UUID;

// 예약번호
// 열차번호
// 좌석 번호 리스트
// 출발역
// 출발 시간
// 도착역
// 도착 시간
// 총 금액
public class ReservationInfo {
	
	private String reservationNumber;
	private String traniNumber;
	private List<String> seats;
	private String deapartureStation;
	private String deapartureTime;
	private String arrivalStation;
	private String arrivalTime;
	private int totalCost;
	
	public ReservationInfo() {}

	public ReservationInfo( String traniNumber, List<String> seats, String deapartureStation,
			String deapartureTime, String arrivalStation, String arrivalTime, int totalCost) {
		this.reservationNumber = UUID.randomUUID().toString();  //UUID는 난수 생성
		this.traniNumber = traniNumber;
		this.seats = seats;
		this.deapartureStation = deapartureStation;
		this.deapartureTime = deapartureTime;
		this.arrivalStation = arrivalStation;
		this.arrivalTime = arrivalTime;
		this.totalCost = totalCost;
	}
	// 생성이 되고 나고 setters안쓴다.
	
	public String getReservationNumber() {
		return reservationNumber;
	}

	public String getTraniNumber() {
		return traniNumber;
	}

	public List<String> getSeats() {
		return seats;
	}

	public String getDeapartureStation() {
		return deapartureStation;
	}

	public String getDeapartureTime() {
		return deapartureTime;
	}

	public String getArrivalStation() {
		return arrivalStation;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public int getTotalCost() {
		return totalCost;
	}

	@Override
	public String toString() {
		return "ReservationInfo [reservationNumber=" + reservationNumber + ", traniNumber=" + traniNumber + ", seats="
				+ seats + ", deapartureStation=" + deapartureStation + ", deapartureTime=" + deapartureTime
				+ ", arrivalStation=" + arrivalStation + ", arrivalTime=" + arrivalTime + ", totalCost=" + totalCost
				+ "]";
	}
	
}
