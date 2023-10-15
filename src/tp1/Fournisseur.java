package tp1;

import java.util.ArrayList;
import java.util.List;

public class Fournisseur<T>  {
	private String nom;
    private int id;
    private List<T> produits;
    public Fournisseur(String nom, int id) {
        this.nom = nom;
        this.id = id;
        this.produits = new ArrayList<>();}
    
    public String getNom(String nom) {
    	return nom;
    }
    public int getId(int id) {
    	return id;
    }
    public T getProduit(T produits) {
    	
    	return produits;
    }
    
        
        public void ajouterProduit(T produit) {
            produits.add(produit);
        }

        public void afficherProduits() {
        	  System.out.println("Produits du fournisseur " + nom + " (ID: " + id + "):");
        	    for (int i = 0; i < produits.size(); i++) {
        	        T produit = produits.get(i);
        	        System.out.println(produit.toString());
        	    }
        	}


        
        
        
}
