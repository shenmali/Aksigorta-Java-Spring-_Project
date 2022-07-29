package org.hw4.spring.model.data.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.tutorial.spring.model.data.entity.Kisi;

@Repository
public interface KisiRepo extends CrudRepository<Kisi, Long> {

	Kisi findByTcKimlikNo(String tcKimlikNo);

	List<Kisi> findByAd(String ad);
}

