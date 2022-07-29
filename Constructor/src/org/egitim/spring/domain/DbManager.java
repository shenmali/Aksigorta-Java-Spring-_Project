package org.egitim.spring.domain;

public class DbManager {
	
	public DbManager(String connectionURL, String user, String password, int timeoutMinute) {
		//Constrution
		//Connection Operation
	}
	
	public DbManager(String connectionURL, String user, String password) {
		
		int timeoutMinute = 60;
		//Constrution
		//Connection Operation
	}
	
	
	
	public boolean insertEntity(Object entity) {
		// Db operations

		return true;
	}
	
	public boolean updateEntity(Object entity) {
		// Db operations

		return true;
	}
}
