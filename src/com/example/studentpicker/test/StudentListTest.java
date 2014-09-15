package com.example.studentpicker.test;

import java.util.Collection;

import com.example.studentpicker.Student;
import com.example.studentpicker.StudentList;

import junit.framework.TestCase;

public class StudentListTest extends TestCase {
	public void testEmptyStudentList() {
		StudentList studentList = new StudentList();
		Collection<Student> students = studentList.getStudents();
		assertTrue("Empty student list", students.size() == 0);
	}
	public void testAddStudentList() {
		StudentList studentList = new StudentList();
		String studentName = "A Student";
		Student testStudent = new Student(studentName);
		studentList.addStudent(testStudent);
		Collection<Student> students = studentList.getStudents(); 	
		assertTrue("Student list size", students.size() == 1);
		assertTrue("", students.contains(testStudent));
	}
	public void testRemoveStudent() {
		StudentList studentList = new StudentList();
		String studentName = "A Student";
		Student testStudent = new Student(studentName);
		studentList.addStudent(testStudent);
		Collection<Student> students = studentList.getStudents(); 	
		assertTrue("Student list size is not 1", students.size() == 1);
		assertTrue("", students.contains(testStudent));
		studentList.removeStudent(testStudent);
		students = studentList.getStudents(); 	
		assertTrue("Student list size is not 0", students.size() == 0);
		assertFalse("Test student still contained", students.contains(testStudent));
	}
}

