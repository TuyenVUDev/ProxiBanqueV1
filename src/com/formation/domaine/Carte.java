package com.formation.domaine;

public abstract class   Carte {
private CompteCourant comptecourant;
private int numeroCarte;


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
