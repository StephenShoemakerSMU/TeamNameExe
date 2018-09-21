
import java.io.Console;
import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		char in = sc.next()
		System.out.println(input);

		do
		{
			char in = sc.next()
			switch(in)
			{
				case 'a':
					moveMotor(0);//enter meters
					break;
				case 'b':
					moveServoMotor(0);
					break;
				case 'c':
					System.out.println(readIRChar());
					break;
				case 'd':
					motorRunIndefinitely();
					break;
				case 'e':
					System.out.println(getTemperature());
					break;
			}

		}while(in != 'q');
		
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
	
	private void motorRunIndefinitely()
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
