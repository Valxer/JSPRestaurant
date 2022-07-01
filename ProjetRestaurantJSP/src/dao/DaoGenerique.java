package dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DaoGenerique<T, K> {
	public ArrayList<T> findAll() throws ClassNotFoundException, SQLException;
	public T findById(K id) throws ClassNotFoundException, SQLException;
	public void create(T obj) throws ClassNotFoundException, SQLException;
	public void update(T obj) throws ClassNotFoundException, SQLException;
	public void delete(T obj) throws ClassNotFoundException, SQLException;
}
