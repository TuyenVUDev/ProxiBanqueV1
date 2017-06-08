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
		this.setCompteDebite(compteDebite);
	}

	@Override
	public String toString() {
		return "Transaction [montant=" + montant + ", compteCredite=" + compteCredite + ", compteCredite2="
				+ getCompteDebite() + "]";
	}

	public Compte getCompteDebite() {
		return compteDebite;
	}

	public void setCompteDebite(Compte compteDebite) {
		this.compteDebite = compteDebite;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Compte getCompteCredite() {
		return compteCredite;
	}

	public void setCompteCredite(Compte compteCredite) {
		this.compteCredite = compteCredite;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

}
