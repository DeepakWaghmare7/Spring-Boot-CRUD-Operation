package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Vehical;

@Repository
public class VehicalDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Vehical v) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(v);
		tr.commit();
		ss.close();
		return "Data Is Inserted...";
	}
}
