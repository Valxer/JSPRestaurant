package model;

public class Achat {
	String nomart;
	int Idarticle;
	int quantite;
	int total;


	public String getNomart() {
		return nomart;
	}
	public void setNomart(String nomart) {
		this.nomart = nomart;
	}
	public Achat(String nomart, int idarticle, int quantite, int total) {
		super();
		this.nomart = nomart;
		Idarticle = idarticle;
		this.quantite = quantite;
		this.total = total;
	}
	public Achat() {
		super();
	}
	public int getIdarticle() {
		return Idarticle;
	}
	public void setIdarticle(int idarticle) {
		Idarticle = idarticle;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Achat [nomart=" + nomart + ", Idarticle=" + Idarticle + ", quantite=" + quantite + ", total=" + total
				+ "]";
	}
	
	
	
}
