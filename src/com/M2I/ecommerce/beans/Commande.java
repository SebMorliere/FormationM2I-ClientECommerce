package com.M2I.ecommerce.beans;

import java.util.Date;

public class Commande {
	public String idCommande;
	public Date dateCreation;
	public Date datePaiement;
	public Date dateLivraison;
	public Date dateCloture;
	public Float total;
	public Boolean statut;
	public Client client;
}
