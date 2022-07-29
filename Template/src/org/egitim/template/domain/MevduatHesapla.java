package org.egitim.template.domain;

public class MevduatHesapla extends Hesap{

	@Override
	protected double vergiHesapla(double bakiye) {
		// TODO Auto-generated method stub
		return bakiye - (bakiye * 0.1);
	}

	@Override
	protected double komisyonHesapla(double bakiye) {
		// TODO Auto-generated method stub
		return bakiye - (bakiye * 0.01);
	}

}
