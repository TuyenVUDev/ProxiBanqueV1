package com.formation.domaine;
/**
 * 
 * Classe  abstraite Personne
 *Servira a definir le nom et le prenom des personnes
 */



public abstract class Personne {

	protected String nom;
	protected String prenom;
	
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
