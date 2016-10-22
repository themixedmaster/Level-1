import org.jointheleague.graphical.robot.Robot;

public class RobuttGraphitti2 {
	public static void main(String[] args) {
		Robot gavin = new Robot();
		gavin.setSpeed(1);
		gavin.penDown();
		gavin.turn(90);
		gavin.move(27);
		gavin.turn(90);
		for (int i = 158; i > 0; i--) {
			gavin.move(1);
			gavin.turn(2);
		}
		gavin.hide();
		Robot scott = new Robot();
		scott.setSpeed(1);
		scott.setX(1000);
		scott.move(13);
		scott.turn(90);
		scott.move(26);
		scott.penDown();
		scott.turn(-90);
		for (int i = 138; i > 0; i--) {
			scott.move(1);
			scott.turn(-2);
		}
		for (int i = 138; i > 0; i--) {
			scott.move(1);
			scott.turn(2);
		}
		scott.hide();
		Robot morris = new Robot();
		morris.setX(1100);
		morris.penDown();
		morris.move(26);
		morris.turn(135);
		morris.move(26);
		morris.turn(-90);
		morris.move(26);
		morris.turn(135);
		morris.move(26);
		morris.hide();
	}
}
