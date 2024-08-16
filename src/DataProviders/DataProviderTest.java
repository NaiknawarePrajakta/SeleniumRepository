package DataProviders;

import org.testng.annotations.DataProvider;

public class DataProviderTest 
{
	@DataProvider(name = "teacher")
	public String[][] myData() {
		String data[][] = { { "Yogendra", "Joshi", "9421357890" }, 
				             { "Mangesh", "Reddy", "9999999999" },

		                      { "Akash", "Patil", "1234567890" } };

		       return data;
		       }
	
	    @DataProvider(name = "student")
	    public String[][] myData1() {
		  String data[][] = { { "Prajakta", "Dhokale", "7875289759" },
				             { "Kiran", "Dhokale", "8888846770" },

		                      { "Pramod", "Jadhav", "9777347877" } };

		return data;
		}

}
