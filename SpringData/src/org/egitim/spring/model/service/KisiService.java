package org.egitim.spring.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.egitim.spring.model.data.entity.Kisi;
import org.egitim.spring.model.data.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class KisiService {
	
	@Autowired private KisiRepository kisiRepository;
	
	@Transactional
	public List<Kisi> tumunuListele(String tcKimlikNo){
		return (List<Kisi>)kisiRepository.findAll();
	}
	
	@Transactional
	public List<Kisi> findByTcKimlikNo(String tcKimlikNo){
		return kisiRepository.findByTcKimlikNo(tcKimlikNo);
	}
	@Transactional
	public List<Kisi> findByAd(String ad){
		return kisiRepository.findByAd(ad);
	};

}
