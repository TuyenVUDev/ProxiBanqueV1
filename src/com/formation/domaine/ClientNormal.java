package com.formation.domaine;
/**
 * 
 * 
 *
 * Classe dans l'architecture domaine, classe heritee de Client,
 *         est destine aux clients riches. Est utilise dans @conseillerClientService
 *  Nous rappelons compte1 = compteCourant et compte2 = compte epargne
 * 
 */



public class ClientNormal extends Client {

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
