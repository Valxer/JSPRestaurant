package lst;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dao.ArticleDaoImpl;
import model.Article;

/**
 * Application Lifecycle Listener implementation class ArticlesList
 *
 */
@WebListener
public class ArticlesList implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ArticlesList() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         List<Article> articles = new ArrayList<>();
         try {
			articles = new ArticleDaoImpl().findAll();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         arg0.getServletContext().setAttribute("articles", articles);
    }
	
}
