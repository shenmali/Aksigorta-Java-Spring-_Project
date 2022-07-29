package org.egitim.spring.model.data.repository;

import java.util.List;

import org.egitim.spring.model.data.entity.Kisi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KisiRepository extends CrudRepository<Kisi,Long>{
	
	public List<Kisi> findByTcKimlikNo(String tcKimlikNo);
	public List<Kisi> findByAd(String ad);
}
