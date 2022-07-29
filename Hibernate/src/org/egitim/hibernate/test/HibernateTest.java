package org.egitim.hibernate.test;

import java.util.ArrayList;
import java.util.List;

import org.egitim.hibernate.model.data.Kisi;
import org.egitim.hibernate.model.data.Sehir;
import org.egitim.hibernate.model.data.Ulke;
import org.egitim.hibernate.system.DBConnector;
import org.hibernate.Session;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class HibernateTest {
	private static Session session;

	@BeforeAll
	public static void setSession() {

		session = DBConnector.getSessionFactory().openSession();
	}

	@Test
	@Disabled
	public void testKisiSelect() {
		// kisi s�n�f� referans al�n�yor.
		ArrayList<Kisi> kisiList = (ArrayList<Kisi>) session.createSelectionQuery("FROM Kisi").list();

		for (Kisi kisi : kisiList) {
			System.out.println("Tc  Kimlik No : " + kisi.getTcKimlikNo());
			System.out.println("Ad : " + kisi.getAd());
			System.out.println("Soyad : " + kisi.getSoyad());

			System.out.println("**********************");
		}

	}

	@Test
	@Disabled
	public void testUlkeSelect() {
		ArrayList<Ulke> ulkeList = (ArrayList<Ulke>) session.createSelectionQuery("from Ulke").list();
		for (Ulke ulke : ulkeList) {
			System.out.println("Ad : " + ulke.getAd());
			System.out.println("Bayrak : " + ulke.getBayrak());
			System.out.println("Plaka : " + ulke.getPlakaKod());
			System.out.println("Telefon : " + ulke.getTelefonKod());
			/*
			 * List<Sehir> sehirListe = ulke.getSehirListe(); for(Sehir sehir : sehirListe)
			 * { System.out.println(sehir.getAd()); }
			 */
			System.out.println("��lem tarihi : " + ulke.getIslemZaman());
			System.out.println("**********************");
		}

	}

	@Test
	@Disabled
	public void testSehirSelect() {
		ArrayList<Sehir> sehirList = (ArrayList<Sehir>) session.createSelectionQuery("from Sehir").list();
		for (Sehir sehir : sehirList) {
			System.out.println("Ad : " + sehir.getAd());

			System.out.println("Ulke : " + sehir.getUlke().getAd());
			System.out.println("**********************");
		}
	}

	@Test
	@Disabled
	public void insertUlke() {
		// resmi_ad, telefon_kod, plaka_kod, bayrak
		Ulke ulke = new Ulke();
		ulke.setAd("Japonya");
		ulke.setTelefonKod("55");
		ulke.setResmiAd("Nippon-koku");
		ulke.setBayrak("k�rm�z�");
		ulke.setPlakaKod("jp");
		session.beginTransaction();
		try {
			session.persist(ulke);
			session.getTransaction().commit();
		} catch (Exception e) {

			session.getTransaction().rollback();
		}

		testUlkeSelect();

	}

	@Test
	@Disabled
	public void updateUlkeBayrak() {
		ArrayList<Ulke> ulkeList = (ArrayList<Ulke>) session.createSelectionQuery("from Ulke").list();
		for (Ulke ulke : ulkeList) {
			session.beginTransaction();
			try {
				ulke.setBayrak("opt/egitim/bayraklar/" + ulke.getTelefonKod() +".png" );
				session.merge(ulke);
				session.getTransaction().commit();
			} catch (Exception e) {

				session.getTransaction().rollback();
			}
		}
		
		
	}
	
	@Test
	@Disabled
	public void deleteHataliKisiKayit() {
		/* JPQL - QueryDSL*/
		String jpql="select kisi from Kisi kisi where kisi.tcKimlikNo like '5%'";
		ArrayList<Kisi> silinecekKisiList = (ArrayList<Kisi>) session.createSelectionQuery(jpql).list();
		System.out.println();
		
		for (Kisi kisi : silinecekKisiList) {
			System.out.println(kisi.getViewString());
			
			session.beginTransaction();
			try {
				session.remove(kisi);
				session.getTransaction().commit();
			} catch (Exception e) {

				session.getTransaction().rollback();
			}
		}
	}
	
	@Test
	public void testManyToOne() {
		
		ArrayList<Sehir> sehirList = (ArrayList<Sehir>) session.createSelectionQuery("FROM Sehir").list();
		
		for (Sehir sehir : sehirList) {
			System.out.println(sehir.getViewString());

		}
		
	}

}
