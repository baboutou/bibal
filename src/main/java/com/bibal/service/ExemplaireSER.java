package com.bibal.service;

import java.util.List;

import com.bibal.classes.Oeuvre;


public interface ExemplaireSER {

	public void ajouter(ExemplaireSER exemplaire);
	public List<ExemplaireSER> identifier(Oeuvre oeuvre);
	public ExemplaireSER getById(int id);
	public void modifieretat(String etatExemplaire,int idExemplaire);
	public List<ExemplaireSER> getAllExemplaires();
}
