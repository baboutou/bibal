package com.bibal.service;

import java.util.Date;
import java.util.List;


public interface LivreSER {

	public LivreSER ajouter(String Au,String titreoeuvre,Date dateParution,Date DateAchatOeuvre);
	public List<LivreSER> findAll();
	public LivreSER getById(int id);
	public void modifier(String Au,String titreoeuvre,Date dateParution,Date DateAchatOeuvre);

}
