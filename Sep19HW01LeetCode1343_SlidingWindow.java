package testleaf;

import org.junit.Test;
import org.testng.Assert;

public class Sep19HW01LeetCode1343_SlidingWindow {
	/*
	 * Test Data 01 - input : [2,2,2,2,5,5,5,8], k=3, t=4;
	 * Test Data 01 - input : [11,13,17,23,29,31,7,5,2,3], k=3, t=5;
	 * Test Data 01 - input : [0,1,0,1,0,1,0,1,0], k=2, t=5;   
	 * Pseudocode
	 * A) iterate the input array with window size k-1
	 * B) add up the window array and increment the flag if the sum is greater than or equal to the threshold value
	 * C) iterate through another for loop  with for loop length-k
	 * D) calculate the sum as char[i+1]+char[i+2]+char[i]+3
	 * E) if the sum is greater than equal to threshold, increment flag
	 * F) return flag
	 */
	@Test
	public void test1() {
		int[] input = {2,2,2,2,5,5,5,8};
		int actual = solution(input, 3, 4);
		Assert.assertEquals(actual, 3);
	}
public int solution(int[] input, int k, int t) {
	int flag=0, sum = 0, average;
	for(int i=0;i<k;i++) {
		sum+= input[i];
	}
	average=sum/k;
			if (average>=t){
			flag++;
		}
			//sliding window
			int start, end=k;
		for(start = 1;start<=input.length-k;start++) {
			average = (average*k-(input[start-1]+input[end]))/k;
		if (average>=t){
				flag++;
			}
			}
			return flag;
}

}
