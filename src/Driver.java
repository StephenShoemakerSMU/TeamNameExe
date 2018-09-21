
import java.io.Console;


import rxtxrobot.*;
public class Driver {
	private RXTXRobot robot;
	private Console terminal;
	public static void main(String[] args)
	{
		//RXTXRobot r = new ArduinoNano();
		//reading input from user for program to run
		Console terminal = System.console();
		
		terminal.printf("HELLO");
		String input = terminal.readLine("Enter the program number ");
		
		System.out.println(input);
		
	}
	
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
		//TODO
		char output = '0';
		
		return output;
	}
	
	private void MotorRunIndefinitely()
	{
		//TODO
	}
	
	private double getTemperature()
	{
		//TODO
		double output = -1;
		return output;
	}
	
	
	
}
