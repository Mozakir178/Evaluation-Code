package problem3;

public class Ticket {
	int ticketid;
	int price ;
	static int availableTickets ;
	
	public int calculateTicketCost(int noOfTickets) {
		if(availableTickets< noOfTickets || availableTickets <= 0) {
			return -1 ;
		}
		else {
			availableTickets = availableTickets - noOfTickets ;
			int totalAmount = price * noOfTickets ;
			return totalAmount ;
		}
	}
}
