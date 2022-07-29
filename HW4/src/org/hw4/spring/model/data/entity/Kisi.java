package org.hw4.spring.model.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.tutorial.spring.model.data.entity.base.BaseEntity;

@Entity
@Table(name = "kisi")
public class Kisi extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "tc_kimlik_no", nullable = false, length = 11, unique = true)
	private String tcKimlikNo;
	@Column(name = "ad", length = 25, nullable = false)
	private String ad;
	@Column(name = "soyad", length = 25, nullable = false)
	private String soyad;

	public Kisi() {
	}

	public Kisi(String tcKimlikNo, String ad, String soyad) {
		super();
		this.tcKimlikNo = tcKimlikNo;
		this.ad = ad;
		this.soyad = soyad;
	}

	public String getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	@Override
	public String getViewString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(getTcKimlikNo()).append(" > ").append(getAd()).append(" ")
				.append(getSoyad());

		return stringBuilder.toString();
	}
}
