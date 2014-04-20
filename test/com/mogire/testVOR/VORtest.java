package com.mogire.testVOR;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mogire.VOR.VOR;

public class VORtest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCourse() {
	 VOR tester = new VOR();
	 assertEquals("direction relative to VOR", 270, tester.Course(90));
	 }
	
	@Test
	public void testDeflection() {
		VOR tester= new VOR();
		assertEquals(40,tester.Deflection(120, 160));
	}
	
	
}
