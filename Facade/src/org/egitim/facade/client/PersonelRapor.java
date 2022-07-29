package org.egitim.facade.client;

import org.egitim.facade.library.FileConverter;

public class PersonelRapor {

	public void convertPersobnelKimlikToPdf() {
		FileConverter fileConverter  = new FileConverter();
		
		fileConverter.convertFile(getKimlikDoc(), "doc");
	}

	private byte[] getKimlikDoc() {
		// TODO Auto-generated method stub
		return null;
	}
}
