package org.services;

import org.springframework.beans.factory.annotation.Autowired;

import dao.DaoImpl;
import dao.IDao;

public class MyServiceImpl implements IMyService{
	
	@Autowired
	IDao daoImpl2;
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public IDao getDaoImpl2() {
		return daoImpl2;
	}
	
	//@Autowired
	public void setDfaoImpl2(IDao daoImpl2) {
		this.daoImpl2 = daoImpl2;
	}
	
	@Override
	public double count() {
		// TODO Auto-generated method stub
		System.out.println("The message " + message);
		System.out.println("My First Test " + daoImpl2.loadValue());
		return 0;
	}
	
	public static IMyService getCustomMyDao(String str){
		System.out.println("Hi "+str);
		return new MyServiceImpl();
	}


}
