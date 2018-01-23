package com.bibal.service;

import java.util.List;


public interface UsagerSER {

	public void ajouter(String nom, String prenom, String adresse, String mail);
	public UsagerSER getById(int idUsager);
	public List<UsagerSER> findAll();
	public List<UsagerSER> chercher(String nom);
	public UsagerSER modifier(String nom, String prenom, String adresse, String mail);


}
