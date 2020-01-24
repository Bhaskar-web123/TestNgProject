package com.parallel;

import org.testng.annotations.Test;

public class Parallel1
{

	@Test(groups = { "smoke"})
	 public void testMethod1() {
	 System.out.println("first smoke testing");
	 }
	 @Test(groups = { "smoke"})
	 public void testMethod2() {
	 System.out.println("second smoke testing");
	 }
	 @Test(groups = { "smoke"})
	 public void testMethod3() {
	 System.out.println("third smoke testing");
	 }
	 @Test(groups = { "regression"})
	 public void testMethod4() {
	 System.out.println("first regression testing");
	 }
}
