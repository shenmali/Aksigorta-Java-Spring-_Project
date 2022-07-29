package org.tutorial.spring.model.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.tutorial.spring.model.data.entity.base.BaseEntity;

@Entity
@Table(name = "kisi")
public class Kisi extends BaseEntity {
	private static final long serialVersionUID = 1L;

	// Dikkat burada column anotasyonu aslında getterlara da koyulabiliyormuş.
	@Column(name = "tc_kimlik_no", nullable = false, length = 11, unique = true)
	private String nationalIdentity;
	@Column(name = "ad", length = 25, nullable = false)
	private String firstName;
	@Column(name = "soyad", length = 25, nullable = false)
	private String lastName;

	public Kisi() {
	}

	public Kisi(String nationalIdentity, String firstName, String lastName) {
		super();
		this.nationalIdentity = nationalIdentity;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getViewString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(getNationalIdentity()).append(" - ").append(getFirstName()).append(" ")
				.append(getLastName());

		return stringBuilder.toString();
	}
}
