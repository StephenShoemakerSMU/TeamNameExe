package TeamNameExe.src;
import rxtxrobot.*;
public class EXERobot {

    //all the port constants should go here
    final private static int TEMP_SENSOR_PORT = 0;
    final private static int IR_SENSOR_PORT = 12;
    final private static int MOTOR_LEFT = 12; //TODO
    final private static int MOTOR_RIGHT = 10; //TODO
    final private static int SERVO_MEASUREMENTS = -1;//TODO
    final private static int SERVO_DROP_BALL = -1;//TODO
    final private static int BUMP_SENSOR = -1;//TODO
    final private static String USB_PORT = "FILL ME";
    private RXTXRobot robot;


    public EXERobot() {
        RXTXRobot robot = new ArduinoUno();
    }

    public EXERobot(String port) {
        robot = new ArduinoUno();
        robot.setPort(USB_PORT);
        robot.connect();
    }

    public void close()
    {
        robot.close();
    }
    public void moveMotor( int speed1, int speed2, int time) {
        //TODO
        robot.runTwoPCAMotor(MOTOR_LEFT, speed1, MOTOR_RIGHT, speed2, time);

    }

    public void moveServoMotor(int angle) {
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
        boolean stopCondition = false; //create a function to check bump sensor
        int speed1 = 20;
        int speed2 = 20;
        while (!stopCondition) {
            robot.runTwoPCAMotor(MOTOR_LEFT, speed1, MOTOR_RIGHT, speed2, 1);
            stopCondition = checkBump();
        }//TODO
    }

    public boolean checkBump()
    {
        robot.refreshDigitalPins();

        int bumpValue =robot.getDigitalPin(BUMP_SENSOR).getValue();

        if(bumpValue == 0 /*CHANGE THIS VALUE WITH TESTING*/)

        {
            return true;
        }
        return false;
    }

    //

    public double getTemperature() {
        int sum = 0;
        double slope =  -1;
        double yInter = -1;
        double output = 0;
        double readingCount = 10.0;
        for (int i = 0; i < readingCount; i++)
        {
            robot.refreshAnalogPins();
            int reading = robot.getAnalogPin(TEMP_SENSOR_PORT).getValue();
            sum += reading;
        }
        output = sum / readingCount;
        double temp = 0.0;
        temp = (output - yInter) / slope;
        return temp;
    }
}
