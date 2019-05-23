import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("Szkéné", 8, 12);
		List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//		printList(theatre.seats);
		printList(seatCopy);
		
		seatCopy.get(1).reserve();
		if(theatre.reserveSeat("A02")) {
			System.out.println("Please pay for A02");
		} else {
			System.out.println("Seat already reserved");
		}

	}
	
	public static void printList(List<Theatre.Seat> list) { //shallow copy, refers to the same objects
		for(Theatre.Seat seat : list) {
			System.out.print(" " + seat.getSeatNumber());
		}
		System.out.println();
		System.out.println("========================================================");
	}

}
