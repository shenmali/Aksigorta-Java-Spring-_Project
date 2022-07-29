package org.egitim.spring.domain;

public class BaseController {
	
	private DbManager dbmanager;

	public DbManager getDbmanager() {
		return dbmanager;
	}

	public void setDbmanager(DbManager dbmanager) {
		this.dbmanager = dbmanager;
	}
	
	

}
