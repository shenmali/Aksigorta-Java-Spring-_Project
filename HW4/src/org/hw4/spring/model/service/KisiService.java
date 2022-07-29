package org.hw4.spring.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hw4.spring.model.data.repo.KisiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tutorial.spring.model.data.entity.Kisi;

@Service
public class KisiService {

	@Autowired
	private KisiRepo kisiRepo;

	@Transactional
	public Kisi findByTcKimlikNo(String TcKimlikNo) {
		return kisiRepo.findByTcKimlikNo(TcKimlikNo);
	}

	@Transactional
	public List<Kisi> findByAd(String Ad) {
		return kisiRepo.findByAd(Ad);
	}
	
	@Transactional
	public List<Kisi> findAll() {
		return (List<Kisi>) kisiRepo.findAll();
	}
}
