package com.bibal.classes;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.bibal.entities.EtatExemplaire;




@Entity
public class Exemplaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idExemplaire;
	private Date dateAchatExemplaire;
	private String etatExemplaire;
	private int datePéremption;
	private boolean disponible;

	@ManyToOne
	@JoinColumn(name = "idOeuvre")
	Oeuvre oeuvre;


	@OneToMany
	@JoinColumn(name = "idExemplaire", referencedColumnName = "idExemplaire")
	private List<Emprunt> listEmprunts;

	public Exemplaire()
	{
		this.etatExemplaire = EtatExemplaire.Bon.toString();
	}

	public int getIdExemplaire() {
		return idExemplaire;
	}

	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}

	public Date getDateAchatExemplaire() {
		return dateAchatExemplaire;
	}

	public List<Emprunt> getListEmprunts() {
		return listEmprunts;
	}

	public void setListEmprunts(List<Emprunt> listEmprunts) {
		this.listEmprunts = listEmprunts;
	}

	public void setDateAchatExemplaire(Date dateAchatExemplaire) {
		this.dateAchatExemplaire = dateAchatExemplaire;
	}

	public String getEtatExemplaire() {
		return etatExemplaire;
	}

	public void setEtatExemplaire(String etatExemplaire) {
		this.etatExemplaire = etatExemplaire;
	}

	public int getDatePéremption() {
		return datePéremption;
	}

	public void setDatePéremption(int datePéremption) {
		this.datePéremption = datePéremption;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Oeuvre getOeuvre() {
		return oeuvre;
	}

	public void setOeuvre(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
	}

	public List<Emprunt> getListEmprunts1()
	{
		return listEmprunts;
	}

	public Exemplaire(String etatExemplaire, Oeuvre oeuvre)
	{
		this.etatExemplaire = etatExemplaire;
		this.oeuvre = oeuvre;
	}



}
