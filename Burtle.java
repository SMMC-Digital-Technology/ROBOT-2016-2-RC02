import lejos.nxt.*;
import lejos.util.*;

/**
The Burtle program and robot will attempt to find a light source
through a maze.

<<<<<<< HEAD
<<<<<<< HEAD
Author James Bower, Josephine Brogden & Seth East
=======
Author Seth East
>>>>>>> 4205b1c08172ba108978ccb970803786c57410d5
=======
Author Seth East, Josephine Brogden, James Bower
>>>>>>> origin/master

*/

public class Burtle {
	
<<<<<<< HEAD
	//sensors vaules
=======
	//sensors created
>>>>>>> 4205b1c08172ba108978ccb970803786c57410d5
	
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
		int level = ultra.getDistance();
		int josephine = 1;
		while (!Button.ENTER.isDown()){
			while (josephine == 1) {
				if (ultra.getDistance() < 5) {
					Motor.A.forward();
					Motor.C.forward();
				} else {
				Motor.C.forward();
				}
			}
		}
	}
	
	public static void main (String[] args) {
	new Burtle();
	}
}