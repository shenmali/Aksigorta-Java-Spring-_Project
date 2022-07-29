package org.egitim.springboot.controller.rest;

import java.util.List;

import org.egitim.springboot.data.entity.Kisi;
import org.egitim.springboot.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/egitim/sorgu/kisi")
public class KisiRestController {
	

		@Autowired private KisiService kisiService;
		
		@GetMapping("/tumliste")
		public List<Kisi>  getAllKisi() {
			return kisiService.tumunuListele();	
		}
		@GetMapping("/tckimlikno/{tckimlikno}")
		public String getByTcKimlikNo(@PathVariable("tckimlikno") String tcKimlikNo) {
			return kisiService.findByTcKimlikNo(tcKimlikNo).get().getViewString();	
		}
		
		@GetMapping("/ad/{ad}")
		public List<Kisi>  getByAd(@PathVariable("ad") String Ad) {
			return kisiService.findByAd(Ad);	
		}
		
		@PostMapping
		public void insertKisi(Model model) {
			//Insert to database
		}
}
