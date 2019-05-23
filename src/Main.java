import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("Szkéné", 8, 12);
		

		if(theatre.reserveSeat("D12")) {
			System.out.println("Please pay for D12");
		} else {
			System.out.println("Seat already reserved");
		}
		
		if(theatre.reserveSeat("D12")) {
			System.out.println("Please pay for D12");
		} else {
			System.out.println("Seat already reserved");
		}
		
		if(theatre.reserveSeat("B13")) {
			System.out.println("Please pay for B13");
		} else {
			System.out.println("Seat already reserved");
		}
		
		List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
		Collections.reverse(reverseSeats);
		printList(reverseSeats);
	}
	
	public static void printList(List<Theatre.Seat> list) { //shallow copy, refers to the same objects
		for(Theatre.Seat seat : list) {
			System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
		}
		System.out.println();
		System.out.println("========================================================");
	}
}
