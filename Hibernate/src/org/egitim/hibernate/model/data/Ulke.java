package org.egitim.hibernate.model.data;

import java.util.List;

import org.egitim.hibernate.model.data.base.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;

@Entity
public class Ulke extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ad;
	private String resmiAd;
	private String telefonKod;
	private String plakaKod;
	private String bayrak;
	/*private List<Sehir> sehirListe;
	
	//@OneToMany(mappedBy = "Sehir")
	public List<Sehir> getSehirListe() {
		return sehirListe;
	}
	public void setSehirListe(List<Sehir> sehirListe) {
		this.sehirListe = sehirListe;
	}*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column(name = "AD",length = 50 , nullable =false)
	public String getAd() {
		return ad;
	}
	@Column(name = "RESMI_AD",length = 100 , nullable =false)
	public String getResmiAd() {
		return resmiAd;
	}
	@Column(name = "TELEFON_KOD",length = 5 , nullable =false)
	public String getTelefonKod() {
		return telefonKod;
	}
	@Column(name = "PLAKA_KOD",length = 5 , nullable =false)
	public String getPlakaKod() {
		return plakaKod;
	}
	@Column(name = "BAYRAK",length = 250 , nullable =false)
	public String getBayrak() {
		return bayrak;
	}

	public void setPlakaKod(String plakaKod) {
		this.plakaKod = plakaKod;
	}

	public void setResmiAd(String resmiAd) {
		this.resmiAd = resmiAd;
	}

	public void setTelefonKod(String telefonKod) {
		this.telefonKod = telefonKod;
	}

	public void setBayrak(String bayrak) {
		this.bayrak = bayrak;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	@Override
	@Transient
	public String getViewString() {
		// TODO Auto-generated method stub
		return null;
	}

}
