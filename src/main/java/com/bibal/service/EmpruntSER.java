package com.bibal.service;

import java.util.List;


public interface EmpruntSER {

	public void CreerEmprunt(int idUsager, int idExemplaire);
	public void rendreExemplaire(String etatExemplaire, int idExemplaire);
	public String getDisponibilite(int idExemplaire);
}
