package tn.esprit.elife.persistance.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public class detailProduit implements Serializable {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	@Column(name="idDetailProduit")
Long idDetailProduit;
@Temporal(TemporalType.DATE) 
Date dateCreation ;
@Temporal(TemporalType.DATE)
Date dateDerniereModification;
@Enumerated(EnumType.STRING)
CategorieProduit categorieProduit;
@OneToOne(mappedBy="detailProduit")
Produit produit;


}
