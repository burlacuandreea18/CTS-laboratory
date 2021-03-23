package ro.ase.csie.cts.lab5.dp.singleton;

import java.net.Socket;

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
	//is using default/ app setting values
	public static DbConnection getDbConnection() {
		if(DbConnection.dbConnection==null) {
			//you can get detail from files etc
			dbConnection = new DbConnection();
		}
		
			return DbConnection.dbConnection;
	}
	
	public static DbConnection getDbConnection(
			String socket, String schema) {
		if(DbConnection.dbConnection == null) {
			dbConnection = new DbConnection(socket,schema);
		}
		//optional - throw an error if they try to open a connection to a db
				if(!socket.equals(dbConnection.socket) || 
						!schema.equals(dbConnection.schema))
					throw new UnsupportedOperationException();
			
		return DbConnection.dbConnection;
	}
}
