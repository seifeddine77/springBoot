package tn.esprit.elife.persistance.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class detailFacture implements Serializable {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	@Column(name="idDetailFacture") 
	Long idDetailFacture;
	Integer qte ;
	Float prixTotal ;
	Integer pourcentageRemise;
	Integer montantRemise;
	
	
	@ManyToOne
	Produit produit;
	@ManyToOne
	Facture facture;
}
