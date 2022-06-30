package dao;

import java.sql.SQLException;
import java.util.List;

import model.Article;

public interface DaoArticle extends Dao<Article, Integer>
{

	public List<Article> selectByName(String nom) throws ClassNotFoundException, SQLException;
}
