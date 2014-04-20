package com.mogire.VOR;
/**
 * implementing an airplane VOR instrument simulator
 */


public class VOR {

	public int setting=20;
    public int course;
	public int interceptedRadial;
	public int deflection;
	public String direction;
	public String signal;
	public String interceptedStatus;
	
	
	
	//determine the course to travel based on OBS setting
	public int Course(int setting) {
		if (setting>=180) {
        	course= setting-180;
        	}
        	else if(setting<180){
        		course= 180+setting;        		
        	      }
		return course;
	}
	
	//calculate deflection from course
	public int Deflection(int course, int interceptedRadial) {
		 
		deflection=interceptedRadial-course;
		
		return deflection;
		
	}

	//determine direction of plane relative to VOR
	public String Direction(int interceptedRadial, int Course) { 
    	if(interceptedRadial<((Course+90)%360) && interceptedRadial>((Course-90)%360)) {
			direction="TO";
			}
     
		    else if (interceptedRadial>((Course+90)%360) || interceptedRadial<((Course-90)%360)) {
				direction="FROM";
				}
             else {
				direction="OFF";
			      }
          return direction;
      }
	
	//determine signal reception status
	public String Signal(String direction, String interceptStatus) { 
    	if(direction=="TO" || direction=="FROM") {
     	  signal="GOOD";
     	    }     
         else if(interceptStatus.equals("BAD")){     	
     	     	signal="BAD";
                }
           return signal;
       }
	
	
	
}


