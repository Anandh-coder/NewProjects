package practiceStuffs;
import java.util.*;

public class Interview {
	
	/*
	 * int a ; public Interview() { System.out.println(a); }
	 */
	
	public static void main(String[] args) {
		int a[] = {0,1,2};
		int b[] = {4,2,0};
		System.out.println(a==b);
		a=b;
		b=a;
		System.out.println(b==a);
		
		
		
		// TODO Auto-generated method stub
		//int arr1[] = {1,2};
		//int arr2[] = {1,2};
		//if (arr1 == arr2)
			//System.out.println("True");
		//int arr[] = {2,4,6,8};
		//for(int i:arr) {System.out.println(i);}
		//String arr[] = new String[4];
		//arr[1] = "java";
		//arr[2] = "C";
		//arr[3] = "Python";
		//for(String Arrays:arr) {
			//System.out.println(Arrays);
		//String[] arr = {"c++","c","Java","Python"};
		//for (int i= 0; i<arr.length;i++) {
		//	System.out.println(arr[i]+" ");
		//	if (arr[i].equals("Java"))
		//		continue;
		//	System.out.println("object");
		//	break;
		//boolean var1 = (boolean)0;
		//boolean var2 = (boolean)1;
		//if(0)
		//	System.out.println("hi");
		int arr [] = new int[5];
		for (int i = 5; i>0;i--)
			arr[5-i] = i;
		Arrays.fill(arr,1,4,8);
		for (int i =0; i<5;i++)
			System.out.println(arr[i]);
		
		

	}

}
