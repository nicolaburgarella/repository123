package main;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class RemoveZerosFromIntArray.
 */
public class RemoveZerosFromIntArray {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int[] arr = new int[]{0,1,1,0,2,1};
		    int[] nonZeroArr = arr;

		    Arrays.sort(nonZeroArr);
		    int index = -1;
		    while((index = Arrays.binarySearch(nonZeroArr, 0)) > -1){
		        int[] newArr = new int[nonZeroArr.length-index-1];
		        System.arraycopy(nonZeroArr, index+1, newArr, 0, newArr.length);
		        nonZeroArr = newArr;
		    }
		    for (int d : arr) {
		        System.out.print(d +",");
		    }
		    System.out.println();
		    for (int d : nonZeroArr) {
		        System.out.print(d + ",");
		    }
		}


	}

