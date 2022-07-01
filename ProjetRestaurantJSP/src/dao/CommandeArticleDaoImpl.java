package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.CommandeArticle;

public class CommandeArticleDaoImpl implements DaoCommandeArticle {

	public List<CommandeArticle> findAll() throws ClassNotFoundException, SQLException {
		ArrayList<CommandeArticle> liste = new ArrayList<CommandeArticle>();

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "select * from commande_articles";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		CommandeArticle p = null;
		while (rs.next()) {
			p = new CommandeArticle();
			p.setIdCommande(rs.getInt("idcommande"));
			p.setIdArticle(rs.getInt("idarticle"));
			p.setQuantite(rs.getInt("quantite"));
			liste.add(p);

		}

		conn.close();
		return liste;
	}

	public List<CommandeArticle> selectByName(String nom) {
		return null;
	}

	@Override
	public CommandeArticle findById(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "select * from commande_articles where id =" + id;
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		CommandeArticle p = null;
		while (rs.next()) {
			p = new CommandeArticle();
			p.setIdCommande(rs.getInt("idcommande"));
			p.setIdArticle(rs.getInt("idarticle"));
			p.setQuantite(rs.getInt("quantite"));

		}

		conn.close();
		return p;
	}

	@Override
	public void create(CommandeArticle obj) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "insert into commande_articles values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, obj.getIdCommande());
		ps.setInt(2, obj.getIdArticle());
		ps.setInt(3, obj.getQuantite());

		ps.executeUpdate();

		conn.close();
	}

	@Override
	public void update(CommandeArticle obj) throws ClassNotFoundException, SQLException {
	}

	@Override
	public void delete(CommandeArticle obj) throws ClassNotFoundException, SQLException {
	}

}
