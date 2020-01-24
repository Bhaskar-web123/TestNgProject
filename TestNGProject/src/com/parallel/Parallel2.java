package com.parallel;

import org.testng.annotations.Test;

public class Parallel2
{

	public class groups
	{
		@Test(groups = { "regression"})
		 public void testMethod1() {
		 System.out.println("second regression testing");
		 }
		 @Test(groups = { "regression"})
		 public void testMethod2() {
		 System.out.println("third smoke testing");
		 }
		 @Test(groups = { "smoke"})
		 public void testMethod3() {
		 System.out.println("fourth regression testing");
		 }
		 @Test(groups = { "regression"})
		 public void testMethod4() {
		 System.out.println("fourth regression testing");
		 }
	}
}