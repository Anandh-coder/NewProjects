package findings;

public class HighSmallDiff {
	
	public HighSmallDiff(int size, int[] numbers) {
		int high =0;
		int small =0;
		for(int i=0; i<size; i++) {
			
				if(numbers[i] > high) {
					high = numbers[i];					
				}else if(numbers[i] < small){
					small = numbers[i];
				}
		}
		int diff = high - small;
		System.out.print("difference is "+diff);
	}

	public static void main(String[] args) {
		int values[] = {20, 15, 6, 11, 25};
		int length = values.length;
		new HighSmallDiff(length, values);

	}

}
