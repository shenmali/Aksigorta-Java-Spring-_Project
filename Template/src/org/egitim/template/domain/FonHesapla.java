package org.egitim.template.domain;

public class FonHesapla extends Hesap{

	@Override
	protected double vergiHesapla(double bakiye) {
		// TODO Auto-generated method stub
		return bakiye - (bakiye * 0.15);
	}

	@Override
	protected double komisyonHesapla(double bakiye) {
		// TODO Auto-generated method stub
		return bakiye - (bakiye * 0.02);
	}

}
