package burlacu.andreea.g1092.prototype;

import java.sql.BatchUpdateException;

import burlacu.andreea.g1092.builder.Bus;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		BusModel bus1 = new  BusModel("BR 10 FRX", 30);
		
		BusModel bus2 =(BusModel) bus1.clone();
		BusModel bus3 =(BusModel) bus1.clone();
		BusModel bus4 =(BusModel) bus1.clone();
		
		}

}
