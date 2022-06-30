package model;

public class Article {
	
	int ref;
	String nom;
	String description;
	int prix;
	String image;
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Article(int ref, String nom, String description, int prix, String image) {
		super();
		this.ref = ref;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.image = image;
	}
	public Article() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Article [ref=" + ref + ", nom=" + nom + ", description=" + description + ", prix=" + prix + ", image="
				+ image + "]";
	}
	
	

}
