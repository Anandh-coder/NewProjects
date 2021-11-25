package secondHalfOOPS;

public interface InterfaceBase {
	//interface dont contain word called class
	int tax=50; // within interfaces, variables should be constants
				// we should initialize them with some value
	
	//private void clothing(); -- this gives compilation error as private methods cant be accessed by other classes
							// so u hv to concrete the method bt in interfaces we cant concrete the method we do only		
							// declarations.
	public void clothing();
	public void household();
	
	
	
	

}
