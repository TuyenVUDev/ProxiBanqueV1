package com.formation.domaine;

/**
 * 
 * 
 * 
 * Classe dans l'architecture domaine, classe heritee de Compte,
 *         est le compte "standard" 
 *  Possede une limite de decouver t
 */


public class CompteCourant extends Compte {

	private float decouvert = 1000;

	// Constructeur
	public CompteCourant(float solde, int numDeCompte, String dateOuverture, int tel) {
		super(solde, numDeCompte, dateOuverture, tel);
	}

	public CompteCourant() {
		super();
	}
	//ToString

	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + ", solde=" + solde + ", numDeCompte=" + numDeCompte
				+ ", dateOuverture=" + dateOuverture + ", tel=" + tel + ", carte=" + carte + " et un decouvert de " + decouvert + "]";
	}
	
	

	/*
	 * Nous construisons un CompteCourant avec la surcharge de constructeur.
	 * Problème, les valeurs de solde, numDeCompte, dateOuverture, tel, ne sont pas
	 * des caractéristiques de CompteCourant, je ne peux pas les getter et setter
	 * Solution 1) redéclararer en private des variables et les utiliser dans le
	 * constructeur et utiliser des getters et setters Pb : autant rendre les
	 * attributs de compte protected, mais il doit bien y avoir un autre moyen?
	 * 
	 * 
	 */

}
