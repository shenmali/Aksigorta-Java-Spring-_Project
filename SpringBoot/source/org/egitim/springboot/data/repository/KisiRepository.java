package org.egitim.springboot.data.repository;

import java.util.List;
import java.util.Optional;

import org.egitim.springboot.data.entity.Kisi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KisiRepository extends CrudRepository<Kisi,Long>{
	
	public Optional<Kisi> findById(Long id);
	public Optional<Kisi> findByTcKimlikNo(String tcKimlikNo);
	public List<Kisi> findByAd(String ad);
	
	
}
