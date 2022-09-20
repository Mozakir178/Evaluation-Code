package problem4;
import java.util.*;


public class Main {
	
public static Laptop getLaptop(String laptpPurpose) {
		
		
		if(laptpPurpose.equals("gaming")) {
			Laptop g = new Laptop() ;
			CPU c1 = new CPU() ;
			c1.setManufacturer("Radeon");
			c1.setProcessor("Ryzen 9 5800H");
			c1.setClockSpeed(3200.0);
			GraphicCard g1 = new GraphicCard() ;
			g1.setManufacturer("Intel");
			g1.setSeries("Iris Xe");
			g1.setCapacity("Integrated");
			
			g.setCpu(c1);
			g.setGraphicCard(g1);
			g.setName("Acer");
			g.setCompanyName("Radeon");
			g.setColor("Black");
			g.setPurpose(laptpPurpose);
			return g ;
		}
		else if(laptpPurpose.equals("business")) {
			Laptop g = new Laptop() ;
			CPU c1 = new CPU() ;
			c1.setManufacturer("Intel");
			c1.setProcessor("i5 10210U");
			c1.setClockSpeed( 1800.0);
			GraphicCard g1 = new GraphicCard() ;
			g1.setManufacturer("Radeon");
			g1.setSeries("RTX 3050 Ti");
			g1.setCapacity("16GB");
			
			g.setCpu(c1);
			g.setGraphicCard(g1);
			g.setName("Acer 13");
			g.setCompanyName("HP");
			g.setColor("Rose Gold");
			g.setPurpose(laptpPurpose);
			return g ;
		}
		
		else {
			return null ;
		}
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ;
	System.out.println("Question 4 answer");
	System.out.println("Enter purpuse of laptop");
	String purpose = sc.next() ;
	Laptop laptop = getLaptop(purpose) ;
//	System.out.println(laptop);
	if(laptop != null) {
		System.out.println("Laptop Details");
		System.out.println("================================\n");

		System.out.println("Laptop Name =>"+laptop.getName());
		System.out.println("Company name =>"+laptop.getCompanyName());
		System.out.println("Laptop Color =>"+laptop.getColor());
		System.out.println("Laptop Purpose =>"+laptop.getPurpose());
		System.out.println("Cpu's Manufacturer =>"+laptop.getCpu().getManufacturer());
		System.out.println("Cpu's Processor =>"+laptop.getCpu().getProcessor());
		System.out.println("Cpu's ClockSpeed =>"+laptop.getCpu().getClockSpeed());
		System.out.println("Graphic card's Manufacturer"+laptop.getGraphicCard().getManufacturer());
		System.out.println("Graphic card's Series =>"+laptop.getGraphicCard().getSeries());
		System.out.println("Graphic card's Capacity =>"+laptop.getGraphicCard().getCapacity());
		
	}
	else {
		System.out.println("Please Enter a valid purpose");
	}
}

}
