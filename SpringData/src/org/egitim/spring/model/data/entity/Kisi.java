package org.egitim.spring.model.data.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;




@Entity
@Table(name = "KISI")
public class Kisi extends BaseEntity{
	
		/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String tcKimlikNo;
	private String ad;
	private String soyad;
	
	
	@Column(name = "TC_KIMLIK_NO" ,length=11 , nullable = false , unique = true)
	public String getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	@Column(name = "AD",length = 25 , nullable =false)
	public String getAd() {
		return ad;
	}
	@Column(name = "SOYAD",length = 25 , nullable =false)
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	@Override
	@Transient
	public String getViewString() {
		StringBuilder sb= new StringBuilder();
		sb.append(getAd()).append(" ").append(getSoyad()).append(" ").append("(").append(getTcKimlikNo()).append(")");
		return sb.toString();
	}
	
	
	
	
	
}
