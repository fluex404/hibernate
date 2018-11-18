package com.fluex404.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fluex404.database.Database;
import com.fluex404.model.Student;

public class StudentDao extends Database{
	private Session session = null;
	private Transaction tx = null;
	
	public StudentDao() {
		session = getSession();
	}
	
	public void insert(Student student) {
		tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}
	
	public void update(Student student) {
		tx = session.beginTransaction();
		session.update(student);
		tx.commit();
		session.close();
	}
	
	public void delete(Student student) {
		tx = session.beginTransaction();
		session.delete(student);
		tx.commit();
		session.close();
	}
	
	public List<Student> getall() {
		List list;
		tx = session.beginTransaction();
		list = session.createQuery("from Student").list();
		tx.commit();
		session.close();
		
		return list;
	}
	
	public Student getbyid(Integer id) {
		List list;
		Query query;
		tx = session.beginTransaction();
		query = session.createQuery("from Student where id=?");
		query.setInteger(0, id);
		list = query.list();
		tx.commit();
		session.close();
		
		return (Student) list.get(0);
	}
}
