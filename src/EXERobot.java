import rxtxrobot.*;
public class EXERobot {

    //all the port constants should go here
    final private static int IR_SENSOR_PORT = 12;


    public EXERobot()
    {
        RXTXRobot robot = new ArduinoNano();
    }

    public EXERobot(String port)
    {
        RXTXRobot robot = new ArduinoNano();
        robot.setPort(port);
        robot.connect();
    }


    private void moveMotor(int channel1, int speed1, int channel2, int speed2, int time)
    {
        //TODO
        robot.runTwoPCAMotor(channel1, speed1, channel2, speed2, time);

    }

    public static void moveServoMotor(double angle)
    {
        robot.runPCAServo(int channel, angle); // need to know the channel //TODO
    }

    public static char readIRChar()
    {
        //TODO

        robot.refreshDigitalPins();
        //pulling the IRChar multiple times to account for dead times
        for (int count = 0; count < 300; count++) {
            System.out.println( robot.getPing(IR_SENSOR_PORT));
            robot.sleep(300);
        }


        char output = '0';

        return output;
    }

    public static void motorRunIndefinitely()
    {
        robot.runPCAMotor(4, 50, 0);
        //TODO
    }

    public static double getTemperature()
    {
        //TODO
        double output = -1;
        return output;
    }
}
