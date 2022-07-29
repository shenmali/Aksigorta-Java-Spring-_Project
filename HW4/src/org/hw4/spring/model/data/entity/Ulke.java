package org.hw4.spring.model.data.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.tutorial.spring.model.data.entity.base.BaseEntity;

@Entity
@Table(name = "Ulke")
public class Ulke extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "ad", nullable = false, length = 50)
	private String ad;
	@Column(name = "resmi_ad", nullable = false, length = 100)
	private String resmiAd;
	@Column(name = "telefon_kod", nullable = false, length = 5)
	private String telKod;
	@Column(name = "plaka_kod", nullable = false, length = 5)
	private String plakaKodu;
	@Column(name = "bayrak", nullable = true, length = 250)
	private String bayrak;
	@OneToMany(mappedBy = "sehir", fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL)
	private List<Sehir> sehirler;

	public Ulke() {
	}

	public Ulke(String ad, String resmiAd, String telKod, String plakaKodu, String bayrak) {
		super();
		this.ad = ad;
		this.resmiAd = resmiAd;
		this.telKod = telKod;
		this.plakaKodu = plakaKodu;
		this.bayrak = bayrak;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getResmiAd() {
		return resmiAd;
	}

	public void setResmiAd(String resmiAd) {
		this.resmiAd = resmiAd;
	}

	public String getTelKod() {
		return telKod;
	}

	public void setTelKod(String telKod) {
		this.telKod = telKod;
	}

	public String getPlakaKodu() {
		return plakaKodu;
	}

	public void setPlakaKodu(String plakaKodu) {
		this.plakaKodu = plakaKodu;
	}

	public String getBayrak() {
		return bayrak;
	}

	public void setBayrak(String bayrak) {
		this.bayrak = bayrak;
	}

	@Override
	public String getViewString() {
		return getAd();
	}

	public List<Sehir> getSehirler() {
		return sehirler;
	}

	public void setSehirler(List<Sehir> sehirler) {
		this.sehirler = sehirler;
	}

}
