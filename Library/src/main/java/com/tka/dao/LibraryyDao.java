package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Libraryy;

@Repository
public class LibraryyDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Libraryy l) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(l);
		tr.commit();
		ss.close();
		return "Data is Inserted...";
	}
}
