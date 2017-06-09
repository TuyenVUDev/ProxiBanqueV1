package com.formation.domaine;

public class ClientNormal extends Client {

//	// constructeur
//	public ClientNormal(String nom, String prenom, String adresse, String ville, int codePostal, Object object, String typeClient) {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public ClientNormal(String nom, String prenom, String adresse, String ville, int codePostal, Compte compte, String typeClient) {
		this.nom=nom;
		this.prenom=prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.compte = compte;
		this.typeClient = typeClient;
	}

	/**
	 * 
	 */
	public ClientNormal() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adresse
	 * @param ville
	 * @param codePostal
	 * @param compte
	 * @param typeClient
	 */
	public ClientNormal(String adresse, String ville, int codePostal, Compte compte, String typeClient) {
		super(adresse, ville, codePostal, compte, typeClient);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adresse
	 * @param ville
	 * @param codePostal
	 * @param compte
	 */
	public ClientNormal(String adresse, String ville, int codePostal, Compte compte) {
		super(adresse, ville, codePostal, compte);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adresse
	 * @param ville
	 * @param codePostal
	 */
	public ClientNormal(String adresse, String ville, int codePostal) {
		super(adresse, ville, codePostal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adresse
	 * @param ville
	 */
	public ClientNormal(String adresse, String ville) {
		super(adresse, ville);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param adresse
	 */
	public ClientNormal(String adresse) {
		super(adresse);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ClientNormal [adresse=" + adresse + ", ville=" + ville
				+ ", codePostal=" + codePostal + ", compte=" + compte
				+ ", typeClient=" + typeClient + ", nom=" + nom + ", prenom="
				+ prenom + "]";
	}

}
