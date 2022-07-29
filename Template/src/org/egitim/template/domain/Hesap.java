package org.egitim.template.domain;

public abstract class Hesap {

	public void bakiyeGoruntule() {
		double temelBakiye = hareketToplamHesapla();
		temelBakiye = vergiHesapla(temelBakiye);
		temelBakiye = komisyonHesapla(temelBakiye);
		
		System.out.println("Bakiye: " + temelBakiye );
	}
	
	protected double hareketToplamHesapla() {
		// giris cikis hareketlerini Hesaplama adimlari
		return 1000;
	}
	
	protected abstract double vergiHesapla(double bakiye);
	
	protected abstract double komisyonHesapla(double bakiye);
	
	
}
