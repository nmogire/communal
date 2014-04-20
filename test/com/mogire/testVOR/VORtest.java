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
	
	//test method that calculates course based on OBS setting
	@Test
	public void testCourse() {
	 VOR tester = new VOR();
	 assertEquals("direction relative to VOR", 270, tester.Course(90));
	 }
	
	//test method that calculates deflection from course based on intercepted radial
	@Test
	public void testDeflection() {
		VOR tester= new VOR();
		assertEquals(40,tester.Deflection(120, 160));
	}
	
	//test method that determines travel direction relative to VOR based on course and intercepted radial
	@Test
	public void testDirection() {
		VOR tester= new VOR();
		assertEquals("TO",tester.Direction(90, 120));
		assertEquals("FROM",tester.Direction(90, 300));		
	}
	
	//test method that determines signal quality based on whether a radial is intercepted
	@Test
	public void testSignal() {
		VOR tester= new VOR();
		assertEquals("GOOD",tester.Signal("TO", "GOOD"));
		assertEquals("GOOD",tester.Signal("FROM", "GOOD"));
		assertEquals("BAD",tester.Signal("OFF", "BAD"));
		
	}
	
	
	
	
}
