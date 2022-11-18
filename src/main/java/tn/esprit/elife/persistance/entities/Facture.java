package tn.esprit.elife.persistance.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
public class Facture  implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	@Column(name="idFacture") 
	Long idFacture;
	Float montantRemise;
	Float MontantFacture;
	@Temporal(TemporalType.DATE) 
	Date dateFacture ;
	Boolean active;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="facture")
 Set<detailFacture> detailFactures;
 @ManyToOne
 Client client;
}
