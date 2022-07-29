package org.egitim.spring.domain;

public class Ogrenci extends Kisi implements IYoklamaKontrol {
	private String ogrenciNo;

	public String getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(String ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	@Override
	public void kartOkuma() {
		// TODO Auto-generated method stub
		System.out.println("ogrenci - kart okundu");
	}

}
