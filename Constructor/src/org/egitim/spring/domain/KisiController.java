package org.egitim.spring.domain;

public class KisiController extends BaseController {

	public boolean insertKisi(Kisi kisi) {
		//kisi operations
		
		//ApplicationContext context  = new ClassPathXmlApplicationContext("context.xml");
		//DbManager dbmanager = context.getBean("dbmanager", DbManager.class);
		
		/*DbManager dbmanager = new DbManager("","","",1);
		return dbmanager.insertEntity(kisi);*/
		
		return getDbmanager().insertEntity(kisi);
	}
	
	public boolean updateKisi(Kisi kisi) {
		
		return getDbmanager().updateEntity(kisi);
	}
}
