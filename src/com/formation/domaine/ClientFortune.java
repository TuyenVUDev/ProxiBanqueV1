package com.formation.domaine;

public class ClientFortune extends ClientNormal {

	// constructeur
	public ClientFortune() {
		super();
		
		
		// TODO Auto-generated constructor stub
	}
	public ClientFortune(String adresse, String ville,
			int codePostal, Compte compte, String typeClient) {
		super();
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.compte = compte;
		this.typeClient = typeClient;
	}

}
