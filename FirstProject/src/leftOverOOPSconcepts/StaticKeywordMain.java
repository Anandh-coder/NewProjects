package leftOverOOPSconcepts;

public class StaticKeywordMain {

	public static void main(String[] args) {
		
		ChildStaticKeyword csk = new ChildStaticKeyword("Priyanka", "Bsc", 400);
		ChildStaticKeyword csk2 = new ChildStaticKeyword("Mounika", "Mscs", 250);
		System.out.println(csk.toString());
		System.out.println(csk2.toString());
		// csk.count(); not recommended as u hv to call static method using its class
		 

	}

}
