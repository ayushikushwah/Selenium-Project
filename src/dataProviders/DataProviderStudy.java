package dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviderStudy {
	// firstly we have to create parameterized method in test class and then we have
	// to use
	// dataProvider and keyword and its class path
	// dataProvider ---> it is always normal java class and not test class and 
	// we use dataProvider keyword in test class because dataProvider is not
	// present in the same class , so we have to get it from another class

	@DataProvider(name = "Teaching staff")
	public String[][] test() {
		String ar[][] = { { "Ayushi", "Kushawah", "2763897162" }, { "Prajwal", "Patil", "3868016302" },
				{ "Rupali", "Wasekar", "8326462889" } };
		return ar;
	}

	@DataProvider(name = "Students")
	public String[][] test1() {
		String data[][] = { { "divya", "nene", "736498776789" }, { "prachi", "jadhav", "423897643789" },
				{ "abc", "jain", "6287364823187" } };
		return data;
	}

}
