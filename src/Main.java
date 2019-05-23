import java.util.ArrayList;
import java.util.Collections;
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

		Collections.shuffle(seatCopy); //can also try .reverse
		System.out.println("Printing seatCopy");
		printList(seatCopy);
		System.out.println("Printing theatre.seats");
		printList(theatre.seats);
		
		Theatre.Seat minSeat = Collections.min(seatCopy);
		Theatre.Seat maxSeat = Collections.max(seatCopy);
		System.out.println("Min seat number is " + minSeat.getSeatNumber());
		System.out.println("Max seat number is " + maxSeat.getSeatNumber());
	}
	
	public static void printList(List<Theatre.Seat> list) { //shallow copy, refers to the same objects
		for(Theatre.Seat seat : list) {
			System.out.print(" " + seat.getSeatNumber());
		}
		System.out.println();
		System.out.println("========================================================");
	}
	
	public static void sortList(List<? extends Theatre.Seat> list) { //bubble search
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) { //j=i+1 means with each loop it searches through less
				if(list.get(i).compareTo(list.get(j)) > 0) {
					Collections.swap(list, i, j); //add the list and the elements we want to swap
				}
			}
		}
	}

}
