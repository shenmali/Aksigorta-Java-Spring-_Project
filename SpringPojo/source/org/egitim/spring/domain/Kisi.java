package org.egitim.spring.domain;

public abstract class Kisi {
	private String tCKimlikNo;
	private String ad;
	private String soyad;

	public String gettCKimlikNo() {
		return tCKimlikNo;
	}

	public void settCKimlikNo(String tCKimlikNo) {
		this.tCKimlikNo = tCKimlikNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

}
