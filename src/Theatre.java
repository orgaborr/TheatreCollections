import java.util.ArrayList;

public class Theatre {
	private final String theatreName;
	private List<Seat> seats = new ArrayList<>();
	
	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		this.theatreName = theatreName;
		
		int lastRow = 'A' + (numRows-1);
		for(char row= 'A'; row <= lastRow; row++) {
			for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum)); //"%02d" makes it display 2 digits, i.e. 5 -> 05
				seats.add(seat);
			}
		}		
	}
	
	public String getTheatreName() {
		return theatreName;
	}
	
	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = null; //variable outside of the loop
		for(Seat seat : seats) { //goes through the seats in seats array list
			if(seat.getSeatNumber().equals(seatNumber)) { //there is a match, it stops to reserve the seat
				requestedSeat = seat;
				break;
			}
		}
		
		if(requestedSeat == null) { //if the loop above doesn't find the seat, it remains null
			System.out.println("There is no seat " + seatNumber);
		}
		
		return requestedSeat.reserve();
	}
}
