package org.egitim.spring.domain;

public class DbManager {
	
	private TransactionManager transactionManager;
	

	//construction
	public DbManager(String connectionURL, String user, String password, int timeoutMinute) {
		// Constrution
		// Connection Operation
	}
	public void initialize() {

		System.out.println("Databes connection initialied");
	}
	
	
	//getter & setter
	public TransactionManager getTransactionManager() {
		return transactionManager;
	}

	public void setTransactionManager(TransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	
	//Servide Methods
	public boolean insertEntity(Object entity) {
		// Db operations

		return true;
	}

	public boolean updateEntity(Object entity) {
		// Db operations

		return true;
	}

	
	//destroy
	public void destroy() {

		System.out.println("Databes connection destroyed");
	}
}
