package com.jsp.student.course;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("advaith");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<Course> al = new ArrayList<Course>();
		List<Course> al1 = new ArrayList<Course>();
		List<Course> al2 = new ArrayList<Course>();
		List<Course> al3 = new ArrayList<Course>();

		Course course1 = new Course();
		course1.setName("Core Java");
		course1.setDuration("3 Months");

		Course course2 = new Course();
		course2.setName("Advance Java");
		course2.setDuration("2 Months");

		Course course3 = new Course();
		course3.setName("SQL");
		course3.setDuration("1 and Half Months");

		Course course4 = new Course();
		course4.setName("Web technology");
		course4.setDuration("2 Months");

		al.add(course1);
		al.add(course2);
		al.add(course3);
		al.add(course4);

		al1.add(course3);

		al2.add(course1);
		al2.add(course3);
		al2.add(course4);

		al3.add(course1);
		al3.add(course2);
		al3.add(course3);
		al3.add(course4);

		Student student = new Student();
		student.setName("Sejal");
		student.setEmail("sejal@mail.com");
		student.setCourses(al);

		Student student1 = new Student();
		student1.setName("Masoom");
		student1.setEmail("masoom@mail.com");
		student1.setCourses(al1);

		Student student2 = new Student();
		student2.setName("Sharayu");
		student2.setEmail("sharayu@mail.com");
		student2.setCourses(al2);

		Student student3 = new Student();
		student3.setName("Advaith");
		student3.setEmail("advaith@mail.com");
		student3.setCourses(al3);

		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityManager.persist(course4);
		entityTransaction.commit();

	}
}
