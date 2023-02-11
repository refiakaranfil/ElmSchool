package section8_1;

public class Car {
	
	private String make;
	private String model;
	private int maxSpeed;
	private int currentSpeed;  // 60  150   2 hours 30 mins
	private int distance;
	
	public Car (String make, String model, int maxSpeed, int currentSpeed) {
		this.make = make;
		this.model = model;
		this.maxSpeed = maxSpeed;
			if (currentSpeed > maxSpeed) {
				this.currentSpeed = maxSpeed;
			} else {
				this.currentSpeed = currentSpeed;
			}				
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void setCurrentSpeed(int currentSpeed) {
		
		if (currentSpeed > maxSpeed) {
			this.currentSpeed = maxSpeed;
		} else {
			this.currentSpeed = currentSpeed;
		}
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public String calculateTravelTime(int distance) {
			     //   140	/      66
		double timeInDouble = (distance * 1.0) / (this.currentSpeed * 1.0); // 1.5
		int minutes = (int)( 100 * timeInDouble * 60) / 100; 
		
		System.out.println(timeInDouble);
		System.out.println(minutes);
		
		String time = "" + minutes / 60	+ "hours " + minutes % 60 + " minutes"; 	
		return time;		
	}
	
	//make model is currently going 60 mph.
	//it will take "time" to reach the destination
	//If it was going with max speed it would only " "
	
	public void infoAboutCar() {
		System.out.println(this.make + " " + this.model + "is currently going " + this.currentSpeed + " mph.\n" +
						   "It will take " + calculateTravelTime(this.distance) + " to reach destination.\n");
	}
	//note: currentSpeed can't be greater than maxSpeed.
	//If I pass more than maxSpeed it should adjust it to maxSpeed
	
	
}
