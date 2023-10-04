
package testleaf;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Sep18HW_ParityCheck {
	/*Pseudocode
input is an integer array
output (returning) is also an integer array
	if the array.length is <=1, return the array
		else, declare an ArrayList named resultArray, 
			traverse through the array via **for loop**,
			if Array[i]%2=0 then add the array[i] to the resultArray
			traverse through the array again via **for loop**
			if Array[i]%2!=0 then add the array[i] to the resultArray
	return the resulting array
*/
@Test
public void test1() {
	int[] input = {1,3,2,4,5,6,7,8,9,11,12};
	
	List<Integer> actualResult = arryByParity(input);
	Object[] actualResult1 = actualResult.toArray();
	//List<Integer> actualResult = arryByParity(input);
	int[] expected = {2, 4, 6, 8, 12, 1, 3, 5, 7, 9, 11};
	Assert.assertEquals(actualResult1,expected);
	}
@Test
public void test2() {
	int[] input = {1,3,2,4,0,5,6,7,8,9,11,12};
	List<Integer> actualResult = arryByParity(input);
	Object[] actualResult1 = actualResult.toArray();
	int[] expected = {2,4,0,6,8,12,1,3,5,7,9,11};
	Assert.assertEquals(actualResult1,expected);
	}
@Test
public void test3() {
	int[] input = {0,0,0,0};
	List<Integer> actualResult = arryByParity(input);
	Object[] actualResult1 = actualResult.toArray();
	int[] expected = {0,0,0,0};
	Assert.assertEquals(actualResult1,expected);
	}

	public List<Integer> arryByParity(int[] input) {
		List<Integer> resultArray = new ArrayList<Integer>();
		if(input.length==1) {
			resultArray.add(input[0]);
			return resultArray;
		}
			else
			{
				for(int i=0; i<=input.length-1;i++)
				{
					if (input[i]%2==0) {
						resultArray.add(input[i]);
					}
			}
				for(int j=0; j<=input.length-1;j++)	
				{
					{
						if (input[j]%2!=0) {
							resultArray.add(input[j]);
						}
					}
				}
			return resultArray;
				
			}
		}
	}