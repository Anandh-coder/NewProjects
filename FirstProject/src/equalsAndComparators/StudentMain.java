package equalsAndComparators;

public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student("Thara", 17, "Bsc");
		Student std2 = new Student("Thara", 19, "Bsc");
		
		System.out.println(std.equals(std2));
		// we r expecting the sop would display true as both the objects got same set of data bt it displayed false as it
		// checking the equality on references as std and std2 memory locations r different its showing false
		System.out.println(std.equals(std));
		// after overriding method equals, u would get memory locations in the console
		
		

	}

}
