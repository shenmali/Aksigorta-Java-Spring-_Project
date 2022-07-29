package org.egitim.spring.domain;

public class BaseController {

	private DbManager dbmanager;

	public DbManager getDbmanager() {
		return dbmanager;
	}

	public void setDbmanager(DbManager dbmanager) {
		this.dbmanager = dbmanager;
	}

	public void initialize() {

		System.out.println("base controller initialized");
	}

	/*public void destroy() {

		System.out.println("base controller destroyed");
	}*/

}
