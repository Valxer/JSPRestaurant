package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Article;

public class ArticleDaoImpl implements DaoArticle {

	public void delete(Article p) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "delete from Articles where id= " + p.getRef();

		Statement st = conn.createStatement();
		st.executeUpdate(sql);

		conn.close();

	}

	public void update(Article p) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "update Articles set nom='" + p.getNom() + "',description='" + p.getDescription() + "',prix="
				+ p.getPrix() + "',image=" + p.getImage() + " where id=" + p.getRef();
		Statement st = conn.createStatement();
		st.executeUpdate(sql);

		conn.close();
	}

	public void create(Article p) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "insert into Articles values(?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, p.getRef());
		ps.setString(2, p.getNom());
		ps.setString(3, p.getDescription());
		ps.setInt(4, p.getPrix());
		ps.setString(5, p.getImage());

		ps.executeUpdate();

		conn.close();
	}

	public List<Article> findAll() throws ClassNotFoundException, SQLException {
		ArrayList<Article> liste = new ArrayList<Article>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "select * from articles";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		Article a = null;
		while (rs.next()) {
			a = new Article();
			a.setRef(rs.getInt("ref"));
			a.setNom(rs.getString("nom"));
			a.setDescription(rs.getString("description"));
			a.setPrix(rs.getInt("prix"));
			a.setImage(rs.getString("image"));
			liste.add(a);

		}

		conn.close();
		return liste;
	}

	public Article findById(Integer ref) throws ClassNotFoundException, SQLException {
		Article a = null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "select * from Articles where ref=" + ref;
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			a = new Article();
			a.setRef(rs.getInt("ref"));
			a.setNom(rs.getString("nom"));
			a.setDescription(rs.getString("description"));
			a.setPrix(rs.getInt("prix"));
			a.setImage(rs.getString("image"));
		}
		conn.close();
		return a;
	}

	public List<Article> selectByName(String nom) throws ClassNotFoundException, SQLException {
		List<Article> articles = new ArrayList<Article>();
		Article a = null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");
		String sql = "select * from Articles where nom like '" + nom+"'";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			a = new Article();
			a.setRef(rs.getInt("ref"));
			a.setNom(rs.getString("nom"));
			a.setDescription(rs.getString("description"));
			a.setPrix(rs.getInt("prix"));
			a.setImage(rs.getString("image"));
			articles.add(a);
		}
		conn.close();
		return articles;
	}

}
