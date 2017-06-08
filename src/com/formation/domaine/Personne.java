package com.formation.domaine;

public abstract class Personne {
	//propriete
	private String nom;
	private String prenom;
	
	//getter/setter
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
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom) {
		super();
		this.nom = nom;
		this.prenom = "inconnu";
	}
	public Personne() {
		super();
		this.nom = "inconnu";
		this.prenom = "inconnu";
	}
	
}
