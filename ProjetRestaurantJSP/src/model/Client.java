package model;

public class Client {
	private int id;
	private String mdp;
	private String nom;
	private String prenom;
	private String adresse;
	
	public Client(){
		
	}
	
	public Client(int id, String mdp, String nom, String prenom, String adresse){
		this.id = id;
		this.mdp = mdp;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", mdp=" + mdp + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ "]";
	}
}
