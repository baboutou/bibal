package com.bibal.classes;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.bibal.service.ExemplaireSER;
import com.bibal.service.UsagerSER;

@Entity
public class Emprunt {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEmprunt;
	private Date dateEmprunt;
	private Date dateRetour;
	private Date dateRetourEffectif;
	private boolean etatExemplaireRetour;

	@ManyToOne
	@JoinColumn(name="idUsager")
	private UsagerSER usager;

	@ManyToOne
	@JoinColumn(name="idExemplaire")
	private ExemplaireSER exemplaire;

	public Emprunt() {
		// TODO Auto-generated constructor stub
	}

	/*public Emprunt(Usager usager, Exemplaire exemplaire) {
		this.usager=usager;
		this.exemplaire=exemplaire;
		this.dateEmprunt=new Date();
		this.dateRetour=new Date();
	}*/

	public Emprunt(UsagerSER usager2, ExemplaireSER exemplaire2) {
		// TODO Auto-generated constructor stub
		this.usager=usager;
		this.exemplaire=exemplaire;
		this.dateEmprunt=new Date();
		this.dateRetour=new Date();
	}

	public int getIdEmprunt() {
		return idEmprunt;
	}

	public void setIdEmprunt(int idEmprunt) {
		this.idEmprunt = idEmprunt;
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public Date getDateRetourEffectif() {
		return dateRetourEffectif;
	}

	public void setDateRetourEffectif(Date dateRetourEffectif) {
		this.dateRetourEffectif = dateRetourEffectif;
	}

	public boolean isEtatExemplaireRetour() {
		return etatExemplaireRetour;
	}

	public void setEtatExemplaireRetour(boolean etatExemplaireRetour) {
		this.etatExemplaireRetour = etatExemplaireRetour;
	}

	public UsagerSER getUsager() {
		return usager;
	}

	public void setUsager(UsagerSER usager) {
		this.usager = usager;
	}

	public ExemplaireSER getExemplaire() {
		return exemplaire;
	}

	public void setExemplaire(ExemplaireSER exemplaire) {
		this.exemplaire = exemplaire;
	}



}
