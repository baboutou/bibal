package com.bibal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bibal.service.UsagerSER;

@Configuration
@Controller
@EnableAutoConfiguration
@ComponentScan
public class UsagerCNTRL {
/*
	@Autowired
	private UsagerSER  usagerService;


	@RequestMapping("/AfficherLesUsagers")
	public String ListeUsagers(Model model) {
		List<UsagerSER> usagers = usagerService.findAll();
		model.addAttribute("allUsagers", usagers);
		return "ListeUsagers";
	}

	@RequestMapping("/AjouterUsager")
	public String ajouterUsager(@RequestParam("NomUsager") String nom, @RequestParam("prenomUsager") String prenom,
			@RequestParam("adresse") String adresse, @RequestParam("email") String email) {
		usagerService.ajouter(nom, prenom, adresse, email);
		return "redirect:AfficherLesUsagers";
	}

	@RequestMapping("/ModifierUsager")
	public String updateUsager(@RequestParam("NomUsager") String nom, @RequestParam("prenomUsager") String prenom,
			@RequestParam("adresse") String adresse, @RequestParam("email") String email) {
		usagerService.modifier(nom, prenom, adresse, email);
		return "redirect:AfficherLesUsagers";
	}

	@RequestMapping(value = "/ChercherUsager", method = RequestMethod.GET)
	public List<com.bibal.service.UsagerSER> chercher(@RequestParam("nom") String nom, Model model) {
		List<UsagerSER> Lesusagers = usagerService.chercher(nom);
		model.addAttribute("usagers", Lesusagers);
		return Lesusagers;
	}*/
}
