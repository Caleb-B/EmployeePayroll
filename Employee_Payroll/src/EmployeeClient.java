// **********************************************************************
// Programmer:	Caleb Beynon
// Class:		CS30S
//
// Assignment:	3
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import javax.swing.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class EmployeeClient
{  // begin class
	public static void main(String args[]) throws IOException
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
	// ***** create objects *****
		
		String delim = "[ ]+";
		String strin;
		String tokens[] = new String[2];
		int c = 0;
		
		ProgramInfo Printer = new ProgramInfo();
		
		ArrayList<Employee> eList = new ArrayList<Employee>();
		
		BufferedReader eRead = null;
		try {
			eRead = new BufferedReader(new FileReader("employeeData.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception error");
		}
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		Printer.printBanner("Assignment 3");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
	
		strin = eRead.readLine();
		
		while(strin != null) {
			tokens = strin.split(delim);
			//System.out.println(tokens[0] + tokens[1]);
			eList.add(new Employee(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1])));
			strin = eRead.readLine();
			c += 1;
		} // end eof loop
		//System.out.println(eList.get(0).toString());
		
	// ***** output *****
	
		// all formatted ouput is printed in this section

		for (int i = 0; i < c; i++) {
			System.out.println(eList.get(i).toString());
		}
		
	// ***** closing message *****
	
		Printer.printClosing();
	
	}  // end main	
}  // end class