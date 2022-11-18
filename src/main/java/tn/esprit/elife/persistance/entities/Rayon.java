package tn.esprit.elife.persistance.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Rayon implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	@Column(name="idRayon") 
	Long idRayon ;
	String codeRayon ;
	String libelleRayon ;
	
 
	@OneToMany(cascade = CascadeType.ALL, mappedBy="rayon")
 Set<Produit> produits;

}
