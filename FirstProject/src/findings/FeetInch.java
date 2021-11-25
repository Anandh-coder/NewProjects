package findings;

public class FeetInch {
	
	public FeetInch(int size, int[] inches) {
		int feet = 0;
		for(int i=0 ; i<size ; i++) {
			if (inches[i] > 11 & inches[i] < 20) {
				feet = feet+1 ;
			}else if(inches[i] > 20 & inches[i] < 30){
				feet = feet+2 ;
			}
		}
		System.out.println("Total feet is " +feet);
	}

	public static void main(String[] args) {
		int values[] = {11,18,27,12,14};
		int length = values.length;
		new FeetInch(length, values);
	}

}
