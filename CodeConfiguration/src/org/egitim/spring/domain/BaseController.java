package org.egitim.spring.domain;

public abstract class BaseController {
	
	private String entityName;

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	

}
