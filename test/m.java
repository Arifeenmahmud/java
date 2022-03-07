package test;

import java.util.Arrays;

public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {6,7,8,02,3,4,5};
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int[] array = { 3, 4,1, 2, 5};

        System.out.println("Arrays.toString "+(array.length));
        
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
        int[][] arrays = {{1, 2}, {3, 4}, {5, 6, 7}};

        System.out.println(Arrays.deepToString(arrays));
        

	}

}
