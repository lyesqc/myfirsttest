package org.services;

import dao.IDao;

public class MyServiceImpl implements IMyService{

	IDao myDao;
	public IDao getMyDao() {
		return myDao;
	}
	public void setMyDao(IDao myDao) {
		this.myDao = myDao;
	}
	@Override
	public double count() {
		// TODO Auto-generated method stub
		System.out.println("My First Test " + myDao.loadValue());
		
		return 0;
	}

}
