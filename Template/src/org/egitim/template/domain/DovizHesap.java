package org.egitim.template.domain;

public class DovizHesap extends Hesap {

	@Override
	protected double vergiHesapla(double bakiye) {
		// TODO Auto-generated method stub
		return bakiye - (bakiye * 0.2);
	}

	@Override
	protected double komisyonHesapla(double bakiye) {
		// TODO Auto-generated method stub
		return bakiye - (bakiye * 0.03);
	}

}
