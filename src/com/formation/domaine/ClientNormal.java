package com.formation.domaine;

public class ClientNormal extends Client {

//	// constructeur
//	public ClientNormal(String nom, String prenom, String adresse, String ville, int codePostal, Object object, String typeClient) {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	/**
	 * 
	 */


	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param ville
	 * @param codePostal
	 * @param compte1
	 * @param compte2
	 * @param typeClient
	 */
	public ClientNormal(String nom, String prenom, String adresse, String ville, int codePostal, Compte compte1,
			Compte compte2, String typeClient) {
		super(nom, prenom, adresse, ville, codePostal, compte1, compte2, typeClient);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ClientNormal [adresse=" + adresse + ", ville=" + ville + ", codePostal=" + codePostal + ", compte1="
				+ compte1 + ", compte2=" + compte2 + ", typeClient=" + typeClient + ", nom=" + nom + ", prenom="
				+ prenom + ", getAdresse()=" + getAdresse() + ", getVille()=" + getVille() + ", getCodePostal()="
				+ getCodePostal() + ", getCompte1()=" + getCompte1() + ", getCompte2()=" + getCompte2()
				+ ", getTypeClient()=" + getTypeClient() + ", toString()=" + super.toString() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	/**
	 * 
	 */
	public ClientNormal() {
		super();
		// TODO Auto-generated constructor stub
	}


}
