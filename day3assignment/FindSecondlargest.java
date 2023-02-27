package day3assignment;

import java.util.Arrays;

public class FindSecondlargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
Arrays.sort(data);
for (int i = 0; i < data.length; i++) {
	System.out.println(data[i]);

	
}
System.out.println(data[data.length-2]);


	}


}
