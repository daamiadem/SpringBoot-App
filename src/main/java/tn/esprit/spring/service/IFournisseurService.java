package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.dao.entity.Fournisseur;


public interface IFournisseurService {
	public List <Fournisseur> retrieveAllProduit(); 
	public Fournisseur addFournisseur(Fournisseur p); 
	public void deleteFournisseur (Long id); 
	public Fournisseur UpdateFournisseur (Fournisseur p) ; 
	public Fournisseur retrieveFournisseur(Long id ); 
}
