package org.hw4.spring.model.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.tutorial.spring.model.data.entity.base.BaseEntity;

@Entity
@Table(name = "sehir")
public class Sehir extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "ulke_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "fk_sehir_ulke"))
	private Ulke ulke;
	@Column(name = "ad", nullable = false, length = 100)
	private String ad;

	public Sehir() {
	}

	public Sehir(Ulke ulke, String ad) {
		super();
		this.ulke = ulke;
		this.ad = ad;
	}

	public Ulke getSehir() {
		return ulke;
	}

	public void setSehir(Ulke ulke) {
		this.ulke = ulke;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String name) {
		this.ad = name;
	}

	@Override
	public String getViewString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(getSehir().getAd()).append(" ").append(getAd());
		return stringBuilder.toString();
	}

}
