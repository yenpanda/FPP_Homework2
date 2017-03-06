/*RESULT:
 * Found! The position of 80 is: 7
 */
package Recursive;

import java.util.Arrays;

public class Prog3 {

	public static int binarySearchRecur(int array[], int num, int start, int end){
		if(end < start)
			return -1;
        int mid = (int)(start + end)/2;
        
        if (array[mid] < num)
  	      return binarySearchRecur(array, num, mid + 1, end);
  	    else if (array[mid] > num)
  	      return binarySearchRecur(array, num, start, mid - 1);
  	    else
  	      return mid;
	}
	
	public static void main(String arg[]){
		int array[] = {1,3,5,7,9,15,60,80,100};
		int num = 80;
		int find = binarySearchRecur(array, num,0,array.length -1);
		if(find > -1)
			System.out.println("Found! The position of " + num + " is: " + find );
		else
			System.out.println("Not Found");			
	}
}
