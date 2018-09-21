
import java.io.Console;


import rxtxrobot.*;
public class Driver {
	public static void main(String[] args)
	{
		//RXTXRobot r = new ArduinoNano();
		//reading input from user for program to run
		Console terminal = System.console();
		
		String input = terminal.readLine("Enter the program number ");
		
		System.out.println(input);
		
	}
}
