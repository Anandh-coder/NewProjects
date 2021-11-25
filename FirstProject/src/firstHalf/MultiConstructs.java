package firstHalf;

public class MultiConstructs {
	
	String typeoffood;
	int tiffin;
	float snack;
	int Bevarage;
		
	public MultiConstructs(String food, int idly, int maaja) {
		typeoffood = food;
		tiffin = idly;
		Bevarage = maaja;
		snack = 5;
	}
	
	public MultiConstructs(String food, float sambar) {
		typeoffood = food;
		snack = sambar;	
		tiffin = 40; // its costant for him
		Bevarage = 5;
	}
	
	public MultiConstructs(String food) {
		typeoffood = food;
		snack = 20;	
		tiffin = 10; // its costant for him
		Bevarage = 90; // always constant
	} 
	
	public MultiConstructs() {
		typeoffood = "Supper";
		snack = (float) 20.25;	
		tiffin = 10; // its costant for him
		Bevarage = 90; // always constant
	} 
	float payment() {
		return tiffin*snack*Bevarage;
	}

	public static void main(String[] args) {
		MultiConstructs youngman = new MultiConstructs("breakfast", 30, 25);
		System.out.println("yound man eats better"+youngman.payment());
		MultiConstructs oldman = new MultiConstructs("lunch", (float) 40.6);
		System.out.println("old man have light food"+oldman.payment());
		MultiConstructs adult = new MultiConstructs("brunch");
		System.out.println("adult is gud enough at food"+adult.payment());
		MultiConstructs child = new MultiConstructs();
		System.out.println("child: "+child.payment());// if thr is no constructor as line 29 to 33
													// then java uses its default constructor and so it wont throw any error and takes data type default values which r zero
		

	}

}
