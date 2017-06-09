package com.formation.domaine;

/**
 * 
 * @author alex
 *
 *         la classe mere des Comptes, defini les catacteristiques principales des Comptes
 *
 */

public class Compte {

	
	
	
	protected float solde = 0;
	protected int numDeCompte;
	protected String dateOuverture;
	protected int tel;
	protected Carte carte;
/**
 * 
 * @param solde l'argent sur le compte
 * @param numDeCompte le numero du compte, unique
 * @param dateOuverture la date d'ouverture du compte
 * @param tel le telephone du compte
 * @param carte le type de carte dans le compte
 */
	
	//Constructeurs  
	
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

	
	//ToString
	@Override
	public String toString() {
		return "Compte [solde=" + solde + ", numDeCompte=" + numDeCompte + ", dateOuverture=" + dateOuverture + ", tel="
				+ tel + "]";
	}

	//Getters et setters  
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
