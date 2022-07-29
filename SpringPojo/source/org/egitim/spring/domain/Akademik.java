package org.egitim.spring.domain;

public class Akademik extends Personel implements IYoklamaKontrol{
	
	private Bolum bolum;

	public Bolum getBolum() {
		return bolum;
	}

	public void setBolum(Bolum bolum) {
		this.bolum = bolum;
	}

	@Override
	public void kartOkuma() {
		System.out.println("akademik - kart okundu");
		
	}
	

}
