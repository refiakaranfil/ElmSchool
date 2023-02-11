package section3_2;

public class SwitchDemo3 {
	
	public static void main(String[] args) {
		int day = 2;
	    String dayType;    

	    switch (day) { 
	        // multiple cases without break statements 
	  
	        case 1: 
	        case 2: 
	        case 3: 
	        case 4: 
	        case 5: 
	            dayType = "Weekday"; 
	            break; 
	        case 6: 
	        case 7: 
	            dayType = "Weekend"; 
	            break; 
	  
	        default: 
	            dayType = "Invalid daytype"; 
	    }  
	}

}
