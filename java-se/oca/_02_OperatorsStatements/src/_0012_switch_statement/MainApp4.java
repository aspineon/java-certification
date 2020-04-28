package _0012_switch_statement;

public class MainApp4 {

	public static void main(String[] args) {

/*
 
 Switch statement is supported this types
 
int and Integer 
byte and Byte 
short and Short 
char and Character 
String
enum values
var (if the type resolves to one of the preceding types)
 
 */		
		
		int month = 5;
		
		switch month {  // DOES NOT COMPILE
		   case 1: System.out.print("January");
		}
		
		switch (month)  // DOES NOT COMPILE
		   case 1: System.out.print("January");
		   
		switch (month) {
		   case 1: 2: System.out.print("January"); // DOES NOT COMPILE
		}
		
		switch (month) {
		   case 1 || 2: System.out.print("January"); // DOES NOT COMPILE 
		}

	}
}