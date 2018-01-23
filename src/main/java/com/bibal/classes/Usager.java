package com.bibal.classes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Usager implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUsager;
	private String NomUsager;
	private String prenomUsager;
	private String adresse;
	private String email;

	public String getNomUsager() {
		return NomUsager;
	}
	public void setNomUsager(String nomUsager) {
		NomUsager = nomUsager;
	}
	public String getPrenomUsager() {
		return prenomUsager;
	}
	public void setPrenomUsager(String prenomUsager) {
		this.prenomUsager = prenomUsager;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public List<Reservation> getListReservations() {
		return listReservations;
	}
	public void setListReservations(List<Reservation> listReservations) {
		this.listReservations = listReservations;
	}
	public List<Emprunt> getListEmprunts() {
		return listEmprunts;
	}
	public void setListEmprunts(List<Emprunt> listEmprunts) {
		this.listEmprunts = listEmprunts;
	}
	private String telephone;


	@OneToMany
	@JoinColumn(name="idUsager",referencedColumnName="idUsager")
	private List<Reservation> listReservations;

	@OneToMany
	@JoinColumn(name="idUsager", referencedColumnName="idUsager")
	private List<Emprunt> listEmprunts;

	public Usager()
	{

	}
	public Usager(String nom,String prenom,String adr,String email,String tele)
	{
		super();
		 NomUsager=nom;
		 prenomUsager=prenom;
		 adresse=adr;
		 this.email=email;
		 telephone=tele;
	}

}
