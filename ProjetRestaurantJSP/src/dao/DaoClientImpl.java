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

<<<<<<< Updated upstream
		String sql = "insert into clients values(null,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c.getMdp());
		ps.setString(2, c.getNom());
		ps.setString(3, c.getPrenom());
		ps.setString(4, c.getAdresse());
=======
        String sql = "insert into clients values(null,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        //ps.setInt(1, c.getId());
        ps.setString(1, c.getMdp());
        ps.setString(2, c.getNom());
        ps.setString(3, c.getPrenom());
        ps.setString(4, c.getAdresse());
>>>>>>> Stashed changes

        ps.executeUpdate();

<<<<<<< Updated upstream
		conn.close();
	}
	
	public int IdCreate(Client c) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbrestau", "root", "root");

		String sql = "insert into clients values(null,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, c.getMdp());
		ps.setString(2, c.getNom());
		ps.setString(3, c.getPrenom());
		ps.setString(4, c.getAdresse());

		ps.executeUpdate();
		ResultSet key = ps.getGeneratedKeys();
			
		if (key.next())
			return (key.getInt(1));

		conn.close();
		return 0;
	}
=======
        conn.close();
    }
>>>>>>> Stashed changes

	@Override
	public void update(Client obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Client obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

}
