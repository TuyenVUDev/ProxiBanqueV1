package com.formation.domaine;

/**
 * 
 * 
 *
 * Classe dans l'architecture domaine, classe abstraite des cartes de credits
 * 
 * 
 */


public abstract class   Carte {
	//propriete
private CompteCourant comptecourant;
private int numeroCarte;
/**
 * 
 * @param comptecourant Carte compose CompteCourant
 * @param numeroCarte numero de carte
 */

//Constructeurs
public Carte(CompteCourant comptecourant, int numeroCarte) {
	super();
	this.comptecourant = comptecourant;
	this.numeroCarte = numeroCarte;
}


@Override
public String toString() {
	return "Carte [comptecourant=" + comptecourant + ", numeroCarte=" + numeroCarte + "]";
}





	
}
