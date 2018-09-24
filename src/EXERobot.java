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


    
    public static void moveMotor(double meters)
    {
        //TODO
        //I swear to god if this does not work i am killing the man to my right
    }

    public static void moveServoMotor(double angle)
    {
        //TODO
    }

    public static char readIRChar()
    {
        //TODO


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
        //TODO
    }

    public static double getTemperature()
    {
        //TODO
        double output = -1;
        return output;
    }
}
