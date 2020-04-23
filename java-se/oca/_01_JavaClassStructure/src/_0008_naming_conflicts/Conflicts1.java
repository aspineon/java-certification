package _0008_naming_conflicts;

//CASE 1
//import java.util.*; //OKEY
//import java.sql.*;  //DOES NOT COMPILE


//CASE 2
//import java.util.Date; //OKEY
//import java.sql.*; //REDUNDANT IMPORT


//CASE 3
import java.util.Date; 
//import java.sql.Date; // ERROR


public class Conflicts1 {
	Date date;
	// some more code
}