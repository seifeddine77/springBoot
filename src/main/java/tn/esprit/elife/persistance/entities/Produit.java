package tn.esprit.elife.persistance.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Entity;

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

public class Produit implements Serializable {
	
	
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	@Column(name="idPRoduit") 
    Long idProduit; // Clé primaire 
	String codeProduit;  
	String libelleProduit;  
    float prixUnitiare;
   @ManyToOne
   Rayon rayon;
   @ManyToOne
   Stock stock;
   
   @OneToMany(cascade = CascadeType.ALL, mappedBy="produit")
   List<detailFacture> detailFactures;
   @OneToOne
   detailProduit detailProduit;
   
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name="FK_FD_ID")
   private Fournisseur fournisseur;
   @ManyToMany(cascade = CascadeType.ALL)
   private Set<Fournisseur> fournisseursPrdts;
	
   
	
}