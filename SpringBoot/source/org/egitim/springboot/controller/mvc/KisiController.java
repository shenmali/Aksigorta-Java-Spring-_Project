package org.egitim.springboot.controller.mvc;

import org.egitim.springboot.controller.rest.KisiRestController;
import org.egitim.springboot.data.entity.Kisi;
import org.egitim.springboot.service.KisiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KisiController {
	
	@Autowired KisiService kisiService;
	@Autowired KisiRestController kisiRestController;
	
	@GetMapping("/islem/kisitumlistenavigate")
	public String getKisiTumListe(Model model) {
		model.addAttribute("kisiTumListeAttribute",kisiService.tumunuListele());
		return "kisiList";
	}
	
	@GetMapping("/islem/kisieklenavigate")
	public String getKisiEkle(Kisi kisi) {
		return "kisiEkle";
	}
	
	@PostMapping("/islem/insertkisi")
	public String insertKisi(Kisi kisi) {
		kisiService.insertKisi(kisi);
		return "redirect:/islem/kisitumlistenavigate";
		}
	@GetMapping("/islem/deletekisi/{id}")
	public String deleteKisi(@PathVariable("id") String id) {
		kisiService.deleteKisi(id);
		return "redirect:/islem/kisitumlistenavigate";
		}
	
	/*@GetMapping("/islem/kisitumlisterest")
	public String getKisiTumListeRest(Model model) {
		model.addAttribute("kisiTumListeAttribute", kisiRestController.getAllKisi());
		return "";
	}*/
	
}
