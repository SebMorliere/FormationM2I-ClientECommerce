package com.M2I.ecommerce.beans;

import java.util.Date;

public class Produit {
	public String idProduit;
	public String nom;
	public String description;
	public Float prixUnitaire;
	public Integer promo;
	public String descriptionPromo;
	public Boolean statut;
	public Integer stockMagasin;
	public Integer stockHangar;
	public Date dateDispo;
	public String etat;
	public String couleur;
	public String garantie;
	public String image;

	@Override
	public String toString() {
		return "{idProduit = " + idProduit + "\nnom = " + nom + "\ndescription = " + description + "\nP.U.="
				+ prixUnitaire + "}";
	}
}
