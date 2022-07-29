package org.egitim.hibernate.model.data;


import org.egitim.hibernate.model.data.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;


@Entity
@Table(name = "SEHIR")
public class Sehir extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Ulke ulke;
	private String ad;
	

	
	@Column(name = "AD",length = 50 , nullable =false)
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	 @ManyToOne//(fetch = FetchType.LAZY)
	 @JoinColumn(name = "ULKE_ID" , nullable = false , foreignKey = @ForeignKey(name="FK_SEHIR_ULKE"))
	public Ulke getUlke() {
		
		return ulke;
	}

	public void setUlke(Ulke ulke) {
		this.ulke = ulke;
	}

	@Override
	@Transient
	public String getViewString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getAd()).append("(").append(getUlke().getAd()).append(")");
		return sb.toString();
	}

}
