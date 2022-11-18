package tn.esprit.elife.persistance.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity 
@Table( name = "Table_client") 
public class Client implements Serializable { 
@Id 
@GeneratedValue (strategy = GenerationType.IDENTITY) 
@Column(name="idClient") 
private Long id; // Clé primaire 
private String nom;  
private String prenom;  
private String email;  
private String password;  
@Temporal(TemporalType.DATE) 
private Date dateNaissance; 
@Enumerated(EnumType.STRING)
private Profession profession; 
@Enumerated(EnumType.STRING) 
private CategorieClient categorieClient; 
// Constructeur et accesseurs (getters) et mutateurs (setters) 
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Date getDateNaissance() {
	return dateNaissance;
}
public void setDateNaissance(Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}
public Client(Long id, String nom, String prenom, String email, String password, Date dateNaissance) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.password = password;
	this.dateNaissance = dateNaissance;
}
public Client() {
	super();
}
@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
List<Facture> factures;

}
