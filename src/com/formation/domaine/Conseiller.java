package com.formation.domaine;

import java.util.ArrayList;

public class Conseiller extends Personne {

	// proprietes
	private ArrayList<Client> listeClientConseilles;
	private ArrayList<Transaction> listeTransactions;
	private int nbClientMax=10;
	
	
	
	// getters/setters
	public ArrayList<Client> getListeClientConseilles() {
		return listeClientConseilles;
	}

	public void setListeClientConseilles(ArrayList<Client> listeClientConseilles) {
		this.listeClientConseilles = listeClientConseilles;
	}

	public ArrayList<Transaction> getListeTransactions() {
		return listeTransactions;
	}

	public void setListeTransactions(ArrayList<Transaction> listeTransactions) {
		this.listeTransactions = listeTransactions;
	}

	public int getNbClientMax() {
		return nbClientMax;
	}

	public void setNbClientMax(int nbClientMax) {
		this.nbClientMax = nbClientMax;
	}

	@Override
	public String toString() {
		return "Conseiller [listeClientConseilles=" + listeClientConseilles
				+ ", listeTransactions=" + listeTransactions + ", nbClientMax="
				+ nbClientMax + "]";
	}

	// constructeur
	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}

}
