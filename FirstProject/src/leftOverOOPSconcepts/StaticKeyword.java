package leftOverOOPSconcepts;

public class StaticKeyword {
	
	static String college="St.Anns College for women";
	// as this college value is common for all instances, if we use static keyword it wont get initialize everytime,
	// memory optimazation, it stays same and gets u the value for no of obj instances created.
	int marks;
	String dept;
	static int sofarStudentsCount = 0;
	
	void report() {
		System.out.println("Hello! Here is your report");
	}
	
	static void clg() {
		System.out.println("****  "+college+"  ****");
		// static method can only b able to acess static variables.
	}
	
	static int count() {
		return sofarStudentsCount = sofarStudentsCount+1 ;
	}
	

}
