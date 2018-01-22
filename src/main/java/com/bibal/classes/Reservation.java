package com.bibal.classes;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.bibal.entities.EtatReservation;



@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRéservation;
	private Date dateReservation;
	private String etatReservation;


	public int getIdRéservation() {
		return idRéservation;
	}

	public void setIdRéservation(int idRéservation) {
		this.idRéservation = idRéservation;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public String getEtatReservation() {
		return etatReservation;
	}

	public void setEtatReservation(String etatReservation) {
		this.etatReservation = etatReservation;
	}

	public Usager getUser() {
		return user;
	}

	public void setUser(Usager user) {
		this.user = user;
	}

	public Oeuvre getOeuvre() {
		return oeuvre;
	}

	public void setOeuvre(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
	}

	@ManyToOne
	@JoinColumn(name = "idUsager")
	private Usager user;
	@ManyToOne
	@JoinColumn(name = "idOeuvre")
	private Oeuvre oeuvre;

	public Reservation()
	{
		// TODO Auto-generated constructor stub
	}

	public Reservation(Date date)
	{
		dateReservation=date;
		etatReservation=EtatReservation.Cree.toString();
	}

	public Reservation(Date date, Usager user, Oeuvre oeuvre)
	{
		this.dateReservation= date;
		this.user = user;
		this.oeuvre = oeuvre;
		this.etatReservation = EtatReservation.Cree.toString();
	}

	public void annulerReservation()
	{
		this.etatReservation = EtatReservation.Annulee.toString();
	}

}
