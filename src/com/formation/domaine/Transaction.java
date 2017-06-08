package com.formation.domaine;

public class Transaction {

	private Client client;
	private float montant;
	private Compte compteCredite, compteDebite;
	public Transaction(Client client, float montant, Compte compteCredite, Compte compteDebite) {
		super();
		this.client = client;
		this.montant = montant;
		this.compteCredite = compteCredite;
		this.compteDebite = compteDebite;
	}
	@Override
	public String toString() {
		return "Transaction [montant=" + montant + ", compteCredite=" + compteCredite + ", compteCredite2="
				+ compteDebite + "]";
	}
	
	
	
}
