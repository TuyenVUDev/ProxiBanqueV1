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

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public int getNumDeCompte() {
		return numDeCompte;
	}

	public void setNumDeCompte(int numDeCompte) {
		this.numDeCompte = numDeCompte;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	
	
	
	
}
