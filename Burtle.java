import lejos.nxt.*;
import lejos.util.*;

/**
The Burtle program and robot will attempt to find a light source
through a maze.

Author James Bower, Josephine Brogden & Seth East

*/

public class Burtle {
	
	//sensors vaules
	
	UltrasonicSensor ultra;

	private LightSensor light;
	
	private final int SETPOINT = 50;
	
	public Burtle () {
		
		//sensors 
		
		ultra = new UltrasonicSensor(SensorPort.S1);
		
		light = new LightSensor(SensorPort.S4);
		light.setFloodlight(false);
		
		run();
	}
	
	private void run(){
		Delay.msDelay(1000);
		
	}
	
	public static void main (String[] args) {
	new Burtle();
	}
}