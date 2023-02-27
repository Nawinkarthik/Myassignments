package day3assignment;

import java.util.Iterator;

public class FindIntersection {
	public static void main(String[] args) {
		int first[]= {3,2,11,4,6,7};
		int second[]= {1,2,8,4,9,7};
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < second.length; j++) {
				if (first[i]==second[j]) {
					System.out.println(first[i]);
					
				}
				
			}
		}

	}

}
