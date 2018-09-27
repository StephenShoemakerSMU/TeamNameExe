import rxtxrobot.*;
public class RunMotorTest {
    public static void main(String[] args) {
        RXTXRobot robot = new ArduinoUno();
        robot.setPort("COM 3");
        robot.connect();

        robot.runTwoPCAMotor(2, 100, 3, -200, 5000); //RUN THE CODE
        robot.close();
    }
}