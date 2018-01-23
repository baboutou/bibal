package com.bibal.service;

import java.util.Date;
import java.util.List;


public interface MagazineSER {

	public MagazineSER ajouter(String titreoeuvre,Date dateParution,Date DateAchatOeuvre);
	public List<MagazineSER> findAll();
	public MagazineSER getById(int id);
	public void modifier(String titreoeuvre,Date dateParution,Date DateAchatOeuvre);

}
