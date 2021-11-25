package equalsAndComparators;

public class Student {
	
	String name;
	int roll;
	String grp;
	
	public Student(String cname, int no, String dept){
		name = cname;
		roll = no;
		grp = dept;
	}
	
	/*
	 * public String toString() { return("Hey "+name+" with"+roll+" in grp of"+grp);
	 * }
	 */
	public boolean equals(Object obj) {
		if(this == obj) { // this checks whether the both objects memory location is same or not if same u get true
			System.out.println(this);
			System.out.println(obj);
			return true;
		}
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		Student foreignroll = (Student)obj;// casting the obj to student class so that u can get the roll property of foreign obj
		return (foreignroll.roll == this.roll);
	}

	public int hashcode() {
		return this.roll;
	}
	

}
