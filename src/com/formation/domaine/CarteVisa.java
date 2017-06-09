package com.formation.domaine;

/**
 * 
 * 
 * Classe dans l'architecture domaine, classe heritee des cartes de credits
 * @see Carte
 * 
 * 
 */


public class CarteVisa extends Carte{

	
	
	public CarteVisa(CompteCourant comptecourant, int numeroCarte) {
		super(comptecourant, numeroCarte);
		// TODO Auto-generated constructor stub
	}
	/**
	 * n'a pas encore de difference avec carteElectron, sera bientot utilisee
	 * 
	 */

	@Override
	public String toString() {
		return "CarteVisa [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}


	
}
