package ro.ase.csie.cts.lab5.dp.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		//a singleton can\t create multiple obj; that s how you test if it s a singleton or not
		System.out.println("Start");
		//DbConnection con1= new DbConnection();
		//DbConnection con2= new DbConnection();

		DbConnection con1=DbConnection.getDbConnection();
		DbConnection con2=DbConnection.getDbConnection();
		DbConnection con3=DbConnection.getDbConnection();
		
		//showing it the same obj
		if(con1==con2) {
			System.out.println("They are referencing the same object");
	}
	
	DbConnection con4 = DbConnection.getDbConnection("10.0.0.1:3306", "ctsDB");
	
	if(con1==con4) {
		System.out.println("They are referencing the same object");
	}
	
	//you still get the same collection
	DbConnection con5 = DbConnection.getDbConnection("10.0.0.1:3306", "ctsDB_proud");
	
	}

}
