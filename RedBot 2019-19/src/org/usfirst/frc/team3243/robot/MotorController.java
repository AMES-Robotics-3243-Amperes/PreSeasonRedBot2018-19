package org.usfirst.frc.team3243.robot;

import edu.wpi.first.wpilibj.VictorSP;

public class MotorController {

	VictorSP motor1 = new VictorSP(1);
	VictorSP motor2 = new VictorSP(2);
	VictorSP motor3 = new VictorSP(3);
	VictorSP motor4 = new VictorSP(4);
	
	void driver(Double val[]) {
		motor1.set(0.6*val[1]);
		motor2.set(0.6*val[1]);
		motor3.set(0.6*val[0]);
		motor4.set(0.6*val[0]);
	}
	
	
}
