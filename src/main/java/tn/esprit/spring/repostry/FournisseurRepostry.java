package tn.esprit.spring.repostry;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.dao.entity.Fournisseur;

public interface FournisseurRepostry extends CrudRepository<Fournisseur, Long> {

}
