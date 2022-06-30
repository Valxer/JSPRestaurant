package model;

import java.util.Date;

public class Commande {
	private int id;
	private int idclient;
	private Date date;
	private int total;

	public Commande() {
		super();
	}

	public Commande(int idclient, Date date, int total) {
		super();
		this.idclient = idclient;
		this.date = date;
		this.total = total;
	}

	public Commande(int id, int idclient, Date date, int total) {
		super();
		this.id = id;
		this.idclient = idclient;
		this.date = date;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdclient() {
		return idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", idclient=" + idclient + ", date=" + date + ", total=" + total + "]";
	}

}
