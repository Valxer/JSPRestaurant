package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Client;

public class DaoClientImpl implements DaoClient{

	@Override
	public ArrayList<Client> findAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findById(Integer id) throws ClassNotFoundException, SQLException {
		Client c = null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "select * from clients where id=" + id;
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			c = new Client();
			c.setId(rs.getInt("id"));
			c.setMdp(rs.getString("pass"));
			c.setNom(rs.getString("nom"));
			c.setPrenom(rs.getString("prenom"));
			c.setAdresse(rs.getString("adresse"));
		}
		conn.close();
		return c;
	}

	@Override
	public void create(Client c) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "insert into clients values(?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, c.getId());
		ps.setString(2, c.getMdp());
		ps.setString(3, c.getNom());
		ps.setString(4, c.getPrenom());
		ps.setString(5, c.getAdresse());

		ps.executeUpdate();

		conn.close();
	}

	@Override
	public void update(Client obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Client obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

}
