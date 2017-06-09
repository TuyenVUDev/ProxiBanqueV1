package com.formation.domaine;

/**
 * 
 * 
 * 
 * Classe dans l'architecture domaine, classe heritee de Compte @see Compte Est
 * destine aux placement et utilis dans la methode gererPatrimoine
 * dans @CompteService
 */

public class ComptePlacement extends Compte {

	private String villeDePlacement;

	/**
	 * 
	 *
	 * @param ville
	 *            Defini dans quelle ville se fera le placement
	 */
	// Constructeur
	public ComptePlacement(float solde, int numDeCompte, String dateOuverture, int tel, String ville) {
		super(0, numDeCompte, dateOuverture, tel);
		this.villeDePlacement = ville;
	}
	//ToString
	@Override
	public String toString() {
		return "ComptePlacement [villeDePlacement=" + villeDePlacement + ", solde=" + solde + ", numDeCompte="
				+ numDeCompte + ", dateOuverture=" + dateOuverture + ", tel=" + tel + ", carte=" + carte + "]";
	}

}
