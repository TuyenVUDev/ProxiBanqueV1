package com.formation.domaine;

import java.util.Collection;

public class Conseiller extends Personne {

	// proprietes
	private Collection<Client> listeClientConseilles;
	private Collection<Transaction> listeTransactions;
	private int nbClientMax;

	// getters/setters
	public Collection<Client> getListeClientConseilles() {
		return listeClientConseilles;
	}

	public void setListeClientConseilles(Collection<Client> listeClientConseilles) {
		this.listeClientConseilles = listeClientConseilles;
	}

	public Collection<Transaction> getListeTransactions() {
		return listeTransactions;
	}

	public void setListeTransactions(Collection<Transaction> listeTransactions) {
		this.listeTransactions = listeTransactions;
	}

	public int getNbClientMax() {
		return nbClientMax;
	}

	public void setNbClientMax(int nbClientMax) {
		this.nbClientMax = nbClientMax;
	}

	// constructeur
	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}

}
