package problem3;
import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ;
	System.out.println("Qusetion number 2's Answer");
	
	System.out.println("Enter no of bookings: ");
	int tic = sc.nextInt() ;
	System.out.println();
	System.out.println("Enter the available tickets : ");
	int avai = sc.nextInt() ;
	System.out.println();
	
	for(int i=0;i<tic;i++) {
		Ticket t1 = new Ticket() ;
		System.out.println();
		System.out.println("Enter the ticketid: ");
		int id = sc.nextInt() ;
		System.out.println("Enter the price: ");
		int pri = sc.nextInt() ;
		System.out.println("Enter the no of tickets: ");
		int numtic = sc.nextInt() ;
		t1.ticketid = id ;
		t1.price = pri ;
		Ticket.availableTickets = avai ;
		System.out.println("Available tickets : "+avai);
		System.out.println("Total amount: "+t1.calculateTicketCost(numtic));
		if(avai >= numtic) {
			avai = avai-numtic ;
		}
		System.out.println("Available ticket after booking:"+avai);
		
		
	}
	
	
}
}
