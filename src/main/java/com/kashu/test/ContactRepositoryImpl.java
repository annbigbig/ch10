package com.kashu.test;
import org.springframework.data.repository.CrudRepository;

import com.apress.prospring3.ch10.domain.Contact;

public class ContactRepositoryImpl implements CrudRepository<Contact,Long>{

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Contact arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Contact> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Contact> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact save(Contact arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Contact> save(Iterable<? extends Contact> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
