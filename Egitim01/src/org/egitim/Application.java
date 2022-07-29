package org.egitim;

public class Application {

	public static void main(String[] args) {
		System.out.println("Egitim 01 projesi");
		System.err.println("Hata");
		
		
		AltSinif altsinif = new AltSinif();
		altsinif.setTanim("TANIM 1");
		System.out.println(altsinif.getTanim());
		
		//AltSinif altsinif2 = altsinif;
		
		AltSinif altsinif2 = new AltSinif();
		altsinif2.setTanim("TANIM 2");
		System.out.println("1"+ altsinif.getTanim());
		System.out.println("2"+ altsinif2.getTanim());
		
		
		altsinif2.printUstSinifAdres();
		
		
	}

}
