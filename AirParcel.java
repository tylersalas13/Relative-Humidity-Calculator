import java.lang.Math;
public class AirParcel {
	
	private int temperature;
	private int dewpoint;
	private int rh;
	
	public AirParcel (int temp, int dp) {
		
		this.dewpoint = dp;
		this.temperature = temp;
		
	}
	
	public int getTemp() {
		return temperature;
	}
	
	public int getDP() {
		return dewpoint;
	}
	
	public double getrh() {
		double temp = (5.0/9.0) * (temperature - 32.0) ;
		double dp = (5.0/9.0) * (dewpoint - 32.0);
		double vapor = 0.6112 * Math.exp((17.67 * temp)/(temp + 243.5));
		double sat = 0.6112 * Math.exp((17.67 * dp)/(dp + 243.5));
		double relHum = 100 * (sat/vapor);
		this.rh = (int) relHum;
		return rh;
	}
	
	

	public String toString() {
		
		return "Tempertaure: " + temperature + "\n" + "Dewpoint: " + dewpoint + "\n" + "Relative Humidity: " + getrh() + "%";
	}

	

}



