package tn.esprit.spring.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table( name ="Fournisseur")
public class Fournisseur  implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idFournisseur")
	private long idFournisseur; //clé primaire
	private String codeFournisseur;
	private String libelleFournisseur;
	private String adresseFournisseur;
	private String numtel;
	private String dateCreation;
	private String categorieProduit;
	
	public long getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getCodeFournisseur() {
		return codeFournisseur;
	}
	public void setCodeFournisseur(String codeFournisseur) {
		this.codeFournisseur = codeFournisseur;
	}
	public String getLibelleFournisseur() {
		return libelleFournisseur;
	}
	public void setLibelleFournisseur(String libelleFournisseur) {
		this.libelleFournisseur = libelleFournisseur;
	}
	public String getNumtel() {
		return numtel;
	}
	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}
	public String getAdresseFournisseur() {
		return adresseFournisseur;
	}
	public void setAdresseFournisseur(String adresseFournisseur) {
		this.adresseFournisseur = adresseFournisseur;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getCategorieProduit() {
		return categorieProduit;
	}
	public void setCategorieProduit(String categorieProduit) {
		this.categorieProduit = categorieProduit;
	}
	
	

}
