package burlacu.andreea.g1092.prototype;

import java.util.ArrayList;
import java.util.Random;

public class BusModel implements Cloneable{
	
	String licensePlate;
	int maxNoOfPassangers;
	ArrayList<String> stations =null;
	
	public BusModel(String licensePlates, int maxPass) {
		System.out.println("Loading the bus info...");
		this.stations=new ArrayList<String>();
		//Random random = new Random();
		//for(int i= 0;i<15;i++) {
		//	this.stations.add(random.nextInt(1000)); //////////!!!!AICI SIGUR NU E BINE
		//}
		
		this.licensePlate=licensePlates;
		this.maxNoOfPassangers=maxPass;
	}
	
	private BusModel() {
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		BusModel copy = new BusModel();
		copy.licensePlate=this.licensePlate;
		copy.maxNoOfPassangers=this.maxNoOfPassangers;
		copy.stations = (ArrayList<String>)this.stations.clone();
		
		return copy;
	}
	
	
}
