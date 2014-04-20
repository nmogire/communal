package com.mogire.VOR;
/**
 * implementing an airplane VOR instrument simulator
 */


public class VOR {

	public int setting=20;
    public int course;
	public int interceptedRadial;
	public int deflection;
	
	
	public int Course(int setting) {
		if (setting>=180) {
        	course= setting-180;
        	}
        	else if(setting<180){
        		course= 180+setting;        		
        	      }
		return course;
	}
	
	public int Deflection(int course, int interceptedRadial) {
		 
		deflection=interceptedRadial-course;
		   
		
		return deflection;
		
	}
	
	
	
}


