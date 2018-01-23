package com.bibal.classes;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Livre extends Oeuvre {



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
