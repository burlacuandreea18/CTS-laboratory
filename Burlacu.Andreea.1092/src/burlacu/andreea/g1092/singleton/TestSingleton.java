package burlacu.andreea.g1092.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		//a Singleton cannot create multiple objects
		System.out.println("Start");
		//SharedPreferencesManagement sharedpref1= new SharedPreferencesManagement();
		//SharedPreferencesManagement sharedpref2= new SharedPreferencesManagement();
		
		SharedPreferencesManagement sharedpref1= SharedPreferencesManagement.getSharedPreferences();
		SharedPreferencesManagement sharedpref2= SharedPreferencesManagement.getSharedPreferences();
		SharedPreferencesManagement sharedpref3= SharedPreferencesManagement.getSharedPreferences();
		
		//showing it is the same object
		if(sharedpref1==sharedpref2)
		{
			System.out.println("They are referencing the same object");
		}
		
		SharedPreferencesManagement sharedpref4= SharedPreferencesManagement.getSharedPreferences("dark mode", 1000);
		if(sharedpref1==sharedpref4) {
			System.out.println("They are referencing the same object");
		}
		
		

	}

}
