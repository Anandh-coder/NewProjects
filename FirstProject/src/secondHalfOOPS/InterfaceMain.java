package secondHalfOOPS;

public class InterfaceMain {

	public static void main(String[] args) {
		
		ChildofInterface emp = new ChildofInterface("Employee", 10, 15);
		ChildofInterface ven = new ChildofInterface("Vendor", 20, 5);
		InhertingClassAndInterface e1 = new InhertingClassAndInterface("Employee", 10, 15);
		ClasswithMultiInterf v1 = new ClasswithMultiInterf("Enterprenuer", 20, 20);
		emp.clothing();
		emp.household();
		ven.clothing();
		ven.household();
		e1.clothing();
		e1.household();	
		v1.clothing();
		v1.household();
		System.out.println(emp.toString());
		System.out.println(ven.toString());
		System.out.println(e1.toString());
		e1.extra(); // coming from Carrage bag class as InhertingClassAndInterface inherites Carragebag class
		System.out.println(v1.toString());
		v1.Discountonprice();
		v1.extra();
		
		
	}

}
