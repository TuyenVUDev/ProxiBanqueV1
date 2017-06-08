package com.formation.domaine;

public abstract class Client extends Personne {
	
	// proprietes
	private String adresse;
	private String ville;
	private int codePostal;
	private Compte compte;

	// getters/setters
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	// constructeur
	
	public Client(String adresse, String ville, int codePostal, Compte compte) {
		super();
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.compte = compte;
	}
	public Client(String adresse, String ville, int codePostal) {
		super();
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.compte = null;
	}
	public Client(String adresse, String ville) {
		super();
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = 0;
		this.compte = null;
	}
	public Client(String adresse) {
		super();
		this.adresse = adresse;
		this.ville = "inconnu";
		this.codePostal = 0;
		this.compte = null;
	}
	public Client() {
		super();
		this.adresse = "inconnu";
		this.ville = "inconnu";
		this.codePostal = 0;
		this.compte = null;
	}
	

}
