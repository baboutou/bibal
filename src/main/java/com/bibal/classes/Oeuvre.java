package com.bibal.classes;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Oeuvre {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idOeuvre;
	private String titreOeuvre;
	private Date dateParution;
	private Date dateAchatOeuvre;
	private int NbExemplaires;


	public int getIdOeuvre() {
		return idOeuvre;
	}

	public void setIdOeuvre(int idOeuvre) {
		this.idOeuvre = idOeuvre;
	}

	public String getTitreOeuvre() {
		return titreOeuvre;
	}

	public void setTitreOeuvre(String titreOeuvre) {
		this.titreOeuvre = titreOeuvre;
	}

	public Date getDateParution() {
		return dateParution;
	}

	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	public Date getDateAchatOeuvre() {
		return dateAchatOeuvre;
	}

	public void setDateAchatOeuvre(Date dateAchatOeuvre) {
		this.dateAchatOeuvre = dateAchatOeuvre;
	}

	public int getNbExemplaires() {
		return NbExemplaires;
	}

	public void setNbExemplaires(int nbExemplaires) {
		NbExemplaires = nbExemplaires;
	}

	public List<Reservation> getListeReservations() {
		return listeReservations;
	}

	public void setListeReservations(List<Reservation> listeReservations) {
		this.listeReservations = listeReservations;
	}

	public List<Exemplaire> getListeExemplaires() {
		return listeExemplaires;
	}

	public void setListeExemplaires(List<Exemplaire> listeExemplaires) {
		this.listeExemplaires = listeExemplaires;
	}

	public Oeuvre(String titreoeuvre,Date dateParution,Date DateAchatOeuvre)
	{
		this.titreOeuvre=titreoeuvre;
		this.dateParution=dateParution;
		this.dateAchatOeuvre=DateAchatOeuvre;
		NbExemplaires=10;
	}

	public Oeuvre()
	{

	}

	@OneToMany
	@JoinColumn(name="idOeuvre", referencedColumnName="idOeuvre")
	private List<Reservation> listeReservations;

	@OneToMany
	@JoinColumn(name="idOeuvre", referencedColumnName="idOeuvre")
	private List<Exemplaire> listeExemplaires;



}
