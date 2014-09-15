package com.example.studentpicker.test;

import junit.framework.TestCase;
import com.example.studentpicker.Student;  

public class StudentTest extends TestCase {
	public void testStudent(){
		String studentName = "A Student";
		Student student = new Student(studentName);
		assertTrue("Student name is not equal", studentName.equals(student.getName()));
	}

}
