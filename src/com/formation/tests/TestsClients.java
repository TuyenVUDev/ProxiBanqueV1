package com.formation.tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.formation.domaine.Client;
import com.formation.domaine.ClientEntreprise;
import com.formation.domaine.ClientFortune;
import com.formation.domaine.ClientNormal;
import com.formation.domaine.Compte;
import com.formation.domaine.CompteCourant;
import com.formation.domaine.ComptePlacement;
import com.formation.domaine.CompteEpargne;
import com.formation.domaine.CompteFortune;
import com.formation.domaine.Conseiller;
import com.formation.domaine.Credit;
import com.formation.domaine.Transaction;
import java.util.Random;

public class TestsClients {

	//Liste de comptes utilisés pour les tests
	CompteFortune compteRiche = new CompteFortune(600000, 3000524, "260504", 1538);
	CompteFortune comptenormal = new CompteFortune(10000, 515, "100533", 111);
	CompteCourant comptenormal2 = new CompteCourant(15000, 515, "100533", 111);
	CompteEpargne compteEpargne = new CompteEpargne(10000, 515, "100533", 111);
	
	
	boolean bol = TestsProxybanque.creerClientTestBool("Alexandre","Piccini","Val Fontaine",69290,"Lyon",comptenormal,comptenormal2, "clientNormal");
	boolean bol2 = TestsProxybanque.creerClientTestBool("Alexandre","Piccini","Val Fontaine",69290,"Lyon",comptenormal,comptenormal2, "clientFortune");
	boolean bol3 = TestsProxybanque.creerClientTestBool("Alexandre","Piccini","Val Fontaine",69290,"Lyon",comptenormal,compteRiche, "clientEntreprise");
	boolean bol4 = TestsProxybanque.creerClientTestBool("Alexandre","Piccini","Val Fontaine",69290,"Lyon",comptenormal,comptenormal, "jajaja");

	
	//public boolean creerClientTestBool(String nom, String prenom, String adresse, int codePostal, String ville,
	//Compte compte1,Compte compte2, String typeClient)
@Test
public void compteFortuneBoolean() {
	assertTrue("Test Si renvoie un true", bol == true);
}

@Test
public void compteNormalBoolean() {
	assertTrue("Test Si renvoie un true", bol2 == true);
}

@Test
public void compteEpargneeBoolean() {
	assertTrue("Test Si renvoie un true", bol3 == true);
}

@Test //Le temoin negatif
public void ClientBooleanFauxNegatif() {
	assertFalse("Test Si renvoie un false", bol4 == true);
}
// Les 4 tests sont positifs ce qui signifie que même le faux positif est valide, on ne peut pas créer n'importe quoi!

}
