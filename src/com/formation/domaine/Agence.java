package com.formation.domaine;

import java.util.Collection;

/**
 * 
 * 
 * 
 * Classe dans l'architecture domaine, caracterise les agence
 * 
 * 
 */

public class Agence {

	// proprietes
	public String idAgence; // 5 caracteres alphanum
	public Gerant gerant;
	protected Collection<Client> listeClientsAgence;

	//	getters/setters
	public String getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(String idAgence) {
		this.idAgence = idAgence;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public Collection<Client> getListeClientsAgence() {
		return listeClientsAgence;
	}

	public void setListeClientsAgence(Collection<Client> listeClientsAgence) {
		this.listeClientsAgence = listeClientsAgence;
	}

	// constructeur
	public Agence() {
		// TODO Auto-generated constructor stub
	}

}
