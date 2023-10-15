package tp1;

public class test {
	public static void main(String[] args) {
		Fournisseur<produit> f = new Fournisseur<produit>("Fournisseur2", 2);
		produit p = new produit("dove", "ref2222", 2);
		f.ajouterProduit(p);
        f.ajouterProduit(new produit("B", "R2", 5.9));
        f.afficherProduits();
	}
	
	
}
