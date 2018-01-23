package com.bibal.service.Impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bibal.Repository.EmpruntRepo;
import com.bibal.classes.Emprunt;
import com.bibal.service.ExemplaireSER;
import com.bibal.service.UsagerSER;



@Service
@Transactional

public class EmpruntIMPL { //implements EmpruntRepo {

/*
	@Autowired
	private EmpruntRepo empruntRepository;
	@Autowired
	private Usager usagerService;
	@Autowired
	private Exemplaire exemplaireService;
	private Date date = new Date();


	//@Override
	public void CreerEmprunt(int idUsager, int idExemplaire)
	{
		Usager usager = usagerService.getById(idUsager);
		Exemplaire exemplaire = exemplaireService.getById(idExemplaire);
		empruntRepository.save(new Emprunt(usager, exemplaire));
	}


*/
}
