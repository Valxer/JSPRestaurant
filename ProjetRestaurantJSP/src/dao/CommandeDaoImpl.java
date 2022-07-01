package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Commande;

public class CommandeDaoImpl implements DaoCommande {

	public List<Commande> findAll() throws ClassNotFoundException, SQLException {
		ArrayList<Commande> liste = new ArrayList<Commande>();

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "select * from Commandes";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		Commande p = null;
		while (rs.next()) {
			p = new Commande();
			p.setId(rs.getInt("id"));
			p.setIdclient(rs.getInt("idclient"));
			p.setDate(rs.getDate("date"));
			p.setTotal(rs.getInt("total"));
			liste.add(p);

		}

		conn.close();
		return liste;
	}

	public List<Commande> selectByName(String nom) {
		return null;
	}

	@Override
	public Commande findById(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "select * from commandes where id =" + id;
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		Commande p = null;
		while (rs.next()) {
			p = new Commande();
			p.setId(rs.getInt("id"));
			p.setIdclient(rs.getInt("idclient"));
			p.setDate(rs.getDate("date"));
			p.setTotal(rs.getInt("total"));

		}

		conn.close();
		return p;
	}

	@Override
	public void create(Commande obj) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "insert into commandes values(null,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, obj.getIdclient());
		ps.setDate(2, new Date(obj.getDate().getTime()));
		ps.setInt(3, obj.getTotal());

		ps.executeUpdate();

		conn.close();
	}

	public int createreturn(Commande obj) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "insert into commandes values(null,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.setInt(1, obj.getIdclient());
		ps.setDate(2, new Date(obj.getDate().getTime()));
		ps.setInt(3, obj.getTotal());

		ps.executeUpdate();
		ResultSet key = ps.getGeneratedKeys();
		if (key.next())
			return (key.getInt(1));
		conn.close();
		return 0;
	}

	public int getLastCommandeId(int clientId) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");
		String sql = "select id from commandes where idclient = " + clientId + " ORDER BY id DESC";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		int id = 0;
		if (rs.next())
			id = rs.getInt("id");

		conn.close();
		return id;
	}

	@Override
	public void update(Commande obj) throws ClassNotFoundException, SQLException {
	}

	@Override
	public void delete(Commande obj) throws ClassNotFoundException, SQLException {
	}

}
