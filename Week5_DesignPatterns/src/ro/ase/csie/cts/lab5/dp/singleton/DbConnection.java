package ro.ase.csie.cts.lab5.dp.singleton;

public class DbConnection {
	String socket;
	String schema;
	
	
	//VERSION 1 - eager approach
	//private static DbConnection dbConnection=new DbConnection();
	private static DbConnection dbConnection = null;
	
	//VERSION 2 -lazy approach
	//class static initializer
	//uses the class lazy-loading approach
	static {
		//executed only once when the class is loaded by the JVM
		System.out.println("Loading database connection string");
	}
	
	//constr initializer
	{
		//executed before each constructor cal
		System.out.println("Init connection string");

	}
	
	private DbConnection() {
		System.out.println("Creating a DB connection");
		
		//access a local settings file to get credentials and connection string
		
	}

	private DbConnection(String socket, String schema) {
		this.socket = socket;
		this.schema = schema;
	}
	
	//the method used to return the reference to the unique obj
	public static DbConnection getDbConnection() {
		if(DbConnection.dbConnection==null) {
			//you can get detail from files etc
			dbConnection = new DbConnection();
		}
		return DbConnection.dbConnection;
	}
}
