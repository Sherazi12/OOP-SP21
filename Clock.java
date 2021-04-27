

public class Clock {
	protected int hour;
	protected int min;
	protected int sec;
	
	public Clock(){
		 this.hour = 0;
		 this.min = 0;
		 this.sec = 0;
	}
	
	public Clock(int hour , int min , int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setMin(int min) {
		this.min = min;
	}
	
	public int getMin() {
		return min;
	}
	
	public void setSec(int sec) {
		this.sec = sec;
	}
	
	public int getSec() {
		return sec;
	}
	
	public void display() {
		System.out.println("Hour : " + hour +
							"\n Min : " +min +
							"\n Seconds : " +sec);
	}
	

}
