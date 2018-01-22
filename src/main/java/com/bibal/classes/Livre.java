package com.bibal.classes;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Livre extends Oeuvre {

	//@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	/*private int idLivre;
	public int getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}*/

	public String getAuteur() {
		return Auteur;
	}

	public void setAuteur(String auteur) {
		Auteur = auteur;
	}

	private String Auteur;

	public Livre()
	{
		super();
	}

	public Livre(String Au,String titreoeuvre,Date dateParution,Date DateAchatOeuvre)
	{
		super(titreoeuvre,dateParution,DateAchatOeuvre);
		Auteur=Au;
	}

}
