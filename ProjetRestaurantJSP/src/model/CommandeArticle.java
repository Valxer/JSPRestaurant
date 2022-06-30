package model;

public class CommandeArticle {
	private int idCommande;
	private int idArticle;
	private int quantite;

	public CommandeArticle() {
		super();
	}

	public CommandeArticle(int idCommande, int idArticle, int quantite) {
		super();
		this.idCommande = idCommande;
		this.idArticle = idArticle;
		this.quantite = quantite;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "CommandeArticle [idCommande=" + idCommande + ", idArticle=" + idArticle + ", quantite=" + quantite
				+ "]";
	}

}
