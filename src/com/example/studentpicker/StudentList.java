package com.example.studentpicker;

import java.util.ArrayList;
import java.util.Collection;

//import com.example.studentpicker.test.Collection;

public class StudentList {

	protected ArrayList<Student> studentList;
	
	public StudentList(){
		studentList = new ArrayList<Student>();
	}
	public Collection<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentList;		
	}

	public void addStudent(Student testStudent) {
		studentList.add(testStudent);
		
	}
	public void removeStudent(Student testStudent) {
		studentList.remove(testStudent);
		
	}

	
	}

