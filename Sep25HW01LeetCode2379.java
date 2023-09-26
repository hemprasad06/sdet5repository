package testleaf;

import org.junit.Assert;
import org.junit.Test;

public class Sep25HW01LeetCode2379_SlidingWindow {
	/*
	 * TestData, input : s= "WBBWWBBWBW", k=7, o/p = 7;
	 * TestData, input : s= "WBWBBBW", k=2, o/p = 0;
	 * TestData, input : s= "BBBBBBB", k=5, o/p = 0;
	 * TestData, input : s= "WBWBBBW", k=2, o/p =0 ;
	 * TestData, input : s= "B", k=2, o/p =0 ;
	 * TestData, input : s= "W", k=2, o/p =0 ;
	 * Pseudocode
	 * **********
	 * A) if the length of string is equal to 1, return 0
	 * B)	Else if traverse the string in to the for loop, check if the index and index+1 is equal to B then 
	 * 		increment counter
	 * C)		while counter+1=k, return 0
	 * D)			Else, traverse the string into the for loop, till length k-1, 
	 * D)			While char at index is not equal to B then increment the counter, return the counter. 
	 */
	@Test
	public void test1()
	{
		Assert.assertEquals(3,isBlackBlockConsecutive("WBBWWBBWBW",7) );
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0,isBlackBlockConsecutive("WBWBBBW",2) );
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0,isBlackBlockConsecutive("B",1) );
		
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(1,isBlackBlockConsecutive("W",1) );
		
	}
	public int isBlackBlockConsecutive(String blocks, int k) {
		  {
	  int minCount = Integer.MAX_VALUE;
	  int wCount =0,start =0, end = k-1;
	  
	  while(end<blocks.length())
	  {
		  wCount =0;
		  for (int i = start;  i <= end; i++) {
			  
			  if(blocks.charAt(i)=='W')
			  {
				  wCount++;
			  }
			  
		    }
		  minCount= Math.min(minCount, wCount);
		  start++;
		  end++;
	  }
	   
	  
	  return minCount;
        
    }
	
}
