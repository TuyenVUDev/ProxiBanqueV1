package com.formation.domaine;

/**
 * 
 * 
 * Classe dans l'architecture domaine, classe heritee des cartes de credits
 * @see Carte
 * 
 * 
 */



public class CarteElectron extends Carte{
	/**
	 * 
	 * @param comptecourant @see Carte
	 * @param numeroCarte see Carte
	 */

		//Constructeur
	public CarteElectron(CompteCourant comptecourant, int numeroCarte) {
		super(comptecourant, numeroCarte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CarteElectron [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

	
	
	
}
