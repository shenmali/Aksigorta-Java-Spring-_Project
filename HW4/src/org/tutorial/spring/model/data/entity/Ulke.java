package org.tutorial.spring.model.data.entity;

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
	private String name;
	@Column(name = "resmi_ad", nullable = false, length = 100)
	private String formalName;
	@Column(name = "telefon_kod", nullable = false, length = 5)
	private String phoneCode;
	@Column(name = "plaka_kod", nullable = false, length = 5)
	private String plateCode;
	@Column(name = "bayrak", nullable = true, length = 250)
	private String flag;
	@OneToMany(mappedBy = "country", fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL)
	private List<Sehir> cities;

	public Ulke() {
	}

	public Ulke(String name, String formalName, String phoneCode, String plateCode, String flag) {
		super();
		this.name = name;
		this.formalName = formalName;
		this.phoneCode = phoneCode;
		this.plateCode = plateCode;
		this.flag = flag;
	}

	public String getName() {
		return name;
	}

	public void setFirstName(String name) {
		this.name = name;
	}

	public String getFormalName() {
		return formalName;
	}

	public void setLastName(String formalName) {
		this.formalName = formalName;
	}

	public String getPhoneCode() {
		return phoneCode;
	}

	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}

	public String getPlateCode() {
		return plateCode;
	}

	public void setPlateCode(String plateCode) {
		this.plateCode = plateCode;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String getViewString() {
		return getName();
	}

	public List<Sehir> getCities() {
		return cities;
	}

	public void setCities(List<Sehir> cities) {
		this.cities = cities;
	}

}
