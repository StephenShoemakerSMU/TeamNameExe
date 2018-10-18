package TeamNameExe.src;
import rxtxrobot.*;
public class EXERobot {

    //all the port constants should go here
    final private static int TEMP_SENSOR_PORT = 0;
    final private static int IR_SENSOR_PORT = 4;
    final private static int MOTOR_LEFT = 11; //TODO
    final private static int MOTOR_RIGHT = 15; //TODO
    final private static int SERVO_MEASUREMENTS = 0;//TODO
    final private static int SERVO_DROP_BALL = -1;//TODO
    final private static int BUMP_SENSOR = 5;//TODO
    final private static String USB_PORT = "COM3";
    final private static int BUMP_SENSOR_TRIGGERED = 0;
    final private static int BUMP_SENSOR_RELAXED = 1;
<<<<<<< HEAD
    
=======
    final private static int INCLINOMETER_SENSOR_PORT = 1;
>>>>>>> 1abea4f22bcb85db3b01daa869a63fb4fb075b32
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
        robot.runPCAServo(SERVO_MEASUREMENTS, (int)((7.2/9.0)*angle)); // need to know the channel //TODO
    }

    public char readIRChar() {
        //TODO

        robot.refreshDigitalPins();
        //pulling the IRChar multiple times to account for dead times
        for (int count = 0; count < 300; count++) {
            System.out.println(robot.getIRChar());
            robot.sleep(100);
        }


        char output = '0';

        return output;
    }

    public void motorRunIndefinitely() {
        boolean stopCondition = false; //create a function to check bump sensor
        int speed1 = 300;
        int speed2 = 300;
        while (!checkBump()) {
            robot.runTwoPCAMotor(MOTOR_LEFT, speed1, MOTOR_RIGHT, speed2, 0);

        }
        robot.runTwoPCAMotor(MOTOR_LEFT, 0, MOTOR_RIGHT, 0,0 );
    }

    public boolean checkBump()
    {
        robot.refreshDigitalPins();

        int bumpValue =robot.getDigitalPin(BUMP_SENSOR).getValue();

        if(bumpValue == BUMP_SENSOR_TRIGGERED)

        {
            return true;
        }
        return false;

    }

    //

    public double getTemperature() {
        int sum = 0;
        double slope =  -1.071428571;
        double yInter = 847.7452381;
        double averageReading = 0;
        double readingCount = 10.0;
        for (int i = 0; i < readingCount; i++)
        {
            robot.refreshAnalogPins();
            int reading = robot.getAnalogPin(TEMP_SENSOR_PORT).getValue();
            sum += reading;
        }
        averageReading = sum / readingCount;
        double temp = (averageReading - yInter) / slope;
        return temp;
        //return averageReading;
    }

    public int getSlope()
    {
        robot.refreshAnalogPins();
        return robot.getAnalogPin(INCLINOMETER_SENSOR_PORT).getValue(); //Todo needs to be calibrated
    }

    public int getConductivity()
    {
        return robot.getConductivity(); //todo
    }


    public double angleRecieved()
    {
        char c;
        int angle = 0;
        for(int i = 0; i < 36; i ++)
        {
            robot.runPCATimedServo(SERVO_MEASUREMENTS, angle, 500);

            c = robot.getIRChar();
            if(c != '0')
                break;
            angle += 5;
        }

        return angle;
    }
    public double pylonAngle() //todo how would we know which one is the second one
    {

    }

}
