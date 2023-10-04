package testleaf;

import org.junit.Test;
import org.testng.Assert;

public class Oct03CW01LeetCode1512_2Pointers {
	
	@Test
	public void test1() {
		int[] input = {1,2,3,1,1,3};
		Assert.assertEquals(numIdenticalPairs(input), 4);
	}
	
    public int numIdenticalPairs(int[] nums) {
    	int output = 0;
        for(int i=0; i<=nums.length-1;i++)
        {
        	for( int j = i; j<=nums.length-1;j++)
        	{
        		if(nums[i]==nums[j]&&i<j)
        		{
        			output ++;
        		}
        	}
        
        }
        return output;
    }
}
