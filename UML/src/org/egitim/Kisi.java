package org.egitim;

import java.util.*;

public class Kisi {
	
	private String ad;
	
	protected int id;
	
	private List<Adres> adresList;
	
	public Kisi() {
		adresList = new ArrayList<Adres>();
		Adres adres = new Adres();
		adresList.add(adres);
		
	}

	public List<Adres> getAdresList() {
		return adresList;
	}

	public void setAdresList(List<Adres> adresList) {
		this.adresList = adresList;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	
	

}
