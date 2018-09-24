
import java.io.Console;
import java.util.Scanner;


public class Driver {
	private RXTXRobot robot;
	private Console terminal;
	public static void main(String[] args)
	{
<<<<<<< HEAD
		setPort(); //need to input the terminal
		connect(); //attempts to connect to arduino
		//RXTXRobot r = new ArduinoNano();
=======
		EXERobot robot = new EXERobot();
>>>>>>> a07dd64f02f15f37575d3dc56ac7c27784f1babf
		//reading input from user for program to run
		Console terminal = System.console();
		
		terminal.printf("HELLO");
		char in = terminal.readLine("Enter Program Number").charAt(0);


		while(in != 'q'){
			switch(in)
			{
				case 'a':
					EXERobot.moveMotor(0);//enter meters
					break;
				case 'b':
<<<<<<< HEAD
					moveServoMotor(0);  //enter angle
=======
					EXERobot.moveServoMotor(0);
>>>>>>> a07dd64f02f15f37575d3dc56ac7c27784f1babf
					break;
				case 'c':
					terminal.printf("" + EXERobot.readIRChar());
					break;
				case 'd':
					EXERobot.motorRunIndefinitely();
					break;
				case 'e':
					terminal.printf("" + EXERobot.getTemperature());
					break;
			}
			in = terminal.readLine("Enter Program Number").charAt(0);

		}while(in != 'q');
		
	}
	
<<<<<<< HEAD
	private void moveMotor(double meters)
	{
		//TODO
		//I swear to god if this does not work i am killing the man to my right
	}
	
	private void moveServoMotor(double angle)
	{
		//TODO

	}
	
	private char readIRChar()
	{
		refreshDigitalPins();
		char output = '0'; //connected to D4;
		output = getIRChar();
		return output;
	}
	
	private void motorRunIndefinitely()
	{
		//TODO
	}
	
	private double getTemperature()
	{
		refreshDigitalPins()
		double output = -1;
		output = getAnalogPin(0);
		return output;
	}

	//make one for bump or ping


	close();
=======

	
	
	
>>>>>>> a07dd64f02f15f37575d3dc56ac7c27784f1babf
}

