package testleaf;

import org.junit.Test;
import org.testng.Assert;

public class Sep18HW_2Pointers_LeetCode906 {
	/*Pseudocode
input is an integer array
output (returning) is also an integer array
	declare an int start as zero and an end as the array.length-1
		loop begins while the 'start' is lesser than 'end'
 			if the index(start) is odd and index(end) is even, then we swap using the temp variable and we increment the start++
 				else if index(start) is odd and also the index(end) is also odd then we decrement the end--.
 					else we increment start++ so that the next value is compared with the respective start++.
	return the resulting array
*/
@Test
public void test1() {
	int[] input = {1,3,2,4,5,6,7,8,9,11,12}; 
	int[] actualResult = arryByParity(input);
	//Object[] actualResult1 = actualResult.toArray();
	//List<Integer> actualResult = arryByParity(input);
	int[] expected = {12,8,2,4,6,5,7,3,9,11,1};
	Assert.assertEquals(actualResult,expected);
	}
@Test
public void test2() {
	int[] input = {1,3,2,4,0,5,6,7,8,9,11,12};
	int[] actualResult = arryByParity(input);
	//Object[] actualResult1 = actualResult.toArray();
	int[] expected = {12,8,2,4,0,6,5,7,3,9,11,1};
	Assert.assertEquals(actualResult,expected);
	}
@Test
public void test3() {
	int[] input = {0,0,0,0};
	int[] actualResult = arryByParity(input);
	//Object[] actualResult1 = actualResult.toArray();
	int[] expected = {0,0,0,0};
	Assert.assertEquals(actualResult,expected);
	}
@Test
public void test4() {
	int[] input = {12,8,2,4,0,6,5,7,3,9,11,1};
	int[] actualResult = arryByParity(input);
	//Object[] actualResult1 = actualResult.toArray();
	int[] expected = {12,8,2,4,0,6,5,7,3,9,11,1};
	Assert.assertEquals(actualResult,expected);
	}

	public int[] arryByParity(int[] input) {
	int start = 0;
	int end = input.length-1;
	int temp = 0;
	while(start<end) {
		if(input[start]%2!=0&&input[end]%2==0)
		{
			temp = input[start];
			input[start] = input[end];
			input[end]=temp;
			start++;
		}
		else if(input[start]%2!=0&&input[end]%2!=0)
		{
			end--;
		}
		else start++;
	}
		return input;		
	}
		
}

