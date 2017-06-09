package com.formation.domaine;

public class Compte {

	protected float solde;
	protected int numDeCompte;
	protected String dateOuverture;
	protected int tel;

	public Compte(float solde, int numDeCompte, String dateOuverture, int tel) {
		super();
		this.solde = solde;
		this.numDeCompte = numDeCompte;
		this.dateOuverture = dateOuverture;
		this.tel = tel;
	}

	public Compte() {
		super();
		this.solde = 0;
		this.numDeCompte = 000000;
		this.dateOuverture = "Pas encore";
		this.tel = 000;
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
