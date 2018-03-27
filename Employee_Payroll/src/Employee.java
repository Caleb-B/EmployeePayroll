/* **********************************************************
 * Programmer:	Caleb Beynon
 
 * Class:		CS30S
 * 
 * Assignment:	3
 *
 * Description:	Employee class, with an hourly wage and weekly
 *				hours, that calculates regular pay, overtime
 *				pay, and gross pay.
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Employee
 {  // begin class
 	
 	// *********** class constants **********
 	
 	private static int nextID = 1000;
 	
 	// ********** instance constants **********
 	
 	// ********** instance variable **********
 	
 	private int hours = 0;			// hours worked in a week
 	private double wage = 0.0;		// hourly wage
 	
 	private int maxHours = 40;		// max hours before overtime
 	private double ovtRate = 1.5;	// overtime rate
 	
 	private int id = 0;		// id of employee
 	
 	// ********** constructors ***********
 	
 	/*******************************************************
	  *Purpose:		create a new object with default properties
	  *
	  * Interface:
	  *	in:			none
	  *	out:		none
	  *******************************************************/
 	public Employee() {
 		id = nextID++;		// set id and increment next id
 		hours = 0;
 		wage = 0;
 	} // end default constructor
 	
 	/*******************************************************
	  *Purpose:		create a new object with initialized properties
	  *
	  * Interface:
	  *	in:			int: hours, double: wage
	  *	out:		none
	  *******************************************************/
	public Employee(int h, double w) {
		id = nextID++;		// set id and increment next id
		hours = h;
		wage = w;
	} // end initialized constructor
 	
 	// ********** accessors **********
	
	/*******************************************************
	  *Purpose:		get the id
	  *
	  * Interface:
	  *	in:			none
	  *	out:		id: int
	  *******************************************************/
	public double getId() {
		return id;
	} // end getRegularPay
	
	/*******************************************************
	  *Purpose:		get the regular pay per week
	  *
	  * Interface:
	  *	in:			none
	  *	out:		regularPay: double
	  *******************************************************/
	public double getRegularPay() {
		double rPay = 0;
		if (hours <= 40){
			rPay = hours * wage;
		}
		else {
			rPay = maxHours * wage;
		}
		return rPay;
	} // end getRegularPay
	
	/*******************************************************
	  *Purpose:		get the overtime pay per week
	  *
	  * Interface:
	  *	in:			none
	  *	out:		overtimePay: double
	  *******************************************************/
	 
	 
	 // 1.5 and 40 should be declared as constants, either class (static) or instance (non-static) 
	 // are acceptable.
	 
	public double getOvertimePay() {
		if (hours > maxHours) {
			return wage * ovtRate * (hours - maxHours);
		}
		return 0;
	} // end getOvertimePay
	
	/*******************************************************
	  *Purpose:		get the gross pay per week
	  *
	  * Interface:
	  *	in:			none
	  *	out:		grossPay: double
	  *******************************************************/
	public double getGrossPay() {
		return this.getOvertimePay() + this.getRegularPay();
	} // end getGrossPay
	 
// gross psy is the sum of regular pay and overtime pay
	
	/*******************************************************
	  *Purpose:		return a formatted string of the
	  *				employee's information
	  *
	  * Interface:
	  *	in:			none
	  *	out:		employeeInfo: String
	  *******************************************************/
	public String toString() {
		String employeeInfo;
		employeeInfo = "Id: " + id + "\n";
		employeeInfo += "Hours: " + hours + "\n";
		employeeInfo += "Wage: " + wage + "\n";
		employeeInfo += "Regular Pay: $" + this.getRegularPay() + "\n";
		employeeInfo += "Overtime Pay: $" + this.getOvertimePay() + "\n";
		employeeInfo += "Gross Pay: $" + this.getGrossPay() + "\n";
		return employeeInfo;
	}
 	
 	// ********** mutators **********

 }  // end class
