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



public class ClientFortune extends ClientNormal {

// Constructeurs
	public ClientFortune(String nom, String prenom, String adresse, String ville, int codePostal, Compte compte1,
			Compte compte2, String typeClient) {
		super(nom, prenom, adresse, ville, codePostal, compte1, compte2, typeClient);
	}

	public ClientFortune() {
		super();}
		// TODO Auto-generated constructor stub
	
	@Override
	public String toString() {
		return "ClientFortune [adresse=" + adresse + ", ville=" + ville + ", codePostal=" + codePostal + ", compte1="
				+ compte1 + ", compte2=" + compte2 + ", typeClient=" + typeClient + ", nom=" + nom + ", prenom="
				+ prenom + ", toString()=" + super.toString() + ", getAdresse()=" + getAdresse() + ", getVille()="
				+ getVille() + ", getCodePostal()=" + getCodePostal() + ", getCompte1()=" + getCompte1()
				+ ", getCompte2()=" + getCompte2() + ", getTypeClient()=" + getTypeClient() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
}
