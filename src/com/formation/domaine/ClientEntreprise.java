package com.formation.domaine;

public class ClientEntreprise extends Client {

	// proprietes
	private String nomEntreprise;

	// getters/setters
	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	// constructeur
	public ClientEntreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClientEntreprise(String adresse, String ville,
			int codePostal, Compte compte, String typeClient) {
		super();
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.compte = compte;
		this.typeClient = typeClient;
	}
}
