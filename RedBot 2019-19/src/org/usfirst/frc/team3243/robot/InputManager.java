package org.usfirst.frc.team3243.robot;

import edu.wpi.first.wpilibj.Joystick;

public class InputManager {

	Joystick JS1 = new Joystick(0);
	Double[] stickData = new Double[1];
	
	public Double[] getInput() {
		stickData[0] = JS1.getRawAxis(1);
		stickData[1] = JS1.getRawAxis(3);
		
		return stickData;
	}
	
}
