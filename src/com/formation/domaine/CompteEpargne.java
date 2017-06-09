package com.formation.domaine;

/**
 * 
 * 
 * 
 * Classe dans l'architecture domaine, classe heritee de Compte @see Compte
 *  Possede un taux de remunaration de base de 3%
 */

public class CompteEpargne extends Compte{

	private float tauxDeRemuneration = 3;
	
	//Constructeur
	public CompteEpargne(float solde, int numDeCompte, String dateOuverture, int tel) {
		super(solde, numDeCompte, dateOuverture, tel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CompteEpargne [tauxDeRemuneration=" + tauxDeRemuneration + ", solde=" + solde + ", numDeCompte="
				+ numDeCompte + ", dateOuverture=" + dateOuverture + ", tel=" + tel + ", carte=" + carte + "]";
	}

	

	
	
	
}
