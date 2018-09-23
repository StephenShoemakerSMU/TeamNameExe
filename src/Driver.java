
import java.io.Console;
import java.util.Scanner;


public class Driver {
	private RXTXRobot robot;
	private Console terminal;
	public static void main(String[] args)
	{
		EXERobot robot = new EXERobot();
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
					EXERobot.moveServoMotor(0);
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
	

	
	
	
}

