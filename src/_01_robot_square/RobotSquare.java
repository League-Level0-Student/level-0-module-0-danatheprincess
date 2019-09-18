package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot sushi=new Robot();

        // 3. Put the robot's pen down
sushi.penDown();
sushi.setSpeed(10);
        // 6. Make the robot move as fast as possible
int numside=0;
while(numside<4) {
sushi.move(90);
sushi.turn(90);
numside=1+ numside;

}
        // 5. Do everything below here 4 times

        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)


    }
}
