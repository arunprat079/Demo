package com.model;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pojo.Registration;
import com.pojo.Role;

public class BLManger {
	
SessionFactory com = new Configuration().configure().buildSessionFactory();
	
	//*****************Registration Work**************//

	public void saveregister(Registration rg) {

		Session s1 = com.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(rg);
		t1.commit();
		s1.close();

	}
	
	public Role searchbyname(String rname) {
		Session s1=com.openSession();
		Criteria cr=s1.createCriteria(Role.class);
		cr.add(Restrictions.eq("rname", rname));
		Role r=(Role)cr.uniqueResult();
		return r;
		
	}

}
