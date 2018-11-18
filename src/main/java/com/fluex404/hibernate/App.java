package com.fluex404.hibernate;

import java.util.List;

import com.fluex404.dao.StudentDao;
import com.fluex404.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        List<Student> list = new StudentDao().getall();
//        for(Student student : list) {
//        	System.out.println(student.getName());
//        }
    	Student student = new Student();
    	student.setName("Isa Subani");
    	student.setUmur(17);
    	
    	new StudentDao().insert(student);
    }
}
