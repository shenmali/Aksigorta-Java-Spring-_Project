package org.tutorial.spring.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tutorial.spring.model.data.entity.Kisi;
import org.tutorial.spring.model.data.repository.KisiRepository;

@Service
public class KisiService {

	@Autowired
	private KisiRepository kisiRepository;

	@Transactional
	public Kisi findByTcKimlikNo(String TcKimlikNo) {
		return kisiRepository.findByTcKimlikNo(TcKimlikNo);
	}

	@Transactional
	public List<Kisi> findByAd(String Ad) {
		return kisiRepository.findByAd(Ad);
	}
	
	@Transactional
	public List<Kisi> findAll() {
		return (List<Kisi>) kisiRepository.findAll();
	}
}
