package com.formation.domaine;

/**
 * 
 * 
 * 
 * Classe dans l'architecture domaine, classe heritee de Compte @see Compte Est
 * destine aux clients Fortunes
 */

public class CompteFortune extends Compte {

	// Constructeurs
	public CompteFortune(float solde, int numDeCompte, String dateOuverture, int tel) {
		super(solde, numDeCompte, dateOuverture, tel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CompteFortune [solde=" + solde + ", numDeCompte=" + numDeCompte + ", dateOuverture=" + dateOuverture
				+ ", tel=" + tel + ", carte=" + carte + "]";
	}

}
