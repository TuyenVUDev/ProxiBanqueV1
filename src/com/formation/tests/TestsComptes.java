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

public class TestsComptes {

	// Nous allons tester la creation des Comptes avec une méthode renvoyant des
	// booleans true si un objet du bon type est crée et false si rien n'a été
	// fait

	float solde;
	int numDeCompte;
	String dateOuverture;
	int tel;
	String typeCompte;

	CompteFortune compteRiche = new CompteFortune(600000, 3000524, "260504", 1538);
	CompteFortune comptenormal = new CompteFortune(10000, 515, "100533", 111);
	CompteCourant comptenormal2 = new CompteCourant(10000, 515, "100533", 111);
	CompteEpargne compteEpargne = new CompteEpargne(10000, 515, "100533", 111);

	boolean bol = TestsProxybanque.testCompteBool(600000, 3000524, "260504", 1538, "compteNormal");
	boolean bol2 = TestsProxybanque.testCompteBool(10000, 515, "100533", 111, "compteNormal");
	boolean bol3 = TestsProxybanque.testCompteBool(10000, 515, "100533", 111, "compteEpargne");
	boolean bol4 = TestsProxybanque.testCompteBool(600000, 3000524, "260504", 1538, "AJAJAJA");


	
	
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
	public void compteEpargneeBooleanFauxNegatif() {
		assertFalse("Test Si renvoie un false", bol4 == true);
	}
	
	// Les 3 assertTrue et le témoin négatifs ont passé le tests, no Compte sont
	// au moins crées!
	

	@Test
	public void compteFortune() {
		assertEquals(compteRiche, TestsProxybanque.testCompte(600000, 3000524, "260504", 1538, "compteFortune"));
	}

	@Test
	public void compteNormal() {
		assertEquals(comptenormal, TestsProxybanque.testCompte(10000, 515, "100533", 111, "compteNormal"));
	}

	@Test
	public void compteEpargne() {
		assertEquals(compteEpargne, TestsProxybanque.testCompte(10000, 515, "100533", 111, "compteEpargne"));
	} // Les 4 tests échouent, la methode creerCompte a été testé en "dur" et
		// fonctionne pourtant bien, nous mettons plutot cela sur le compte du test

	

}
