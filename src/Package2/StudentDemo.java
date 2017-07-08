package Package2; // Creating package 2

import Package1.*; //Using import statement to access the class of package1

public class StudentDemo { //Class StudentDemo inherits the properties of class student

	public static void main(String[] args) {

		Student s = new Student(); // Creating class Student object of package 1

		s.display(); //Calling the display method of package 1

	}

}
