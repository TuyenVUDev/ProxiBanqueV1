package com.formation.domaine;

public class Compte {

	private float solde;
	private int numDeCompte;
	private String dateOuverture;
	private int tel;
	
	public Compte(float solde, int numDeCompte, String dateOuverture, int tel) {
		super();
		this.solde = solde;
		this.numDeCompte = numDeCompte;
		this.dateOuverture = dateOuverture;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Compte [solde=" + solde + ", numDeCompte=" + numDeCompte + ", dateOuverture=" + dateOuverture + ", tel="
				+ tel + "]";
	}
	
	
	
	
}
