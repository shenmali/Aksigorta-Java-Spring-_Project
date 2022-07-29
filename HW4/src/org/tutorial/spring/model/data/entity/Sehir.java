package org.tutorial.spring.model.data.entity;

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
	private Ulke country;
	@Column(name = "ad", nullable = false, length = 100)
	private String name;

	public Sehir() {
	}

	public Sehir(Ulke country, String name) {
		super();
		this.country = country;
		this.name = name;
	}

	public Ulke getCountry() {
		return country;
	}

	public void setCountry(Ulke country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getViewString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(getCountry().getName()).append(" ").append(getName());
		return stringBuilder.toString();
	}

}
