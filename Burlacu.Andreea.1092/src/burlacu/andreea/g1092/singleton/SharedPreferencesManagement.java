package burlacu.andreea.g1092.singleton;

public class SharedPreferencesManagement {
	String settings;
	int mode;
	
	//Version 1 - eager approach - instantiate singleton object
	//private static  SharedPreferencesManagement sharedPreferences = new SharedPreferencesManagement();
	private static  SharedPreferencesManagement sharedPreferences = null;
	
	//Version 2 - lazy approach 
	//class static initializer
	//uses the class lazy-loading approach
	static {
		//executed only once when the class is loaded by the JVM
				System.out.println("Loading SharePreference");
	}
	
	//constr initializer
	{
		System.out.println("Init preffered settings");
	}
	
	private SharedPreferencesManagement() {
		System.out.println("Handling all the preference settings");
		
		//accessing all preference files 
	}

	private SharedPreferencesManagement(String settings, int mode) {
		this.settings=settings;
		this.mode=mode;
	}
	
	public static SharedPreferencesManagement getSharedPreferences()
							 {
		if(SharedPreferencesManagement.sharedPreferences==null) {
			sharedPreferences = new SharedPreferencesManagement();
		}
		return SharedPreferencesManagement.sharedPreferences;
	}
	
	public static SharedPreferencesManagement getSharedPreferences
								(String settings, int mode) {
		if(SharedPreferencesManagement.sharedPreferences==null) {
			sharedPreferences = new SharedPreferencesManagement(settings, mode);
		}
			if(!settings.equals(sharedPreferences.settings))
				throw new UnsupportedOperationException();
		return SharedPreferencesManagement.sharedPreferences;
					
	}
	
}
