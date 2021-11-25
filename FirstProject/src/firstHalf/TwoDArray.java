package firstHalf;

public class TwoDArray {

	public static void main(String[] args) {
		
		int[][] sun = {{2 , 6, 3},{5, 9, 7},{1, 2, 3}};
		// each set is equal to one row
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(sun[i][j]+" ");
			}
			System.out.println();
		}
		
		String[] items = {"camera", "sandals", "clocks"};
		for(int i=0 ; i<items.length ; i++) {
			if(items[i].equalsIgnoreCase("sandals")) {
				System.out.println("not a right place");
			}else {
				System.out.println("On it!");
			}
		}
		
		String word = "Tomato";
		int size = word.length();
		for(int i= size;i>0;i--) {
			System.out.print(word.charAt(i-1));// i-1 bcoz though length is 6 still the last index is 5
		}
		
	}

}
