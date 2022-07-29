package org.egitim.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.egitim.springboot.data.entity.Kisi;
import org.egitim.springboot.data.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KisiService {
	
	@Autowired private KisiRepository kisiRepository;
	
	@Transactional
	public List<Kisi> tumunuListele(){
		return (List<Kisi>)kisiRepository.findAll();
	}
	
	@Transactional
	public Optional<Kisi> findById(String id){
		return kisiRepository.findById(Long.parseLong(id));
	}
	@Transactional
	public Optional<Kisi> findByTcKimlikNo(String tcKimlikNo){
		return kisiRepository.findByTcKimlikNo(tcKimlikNo);
	}
	@Transactional
	public List<Kisi> findByAd(String ad){
		return kisiRepository.findByAd(ad);
	};
	
	@Transactional
	public void insertKisi(Kisi kisi) {
		kisiRepository.save(kisi);
	}
	
	
	@Transactional
	public void deleteKisi(Kisi kisi) {
		kisiRepository.delete(kisi);;
	}
	
	@Transactional
	public void deleteKisi(String id) {
		deleteKisi(findById(id).get());
		
	}
}
