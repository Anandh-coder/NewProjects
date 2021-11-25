package leftOverOOPSconcepts;

public class ChildStaticKeyword extends StaticKeyword{
	
	public ChildStaticKeyword(String name, String group, int score) {
		marks = score;
		dept = group;
		//college = "hcl";
	}
	
	public void declaration() {
		if(marks >0 && marks <=300) {
			System.out.println("Result = First Class");
		}else {
			System.out.println("Result = Top");
		}
	}
	
	public String toString() {
		StaticKeyword.clg(); // we cannot simply call static method[clg] we hv to use class name.method name
		this.report();
		this.declaration();	
		System.out.println("---- Andhra University ----");
		return("so far no of students "+StaticKeyword.count());
		
	}

}
