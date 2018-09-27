import rxtxrobot.*;
public class EXERobot {

    //all the port constants should go here
    final private static int IR_SENSOR_PORT = 12;
    final private static int MOTOR_LEFT = -1; //TODO
    final private static int MOTOR_RIGHT = -1; //TODO
    final private static int SERVO_MEASUREMENTS = -1;//TODO
    final private static int SERVO_DROP_BALL = -1;//TODO
    final private static int BUMP_SENSOR = -1;//TODO
    final private static String USB_PORT = "FILL ME";


    public EXERobot() {
        RXTXRobot robot = new ArduinoNano();
    }

    public EXERobot(String port) {
        RXTXRobot robot = new ArduinoNano();
        robot.setPort(USB_PORT);
        robot.connect();
    }


    private void moveMotor(int channel1, int speed1, int channel2, int speed2, int time) {
        //TODO
        robot.runTwoPCAMotor(MOTOR_LEFT, speed1, MOTOR_RIGHT, speed2, time);

    }

    public void moveServoMotor(double angle) {
        robot.runPCAServo(SERVO_MEASUREMENTS, angle); // need to know the channel //TODO
    }

    public char readIRChar() {
        //TODO

        robot.refreshDigitalPins();
        //pulling the IRChar multiple times to account for dead times
        for (int count = 0; count < 300; count++) {
            System.out.println(robot.getPing(IR_SENSOR_PORT));
            robot.sleep(100);
        }


        char output = '0';

        return output;
    }

    public void motorRunIndefinitely() {
        boolean stopCondition; //create a function to check bump sensor
        while (stopCondition) {
            robot.runTwoPCAMotor(MOTOR_LEFT, speed1, MOTOR_RIGHT, speed2, 1);
            stopConditon = checkBump();
        }//TODO
    }

    public boolean checkBump()
    {
        robot.refreshDigitalPins();
        int bumpValue =robot.getDigitalPin(BUMP_SENSOR);
        if(bumpValue = 0 /*CHANGE THIS VALUE WITH TESTING*/)
        {
            return true;
        }
        return false;
    }

    //

    public static double getTemperature()
    {
        //TODO
        double output = -1;
        return output;
    }
}
