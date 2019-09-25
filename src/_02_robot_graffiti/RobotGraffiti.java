package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Robot dora=new Robot("mini");
dora.penDown();
dora.moveTo(150,400);
dora.setSpeed(10);
dora.move(90);
for(int i=0;i<60;i++){
dora.move(15);
dora.turn(3);
	}
	}
	}
