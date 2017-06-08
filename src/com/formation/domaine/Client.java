package com.formation.domaine;

public abstract class Client extends Personne {
	
	// proprietes
	private String adresse;
	private String ville;
	private int codePostal;
	private Compte compte;
	private String typeClient;

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

	
	
	
	@Override
	public String toString() {
		return "Client [adresse=" + adresse + ", ville=" + ville + ", codePostal=" + codePostal + ", compte=" + compte
				+ ", typeClient=" + typeClient + "]";
	}

	// constructeur
	public Client() {
		super();
	}

}
