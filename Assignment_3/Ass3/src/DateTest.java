
/*
  	3)
	Create a class called Date that includes three instance variables—a
	month (type int), a day (type int) and a year (type int). Provide a constructor
	that initializes the three instance variables and assumes that the values
	provided are correct. Provide a set and a get method for each instance
	variable. Provide a method displayDate that displays the month, day and
	year separated by forward slashes (/). Write a test application named
	DateTest that demonstrates class Date’s capabilities
	  
 */


class Date{
	int month;
	int day;
	int year;
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date(int month, int date, int year) {
		super();
		this.month = month;
		this.day = date;
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println("Date mm/dd/yyyy : "+getMonth()+"/"+getDay()+"/"+getYear());
	}
	
}

public class DateTest {

	public static void main(String[] args) {
		Date d = new Date(12,05,2023);
		d.displayDate();
		

	}

}
