package findings;

public class DiffOddandEven {
	
	
	public DiffOddandEven(int size, int[] numbers){
		int even = 0;
		int odd = 0;
		for(int i=0 ; i<size ; i++) {
			if(numbers[i]%2 == 0) {
				even = even + numbers[i];
			}else {
				odd = odd + numbers[i];
			}
		}
		int dif = even - odd;
		System.out.println("sum of even is "+ even);
		System.out.println("sum of odd is "+odd);
		System.out.println("Difference is "+ dif);
	}

	public static void main(String[] args) {
		int values[] = {12,15,19,26,86};
		int length = values.length;
		new DiffOddandEven(length, values);		
		
	}

}
