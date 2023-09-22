package testleaf;

import org.junit.Test;
import org.testng.Assert;

public class Sep22_KishoreHW_LeetCode392 {
	/*
	 * TestData - input : subString = "abc", inputString = "ahbgdc"; o/p : true
	 * TestData - input : subString = "abc", inputString = "abc"; o/p : true
	 * TestData - input : subString = "fab", inputString = "aabbccaaaa"; o/p : false
	 * TestData - input : subString = "d", inputString = "aabbccaaaa"; o/p : false
	 * TestData - input : subString = "a", inputString = "aabbccaaaa"; o/p : true
	 * TestData - input : subString = "ahbgdcahbgdc", inputString = "ahbgdc"; o/p : false
	 * ***********
	 * Pseudocode*
	 * ***********
	 * input is couple of string, output is boolean
	 * if the subString.length>=inputString.length, return false
	 * initiate sPointer = 0; tPointer=0;
	 * else, while the sPointer<=s.length()-1
	 * if(s.charAt(sPointer)==t.charAt(tPointer)) then sPointer++, tPointer++
	 * 		else, tPointer++
	 * if sPointer<=s.length()-1, return false, else return true
	 */
	@Test
	public void test1() {
		boolean actualResult = validSubstring("abc", "ahbgdc");
		Assert.assertEquals(actualResult , true);
	}
	@Test
	public void test2() {
		boolean actualResult = validSubstring("abc", "abc");
		Assert.assertEquals(actualResult , true);
	}
	@Test
	public void test3() {
		boolean actualResult = validSubstring("fab", "aabbccaaaa");
		Assert.assertEquals(actualResult , false);
	}
	@Test
	public void test4() {
		boolean actualResult = validSubstring("f", "ahbgdc");
		Assert.assertEquals(actualResult , false);
	}
	@Test
	public void test5() {
		boolean actualResult = validSubstring("a", "ahbgdc");
		Assert.assertEquals(actualResult , true);
	}
	
	public boolean validSubstring(String s, String t) {
		int sPointer = 0, tPointer = 0;
		while (sPointer<=s.length()-1&&tPointer<=t.length()-1) {
			if(s.charAt(sPointer)==t.charAt(tPointer)) {
				sPointer++;
				tPointer++;
			}
			else tPointer++;
			}
		if(sPointer<=s.length()-1) {
			return false;
		}
		else return true;
		}
	}

