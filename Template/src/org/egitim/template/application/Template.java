package org.egitim.template.application;

import org.egitim.template.domain.DovizHesap;
import org.egitim.template.domain.FonHesapla;
import org.egitim.template.domain.MevduatHesapla;

public class Template {

	public static void main(String[] args) {
		DovizHesap dovizHesap = new DovizHesap();
		System.out.println("Doviz");
		dovizHesap.bakiyeGoruntule();
		FonHesapla fonHesap = new FonHesapla();
		System.out.println("Fon");
		fonHesap.bakiyeGoruntule();
		MevduatHesapla mevduatHesap = new MevduatHesapla();
		System.out.println("Vadeli Mevduat");
		mevduatHesap.bakiyeGoruntule();
		
		
	}

}
