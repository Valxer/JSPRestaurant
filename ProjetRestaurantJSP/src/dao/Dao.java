package dao;

import java.util.List;

public interface Dao<T,PK> {
	public List<T> findAll() throws ClassNotFoundException, Exception;
	public T findById(PK id) throws ClassNotFoundException, Exception;
	public void create(T obj) throws ClassNotFoundException, Exception;
	public void update(T obj) throws ClassNotFoundException, Exception;
	public void delete(T obj) throws ClassNotFoundException, Exception;
}
