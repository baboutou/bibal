package com.bibal.classes;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Magazine extends Oeuvre {

	//@Id erreur
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//private int idMagazine;

	public Magazine()
	{
		super();
	}

	public Magazine(String titreoeuvre,Date dateParution,Date DateAchatOeuvre)
	{
		super(titreoeuvre,dateParution,DateAchatOeuvre);
	}


}
